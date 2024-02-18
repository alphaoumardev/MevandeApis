package com.mev.cloud.platform.feign;

import com.mev.cloud.api.platform.feign.ConfigFeignClient;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.platform.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alphaoumardev
 * @date 2020/12/30
 */
@RestController
public class ConfigFeignController implements ConfigFeignClient {

    @Autowired
    private SysConfigService sysConfigService;

    @Override
    public ServerResponseEntity<String> getConfig(String key) {
        return ServerResponseEntity.success(sysConfigService.getValue(key));
    }
}
