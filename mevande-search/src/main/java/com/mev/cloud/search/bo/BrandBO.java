package com.mev.cloud.search.bo;

import cn.throwx.canal.gule.annotation.CanalModel;
import cn.throwx.canal.gule.common.FieldNamingPolicy;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 品牌信息
 *
 * @author Alphaoumardev
 * @date 2020-12-23 15:27:24
 */
@Setter
@Getter
@ToString
@CanalModel(database = "mevande_product", table = "brand", fieldNamingPolicy = FieldNamingPolicy.LOWER_UNDERSCORE)
public class BrandBO {
    /**
     * brand_id
     */
    private Long brandId;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌描述
     */
    private String desc;

    /**
     * 品牌logo图片
     */
    private String imgUrl;
}
