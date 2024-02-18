package com.mev.cloud.rbac.service.impl;

import com.mev.cloud.rbac.service.RoleMenuService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mev.cloud.rbac.mapper.RoleMenuMapper;

/**
 * @author Alphaoumardev
 * @date 2020/6/23
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {

	@Resource
	private RoleMenuMapper roleMenuMapper;

}
