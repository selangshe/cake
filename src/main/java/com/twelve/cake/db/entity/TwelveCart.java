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
 * 购物车商品表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveCart对象", description="购物车商品表")
public class TwelveCart implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;

    @ApiModelProperty(value = "商品表的商品ID")
    private Integer goodsId;

    @ApiModelProperty(value = "商品编号")
    private String goodsSn;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "商品货品表的货品ID")
    private Integer productId;

    @ApiModelProperty(value = "商品货品的价格")
    private BigDecimal price;

    @ApiModelProperty(value = "商品货品的数量")
    private Integer number;

    @ApiModelProperty(value = "商品规格值列表，采用JSON数组格式")
    private String specifications;

    @ApiModelProperty(value = "购物车中商品是否选择状态")
    private Boolean checked;

    @ApiModelProperty(value = "商品图片或者商品货品图片")
    private String picUrl;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String USER_ID = "user_id";

    public static final String GOODS_ID = "goods_id";

    public static final String GOODS_SN = "goods_sn";

    public static final String GOODS_NAME = "goods_name";

    public static final String PRODUCT_ID = "product_id";

    public static final String PRICE = "price";

    public static final String NUMBER = "number";

    public static final String SPECIFICATIONS = "specifications";

    public static final String CHECKED = "checked";

    public static final String PIC_URL = "pic_url";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
