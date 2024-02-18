package com.mev.cloud.rbac.service.impl;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import com.mev.cloud.rbac.mapper.UserRoleMapper;
import com.mev.cloud.rbac.service.UserRoleService;

/**
 * @author Alphaoumardev
 * @date 2020/6/23
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Resource
	private UserRoleMapper userRoleMapper;

}
