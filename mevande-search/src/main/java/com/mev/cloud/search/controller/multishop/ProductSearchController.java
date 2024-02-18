package com.mev.cloud.search.controller.multishop;

import com.mev.cloud.api.dto.EsPageDTO;
import com.mev.cloud.api.dto.ProductSearchDTO;
import com.mev.cloud.api.vo.EsPageVO;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.common.security.AuthUserContext;
import com.mev.cloud.search.constant.SearchTypeEnum;
import com.mev.cloud.search.manager.ProductSearchManager;
import com.mev.cloud.search.vo.SpuAdminVO;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

/**
 * @author Alphaoumardev
 * @Date 2021/6/21 10:36
 */
@RestController("multishopSearchSpuController")
@RequestMapping("/m/search")
@Tag(name = "multishop-spu管理列表接口")
public class ProductSearchController {

    @Autowired
    private ProductSearchManager productSearchManager;

    @GetMapping("/page")
    @Operation(summary = "商品信息列表" , description = "商品信息列表")
    public ServerResponseEntity<EsPageVO<SpuAdminVO>> page(@Valid EsPageDTO pageDTO, ProductSearchDTO productSearchDTO) {
        Long shopId = AuthUserContext.get().getTenantId();
        productSearchDTO.setSearchType(SearchTypeEnum.MULTISHOP.value());
        productSearchDTO.setShopId(shopId);
        EsPageVO<SpuAdminVO> searchPage =  productSearchManager.adminPage(pageDTO, productSearchDTO);
        return ServerResponseEntity.success(searchPage);
    }

}
