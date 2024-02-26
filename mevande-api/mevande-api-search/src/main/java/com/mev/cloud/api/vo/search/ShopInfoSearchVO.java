package com.mev.cloud.api.vo.search;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mev.cloud.common.serializer.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/11/17
 */
@Setter
@Getter
public class ShopInfoSearchVO
{

    @Schema(description = "店铺名称 搜索华为的时候，可以把华为的旗舰店搜索出来" )
    private String shopName;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "店铺logo" )
    @JsonSerialize(using =ImgJsonSerializer.class)
    private String shopLogo;

    @Schema(description = "店铺类型1自营店 2普通店" )
    private Integer type;

    @Override
    public String toString() {
        return "ShopInfoSearchVO{" +
                "shopName='" + shopName + '\'' +
                ", shopId=" + shopId +
                ", type=" + type +
                ", shopLogo='" + shopLogo + '\'' +
                '}';
    }
}
