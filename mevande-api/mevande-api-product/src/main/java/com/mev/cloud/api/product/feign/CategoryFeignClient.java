package com.mev.cloud.api.product.feign;

import com.mev.cloud.api.product.vo.CategoryVO;
import com.mev.cloud.common.feign.FeignInsideAuthConfig;
import com.mev.cloud.common.response.ServerResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author lhd
 * @date 2020/12/23
 */
@FeignClient(value = "mevande-product",contextId = "category")
public interface CategoryFeignClient {

    /**
     * 获取所有一级分类信息
     * @return 一级分类信息
     */
    @GetMapping(value = FeignInsideAuthConfig.FEIGN_INSIDE_URL_PREFIX + "/category/listByOneLevel")
    ServerResponseEntity<List<CategoryVO>> listByOneLevel();

    /**
     * 根据上级id，获取子分类id列表
     * @param categoryId
     * @return
     */
    @GetMapping(value = FeignInsideAuthConfig.FEIGN_INSIDE_URL_PREFIX + "/insider/category/listCategoryId")
    ServerResponseEntity<List<Long>> listCategoryId(@RequestParam("categoryId") Long categoryId);
}
