package com.mev.cloud.product.service;

import com.mev.cloud.product.dto.CategoryDTO;

/**
 * 分类信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
public interface CategoryAndSpuService {
	/**
	 * 分类的启用和禁用
	 * @param categoryDTO
	 * @return
	 */
    Boolean categoryEnableOrDisable(CategoryDTO categoryDTO);

}
