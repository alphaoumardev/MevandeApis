package com.mev.cloud.user.service;

import com.mev.cloud.api.user.vo.UserApiVO;
import com.mev.cloud.common.database.dto.PageDTO;
import com.mev.cloud.common.database.vo.PageVO;
import com.mev.cloud.user.dto.UserRegisterDTO;
import com.mev.cloud.user.model.User;

import java.util.List;

/**
 * 用户表
 *
 * @author Alphaoumardev
 * @date 2020-12-08 11:18:04
 */
public interface UserService {

	/**
	 * 分页获取用户表列表
	 * @param pageDTO 分页参数
	 * @return 用户表列表分页数据
	 */
	PageVO<UserApiVO> page(PageDTO pageDTO);

	/**
	 * 根据用户表id获取用户表
	 *
	 * @param userId 用户表id
	 * @return 用户表
	 */
	UserApiVO getByUserId(Long userId);

	/**
	 * 更新用户表
	 * @param user 用户表
	 */
	void update(User user);

	/**
	 * 根据用户id列表，获取用户信息
	 * @param userIds
	 * @return
	 */
	List<UserApiVO> getUserByUserIds(List<Long> userIds);

	/**
	 * 保存用户
	 * @param param 注册信息
	 * @return uid
	 */
    Long save(UserRegisterDTO param);
}
