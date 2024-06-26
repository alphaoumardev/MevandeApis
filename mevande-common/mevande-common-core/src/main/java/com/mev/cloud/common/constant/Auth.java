package com.mev.cloud.common.constant;

import com.mev.cloud.common.feign.FeignInsideAuthConfig;

/**
 * @author Alphaoumardev
 * @date 2020/12/8
 */
public interface Auth {

    String CHECK_TOKEN_URI = FeignInsideAuthConfig.FEIGN_INSIDE_URL_PREFIX + "/token/checkToken";

    String CHECK_RBAC_URI = FeignInsideAuthConfig.FEIGN_INSIDE_URL_PREFIX + "/insider/permission/checkPermission";
}
