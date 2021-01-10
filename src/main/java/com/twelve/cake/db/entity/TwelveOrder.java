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
 * 订单表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveOrder对象", description="订单表")
public class TwelveOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;

    @ApiModelProperty(value = "订单编号")
    private String orderSn;

    @ApiModelProperty(value = "订单状态")
    private Integer orderStatus;

    @ApiModelProperty(value = "售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消")
    private Integer aftersaleStatus;

    @ApiModelProperty(value = "收货人名称")
    private String consignee;

    @ApiModelProperty(value = "收货人手机号")
    private String mobile;

    @ApiModelProperty(value = "收货具体地址")
    private String address;

    @ApiModelProperty(value = "用户订单留言")
    private String message;

    @ApiModelProperty(value = "商品总费用")
    private BigDecimal goodsPrice;

    @ApiModelProperty(value = "配送费用")
    private BigDecimal freightPrice;

    @ApiModelProperty(value = "优惠券减免")
    private BigDecimal couponPrice;

    @ApiModelProperty(value = "用户积分减免")
    private BigDecimal integralPrice;

    @ApiModelProperty(value = "团购优惠价减免")
    private BigDecimal grouponPrice;

    @ApiModelProperty(value = "订单费用， = goods_price + freight_price - coupon_price")
    private BigDecimal orderPrice;

    @ApiModelProperty(value = "实付费用， = order_price - integral_price")
    private BigDecimal actualPrice;

    @ApiModelProperty(value = "微信付款编号")
    private String payId;

    @ApiModelProperty(value = "微信付款时间")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "发货编号")
    private String shipSn;

    @ApiModelProperty(value = "发货快递公司")
    private String shipChannel;

    @ApiModelProperty(value = "发货开始时间")
    private LocalDateTime shipTime;

    @ApiModelProperty(value = "实际退款金额，（有可能退款金额小于实际支付金额）")
    private BigDecimal refundAmount;

    @ApiModelProperty(value = "退款方式")
    private String refundType;

    @ApiModelProperty(value = "退款备注")
    private String refundContent;

    @ApiModelProperty(value = "退款时间")
    private LocalDateTime refundTime;

    @ApiModelProperty(value = "用户确认收货时间")
    private LocalDateTime confirmTime;

    @ApiModelProperty(value = "待评价订单商品数量")
    private Integer comments;

    @ApiModelProperty(value = "订单关闭时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String USER_ID = "user_id";

    public static final String ORDER_SN = "order_sn";

    public static final String ORDER_STATUS = "order_status";

    public static final String AFTERSALE_STATUS = "aftersale_status";

    public static final String CONSIGNEE = "consignee";

    public static final String MOBILE = "mobile";

    public static final String ADDRESS = "address";

    public static final String MESSAGE = "message";

    public static final String GOODS_PRICE = "goods_price";

    public static final String FREIGHT_PRICE = "freight_price";

    public static final String COUPON_PRICE = "coupon_price";

    public static final String INTEGRAL_PRICE = "integral_price";

    public static final String GROUPON_PRICE = "groupon_price";

    public static final String ORDER_PRICE = "order_price";

    public static final String ACTUAL_PRICE = "actual_price";

    public static final String PAY_ID = "pay_id";

    public static final String PAY_TIME = "pay_time";

    public static final String SHIP_SN = "ship_sn";

    public static final String SHIP_CHANNEL = "ship_channel";

    public static final String SHIP_TIME = "ship_time";

    public static final String REFUND_AMOUNT = "refund_amount";

    public static final String REFUND_TYPE = "refund_type";

    public static final String REFUND_CONTENT = "refund_content";

    public static final String REFUND_TIME = "refund_time";

    public static final String CONFIRM_TIME = "confirm_time";

    public static final String COMMENTS = "comments";

    public static final String END_TIME = "end_time";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
