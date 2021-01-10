package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 团购活动表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveGroupon对象", description="团购活动表")
public class TwelveGroupon implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty(value = "关联的订单ID")
    private Integer orderId;

    @ApiModelProperty(value = "如果是开团用户，则groupon_id是0；如果是参团用户，则groupon_id是团购活动ID")
    private Integer grouponId;

    @ApiModelProperty(value = "团购规则ID，关联twelve_groupon_rules表ID字段")
    private Integer rulesId;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "团购分享图片地址")
    private String shareUrl;

    @ApiModelProperty(value = "开团用户ID")
    private Integer creatorUserId;

    @ApiModelProperty(value = "开团时间")
    private LocalDateTime creatorUserTime;

    @ApiModelProperty(value = "团购活动状态，开团未支付则0，开团中则1，开团失败则2")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String ORDER_ID = "order_id";

    public static final String GROUPON_ID = "groupon_id";

    public static final String RULES_ID = "rules_id";

    public static final String USER_ID = "user_id";

    public static final String SHARE_URL = "share_url";

    public static final String CREATOR_USER_ID = "creator_user_id";

    public static final String CREATOR_USER_TIME = "creator_user_time";

    public static final String STATUS = "status";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
