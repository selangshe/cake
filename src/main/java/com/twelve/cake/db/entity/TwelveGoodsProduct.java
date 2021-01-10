package com.twelve.cake.db.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品货品表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveGoodsProduct对象", description="商品货品表")
public class TwelveGoodsProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品表的商品ID")
    private Integer goodsId;

    @ApiModelProperty(value = "商品规格值列表，采用JSON数组格式")
    private String specifications;

    @ApiModelProperty(value = "商品货品价格")
    private BigDecimal price;

    @ApiModelProperty(value = "商品货品数量")
    private Integer number;

    @ApiModelProperty(value = "商品货品图片")
    private String url;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String GOODS_ID = "goods_id";

    public static final String SPECIFICATIONS = "specifications";

    public static final String PRICE = "price";

    public static final String NUMBER = "number";

    public static final String URL = "url";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
