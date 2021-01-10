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
 * 优惠券信息及规则表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveCoupon对象", description="优惠券信息及规则表")
public class TwelveCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "优惠券名称")
    private String name;

    @ApiModelProperty(value = "优惠券介绍，通常是显示优惠券使用限制文字")
    private String desc;

    @ApiModelProperty(value = "优惠券标签，例如新人专用")
    private String tag;

    @ApiModelProperty(value = "优惠券数量，如果是0，则是无限量")
    private Integer total;

    @ApiModelProperty(value = "优惠金额，")
    private BigDecimal discount;

    @ApiModelProperty(value = "最少消费金额才能使用优惠券。")
    private BigDecimal min;

    @ApiModelProperty(value = "用户领券限制数量，如果是0，则是不限制；默认是1，限领一张.")
    private Integer limit;

    @ApiModelProperty(value = "优惠券赠送类型，如果是0则通用券，用户领取；如果是1，则是注册赠券；如果是2，则是优惠券码兑换；")
    private Integer type;

    @ApiModelProperty(value = "优惠券状态，如果是0则是正常可用；如果是1则是过期; 如果是2则是下架。")
    private Integer status;

    @ApiModelProperty(value = "商品限制类型，如果0则全商品，如果是1则是类目限制，如果是2则是商品限制。")
    private Integer goodsType;

    @ApiModelProperty(value = "商品限制值，goods_type如果是0则空集合，如果是1则是类目集合，如果是2则是商品集合。")
    private String goodsValue;

    @ApiModelProperty(value = "优惠券兑换码")
    private String code;

    @ApiModelProperty(value = "有效时间限制，如果是0，则基于领取时间的有效天数days；如果是1，则start_time和end_time是优惠券有效期；")
    private Integer timeType;

    @ApiModelProperty(value = "基于领取时间的有效天数days。")
    private Integer days;

    @ApiModelProperty(value = "使用券开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "使用券截至时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String NAME = "name";

    public static final String DESC = "desc";

    public static final String TAG = "tag";

    public static final String TOTAL = "total";

    public static final String DISCOUNT = "discount";

    public static final String MIN = "min";

    public static final String LIMIT = "limit";

    public static final String TYPE = "type";

    public static final String STATUS = "status";

    public static final String GOODS_TYPE = "goods_type";

    public static final String GOODS_VALUE = "goods_value";

    public static final String CODE = "code";

    public static final String TIME_TYPE = "time_type";

    public static final String DAYS = "days";

    public static final String START_TIME = "start_time";

    public static final String END_TIME = "end_time";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
