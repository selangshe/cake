package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 意见反馈表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveFeedback对象", description="意见反馈表")
public class TwelveFeedback implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;

    @ApiModelProperty(value = "用户名称")
    private String username;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "反馈类型")
    private String feedType;

    @ApiModelProperty(value = "反馈内容")
    private String content;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "是否含有图片")
    private Boolean hasPicture;

    @ApiModelProperty(value = "图片地址列表，采用JSON数组格式")
    private String picUrls;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String USER_ID = "user_id";

    public static final String USERNAME = "username";

    public static final String MOBILE = "mobile";

    public static final String FEED_TYPE = "feed_type";

    public static final String CONTENT = "content";

    public static final String STATUS = "status";

    public static final String HAS_PICTURE = "has_picture";

    public static final String PIC_URLS = "pic_urls";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
