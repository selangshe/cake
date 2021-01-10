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
 * 售后表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveAftersale对象", description="售后表")
public class TwelveAftersale implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "售后编号")
    private String aftersaleSn;

    @ApiModelProperty(value = "订单ID")
    private Integer orderId;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "售后类型，0是未收货退款，1是已收货（无需退货）退款，2用户退货退款")
    private Integer type;

    @ApiModelProperty(value = "退款原因")
    private String reason;

    @ApiModelProperty(value = "退款金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "退款凭证图片链接数组")
    private String pictures;

    @ApiModelProperty(value = "退款说明")
    private String comment;

    @ApiModelProperty(value = "售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消")
    private Integer status;

    @ApiModelProperty(value = "管理员操作时间")
    private LocalDateTime handleTime;

    @ApiModelProperty(value = "添加时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String AFTERSALE_SN = "aftersale_sn";

    public static final String ORDER_ID = "order_id";

    public static final String USER_ID = "user_id";

    public static final String TYPE = "type";

    public static final String REASON = "reason";

    public static final String AMOUNT = "amount";

    public static final String PICTURES = "pictures";

    public static final String COMMENT = "comment";

    public static final String STATUS = "status";

    public static final String HANDLE_TIME = "handle_time";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
