package com.mev.cloud.multishop.controller.admin;

import com.mev.cloud.multishop.model.HotSearch;
import com.mev.cloud.multishop.service.HotSearchService;
import com.mev.cloud.multishop.vo.HotSearchVO;
import com.mev.cloud.multishop.dto.HotSearchDTO;

import com.mev.cloud.common.database.dto.PageDTO;
import com.mev.cloud.common.database.vo.PageVO;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.common.security.AuthUserContext;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import com.mev.cloud.common.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

/**
 * 热搜
 *
 * @author Alphaoumardev
 * @date 2021-01-27 09:10:00
 */
@RestController("adminHotSearchController")
@RequestMapping("/admin/hot_search")
@Tag(name = "admin-热搜")
public class HotSearchController {

    @Autowired
    private HotSearchService hotSearchService;



	@GetMapping("/page")
	@Operation(summary = "分页获取热搜列表" , description = "分页获取热搜列表")
	public ServerResponseEntity<PageVO<HotSearchVO>> page(@Valid PageDTO pageDTO, HotSearchDTO hotSearchDTO) {
	    hotSearchDTO.setShopId(AuthUserContext.get().getTenantId());
		PageVO<HotSearchVO> hotSearchPage = hotSearchService.page(pageDTO, hotSearchDTO);
		return ServerResponseEntity.success(hotSearchPage);
	}

	@GetMapping
    @Operation(summary = "获取热搜" , description = "根据hotSearchId获取热搜")
    public ServerResponseEntity<HotSearchVO> getByHotSearchId(@RequestParam Long hotSearchId) {
        return ServerResponseEntity.success(hotSearchService.getByHotSearchId(hotSearchId));
    }

    @PostMapping
    @Operation(summary = "保存热搜" , description = "保存热搜")
    public ServerResponseEntity<Void> save(@Valid @RequestBody HotSearchDTO hotSearchDTO) {
        HotSearch hotSearch = BeanUtil.map(hotSearchDTO, HotSearch.class);
        hotSearch.setShopId(AuthUserContext.get().getTenantId());
        hotSearchService.save(hotSearch);
        hotSearchService.removeHotSearchListCache(hotSearch.getShopId());
        return ServerResponseEntity.success();
    }

    @PutMapping
    @Operation(summary = "更新热搜" , description = "更新热搜")
    public ServerResponseEntity<Void> update(@Valid @RequestBody HotSearchDTO hotSearchDTO) {
        HotSearch hotSearch = BeanUtil.map(hotSearchDTO, HotSearch.class);
        hotSearch.setShopId(AuthUserContext.get().getTenantId());
        hotSearchService.update(hotSearch);
        hotSearchService.removeHotSearchListCache(hotSearch.getShopId());
        return ServerResponseEntity.success();
    }

    @DeleteMapping
    @Operation(summary = "删除热搜" , description = "根据热搜id删除热搜")
    public ServerResponseEntity<Void> delete(@RequestParam Long hotSearchId) {
        Long shopId = AuthUserContext.get().getTenantId();
        hotSearchService.deleteById(hotSearchId, shopId);
        hotSearchService.removeHotSearchListCache(shopId);
        return ServerResponseEntity.success();
    }
}
