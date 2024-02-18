package com.mev.cloud.auth.controller;

import com.mev.cloud.api.auth.bo.UserInfoInTokenBO;
import com.mev.cloud.api.auth.vo.TokenInfoVO;
import com.mev.cloud.auth.dto.UpdatePasswordDTO;
import com.mev.cloud.auth.manager.TokenStore;
import com.mev.cloud.auth.model.AuthAccount;
import com.mev.cloud.auth.service.AuthAccountService;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.common.security.AuthUserContext;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

/**
 * @author Alphaoumardev
 * @date 2021/01/29
 */
@RestController
@Tag(name = "密码")
public class PasswordController {

	@Autowired
	private TokenStore tokenStore;

	@Autowired
	private AuthAccountService authAccountService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@PutMapping("/update_password")
	@Operation(summary = "更新密码" , description = "更新当前用户的密码, 更新密码之后要退出登录，清理token")
	public ServerResponseEntity<TokenInfoVO> updatePassword(@Valid @RequestBody UpdatePasswordDTO updatePasswordDTO) {
		UserInfoInTokenBO userInfoInToken = AuthUserContext.get();
		AuthAccount authAccount = authAccountService.getByUserIdAndType(userInfoInToken.getUserId(), userInfoInToken.getSysType());
		if (!passwordEncoder.matches(updatePasswordDTO.getOldPassword(), authAccount.getPassword())) {
			return ServerResponseEntity.showFailMsg("旧密码不正确");
		}
		authAccountService.updatePassword(userInfoInToken.getUserId(), userInfoInToken.getSysType(), updatePasswordDTO.getNewPassword());
		tokenStore.deleteAllToken(userInfoInToken.getSysType().toString(), userInfoInToken.getUid());
		return ServerResponseEntity.success();
	}


}
