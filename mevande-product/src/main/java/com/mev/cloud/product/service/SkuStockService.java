package com.mev.cloud.product.service;

import com.mev.cloud.product.dto.SkuDTO;
import com.mev.cloud.product.model.SkuStock;
import com.mev.cloud.product.vo.SkuStockVO;
import com.mev.cloud.api.product.vo.SkuVO;

import java.util.List;

/**
 * 库存信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
public interface SkuStockService {

	/**
	 * 保存库存信息
	 * @param skuStock 库存信息
	 */
	void save(SkuStock skuStock);

	/**
	 * 更新库存信息
	 * @param skuStock 库存信息
	 */
	void update(SkuStock skuStock);

	/**
	 * 根据库存信息id删除库存信息
	 * @param stockId
	 */
	void deleteById(Long stockId);

	/**
	 * 批量保存库存信息
	 * @param skuStocks 库存信息
	 */
	void saveBatch(List<SkuStock> skuStocks);

	/**
	 * 根据skuIds删除库存信息
	 * @param skuIds ids
	 */
	void deleteBySkuIds(List<Long> skuIds);

	/**
	 * 根据sku列表获取库存信息
	 * @param skuVOList sku列表
	 * @return 库存信息
	 */
	List<SkuStockVO> listBySkuList(List<SkuVO> skuVOList);

	/**
	 * 批量更新sku库存信息
	 * @param skuList
	 */
	void updateBatch(List<SkuDTO> skuList);
}
