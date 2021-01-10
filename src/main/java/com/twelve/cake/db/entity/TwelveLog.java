package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 操作日志表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveLog对象", description="操作日志表")
public class TwelveLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "管理员")
    private String admin;

    @ApiModelProperty(value = "管理员地址")
    private String ip;

    @ApiModelProperty(value = "操作分类")
    private Integer type;

    @ApiModelProperty(value = "操作动作")
    private String action;

    @ApiModelProperty(value = "操作状态")
    private Boolean status;

    @ApiModelProperty(value = "操作结果，或者成功消息，或者失败消息")
    private String result;

    @ApiModelProperty(value = "补充信息")
    private String comment;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String ADMIN = "admin";

    public static final String IP = "ip";

    public static final String TYPE = "type";

    public static final String ACTION = "action";

    public static final String STATUS = "status";

    public static final String RESULT = "result";

    public static final String COMMENT = "comment";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
