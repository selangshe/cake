package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 收藏表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveCollect对象", description="收藏表")
public class TwelveCollect implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;

    @ApiModelProperty(value = "如果type=0，则是商品ID；如果type=1，则是专题ID")
    private Integer valueId;

    @ApiModelProperty(value = "收藏类型，如果type=0，则是商品ID；如果type=1，则是专题ID")
    private Integer type;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String USER_ID = "user_id";

    public static final String VALUE_ID = "value_id";

    public static final String TYPE = "type";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
