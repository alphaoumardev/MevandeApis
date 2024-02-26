package com.mev.cloud.multishop.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mev.cloud.api.vo.search.SpuSearchVO;
import com.mev.cloud.common.serializer.ImgJsonSerializer;
import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 店铺详情VO
 *
 * @author Alphaoumardev
 * @date 2020-12-05 15:50:25
 */
@Getter
@Setter
public class ShopDetailAppVO extends BaseVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "店铺类型1自营店 2普通店" )
    private Integer type;

    @Schema(description = "店铺名称" )
    private String shopName;

    @Schema(description = "店铺简介" )
    private String intro;

    @Schema(description = "店铺logo(可修改)" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String shopLogo;

    @Schema(description = "店铺状态(-1:未开通 0: 停业中 1:营业中)" )
    private Integer shopStatus;

    @Schema(description = "营业执照" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String businessLicense;

    @Schema(description = "身份证正面" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String identityCardFront;

    @Schema(description = "身份证反面" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String identityCardLater;

    @Schema(description = "商品列表" )
    private List<SpuSearchVO> spuList;

	@Override
    public String toString() {
        return "ShopDetailAppVO{" +
                "shopId=" + shopId +
                ", type=" + type +
                ", shopName='" + shopName + '\'' +
                ", intro='" + intro + '\'' +
                ", shopLogo='" + shopLogo + '\'' +
                ", shopStatus=" + shopStatus +
                ", businessLicense='" + businessLicense + '\'' +
                ", identityCardFront='" + identityCardFront + '\'' +
                ", identityCardLater='" + identityCardLater + '\'' +
                ", spuList=" + spuList +
                '}';
    }
}
