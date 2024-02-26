package com.mev.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * spu信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class SpuPageSearchDTO
{

	@Schema(description = "spuId" )
	private Long spuId;

	@Schema(description = "品牌ID" )
	private Long brandId;

	@Schema(description = "分类ID" )
	private Long categoryId;

	@Schema(description = "spu名称" )
	private String name;

	@Schema(description = "状态 1:enable, 0:disable, -1:deleted" )
	private Integer status;

	@Schema(description = "spuId列表(商品上下架：批量操作时，用此参数)(批量处理参数)" )
	private List<Long> spuIds;

	@Schema(description = "商品状态： 0.全部  1.销售中  2.已售罄  3.已下架 " )
	private Integer spuStatus;

	@Schema(description = "最低价" )
	private Long minPrice;

	@Schema(description = "最高价" )
	private Long maxPrice;

	@Schema(description = "最低销量" )
	private Long minSaleNum;

	@Schema(description = "最高销量" )
	private Long maxSaleNum;

	@Schema(description = "商品编码" )
	private String partyCode;

	@Schema(description = "当前价排序 0：倒序 1：顺序" )
	private Integer priceFeeSort;

	@Schema(description = "市场价排序 0：倒序 1：顺序" )
	private Integer marketPriceFeeSort;

	@Schema(description = "销量排序 0：倒序 1：顺序" )
	private Integer saleNumSort;

	@Schema(description = "库存排序 0：倒序 1：顺序" )
	private Integer stockSort;

	@Schema(description = "序号排序 0：倒序 1：顺序" )
	private Integer seqSort;

	@Schema(description = "创建时间排序 0：倒序 1：顺序" )
	private Integer createTimeSort;

}
