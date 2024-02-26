package com.mev.cloud.order.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mev.cloud.common.serializer.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 */
@Setter
@Getter
@Schema(description = "我的订单-订单项")
public class MyOrderItemVO
{
    @Schema(description = "商品图片" , requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonSerialize(using = ImgJsonSerializer.class)
    private String pic;

    @Schema(description = "商品名称" , requiredMode = Schema.RequiredMode.REQUIRED)
    private String spuName;

    @Schema(description = "订单号" ,requiredMode = Schema.RequiredMode.REQUIRED)
    private Long orderId;

    @Schema(description = "商品数量" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer count;

    @Schema(description = "商品价格" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long price;

    @Schema(description = "skuId" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long skuId;

    @Schema(description = "skuName" , requiredMode = Schema.RequiredMode.REQUIRED)
    private String skuName;

    @Schema(description = "订单项id" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long orderItemId;

    @Schema(description = "商品id" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long spuId;

    @Override
    public String toString() {
        return "MyOrderItemVO{" +
                "pic='" + pic + '\'' +
                ", spuName='" + spuName + '\'' +
                ", orderId=" + orderId +
                ", count=" + count +
                ", price=" + price +
                ", skuId=" + skuId +
                ", skuName='" + skuName + '\'' +
                ", orderItemId=" + orderItemId +
                ", spuId=" + spuId +
                '}';
    }
}
