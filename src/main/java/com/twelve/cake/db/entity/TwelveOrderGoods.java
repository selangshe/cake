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
 * 订单商品表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveOrderGoods对象", description="订单商品表")
public class TwelveOrderGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单表的订单ID")
    private Integer orderId;

    @ApiModelProperty(value = "商品表的商品ID")
    private Integer goodsId;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "商品编号")
    private String goodsSn;

    @ApiModelProperty(value = "商品货品表的货品ID")
    private Integer productId;

    @ApiModelProperty(value = "商品货品的购买数量")
    private Integer number;

    @ApiModelProperty(value = "商品货品的售价")
    private BigDecimal price;

    @ApiModelProperty(value = "商品货品的规格列表")
    private String specifications;

    @ApiModelProperty(value = "商品货品图片或者商品图片")
    private String picUrl;

    @ApiModelProperty(value = "订单商品评论，如果是-1，则超期不能评价；如果是0，则可以评价；如果其他值，则是comment表里面的评论ID。")
    private Integer comment;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String ORDER_ID = "order_id";

    public static final String GOODS_ID = "goods_id";

    public static final String GOODS_NAME = "goods_name";

    public static final String GOODS_SN = "goods_sn";

    public static final String PRODUCT_ID = "product_id";

    public static final String NUMBER = "number";

    public static final String PRICE = "price";

    public static final String SPECIFICATIONS = "specifications";

    public static final String PIC_URL = "pic_url";

    public static final String COMMENT = "comment";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
