package com.mev.cloud.api.platform.feign;

import com.mev.cloud.common.feign.FeignInsideAuthConfig;
import com.mev.cloud.common.response.ServerResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Alphaoumardev
 * @date 2020/11/23
 */
@FeignClient(value = "mevande-platform",contextId = "config")
public interface ConfigFeignClient {


    /**
     * 获取配置信息
     * @param key key
     * @return 配置信息json
     */
    @GetMapping(value = FeignInsideAuthConfig.FEIGN_INSIDE_URL_PREFIX + "/insider/config/getConfig")
    ServerResponseEntity<String> getConfig(@RequestParam("key") String key);

}
