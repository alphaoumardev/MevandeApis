package com.mev.cloud.platform.service.impl;

import com.mev.cloud.platform.model.SysUser;
import com.mev.cloud.platform.vo.SysUserVO;
import com.mev.cloud.platform.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.cache.annotation.Cacheable;
import com.mev.cloud.api.auth.feign.AccountFeignClient;
import com.mev.cloud.api.rbac.dto.UserRoleDTO;
import com.mev.cloud.api.rbac.feign.UserRoleFeignClient;
import com.mev.cloud.common.cache.constant.CacheNames;
import com.mev.cloud.common.database.dto.PageDTO;
import com.mev.cloud.common.database.util.PageUtil;
import com.mev.cloud.common.database.vo.PageVO;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.platform.mapper.SysUserMapper;
import com.mev.cloud.platform.vo.SysUserSimpleVO;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lhd
 * @date 2020/12/22
 */
@Service
public class SysUserServiceImpl implements SysUserService
{

	@Resource
	private SysUserMapper sysUserMapper;
	private final AccountFeignClient accountFeignClient;
	private final UserRoleFeignClient userRoleFeignClient;

    public SysUserServiceImpl(AccountFeignClient accountFeignClient, UserRoleFeignClient userRoleFeignClient)
	{
        this.accountFeignClient = accountFeignClient;
        this.userRoleFeignClient = userRoleFeignClient;
    }


    @Override
	@Cacheable(cacheNames = CacheNames.PLATFORM_SIMPLE_INFO_KEY, key = "#userId")
	public SysUserSimpleVO getSimpleByUserId(Long userId) {
		return sysUserMapper.getSimpleByUserId(userId);
	}

	@Override
	public PageVO<SysUserVO> pageByShopId(PageDTO pageDTO, Long shopId, String nickName) {
		return PageUtil.doPage(pageDTO, () -> sysUserMapper.listByShopId(shopId, nickName));
	}

	@Override
	public SysUserVO getByUserId(Long userId) {
		SysUserVO sysUser = sysUserMapper.getByUserId(userId);
		ServerResponseEntity<List<Long>> roleIds = userRoleFeignClient.getRoleIds(sysUser.getSysUserId());
		sysUser.setRoleIds(roleIds.getData());
		return sysUser;
	}

    @Override
	@GlobalTransactional(rollbackFor = Exception.class)
	@Transactional(rollbackFor = Exception.class)
    public void save(SysUser sysUser, List<Long> roleIds) {
		UserRoleDTO userRoleDTO = new UserRoleDTO();
		userRoleDTO.setRoleIds(roleIds);
		sysUserMapper.save(sysUser);
		userRoleDTO.setUserId(sysUser.getSysUserId());
		userRoleFeignClient.saveByUserIdAndSysType(userRoleDTO);
	}

	@Override
	@GlobalTransactional(rollbackFor = Exception.class)
	@Transactional(rollbackFor = Exception.class)
	@CacheEvict(cacheNames = CacheNames.PLATFORM_SIMPLE_INFO_KEY, key = "#sysUser.sysUserId")
	public void update(SysUser sysUser, List<Long> roleIds) {
		UserRoleDTO userRoleDTO = new UserRoleDTO();
		userRoleDTO.setRoleIds(roleIds);
		userRoleDTO.setUserId(sysUser.getSysUserId());
		sysUserMapper.update(sysUser);
		userRoleFeignClient.updateByUserIdAndSysType(userRoleDTO);
	}

	@Override
	@GlobalTransactional(rollbackFor = Exception.class)
	@Transactional(rollbackFor = Exception.class)
	@CacheEvict(cacheNames = CacheNames.PLATFORM_SIMPLE_INFO_KEY, key = "#sysUserId")
	public void deleteById(Long sysUserId) {
		accountFeignClient.deleteByUserIdAndSysType(sysUserId);
		userRoleFeignClient.deleteByUserIdAndSysType(sysUserId);
		sysUserMapper.deleteById(sysUserId);
	}

}
