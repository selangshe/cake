package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 优惠券用户使用表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveCouponUser对象", description="优惠券用户使用表")
public class TwelveCouponUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "优惠券ID")
    private Integer couponId;

    @ApiModelProperty(value = "使用状态, 如果是0则未使用；如果是1则已使用；如果是2则已过期；如果是3则已经下架；")
    private Integer status;

    @ApiModelProperty(value = "使用时间")
    private LocalDateTime usedTime;

    @ApiModelProperty(value = "有效期开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "有效期截至时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "订单ID")
    private Integer orderId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String USER_ID = "user_id";

    public static final String COUPON_ID = "coupon_id";

    public static final String STATUS = "status";

    public static final String USED_TIME = "used_time";

    public static final String START_TIME = "start_time";

    public static final String END_TIME = "end_time";

    public static final String ORDER_ID = "order_id";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
