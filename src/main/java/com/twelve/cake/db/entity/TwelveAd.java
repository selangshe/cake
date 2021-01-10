package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 广告表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveAd对象", description="广告表")
public class TwelveAd implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "广告标题")
    private String name;

    @ApiModelProperty(value = "所广告的商品页面或者活动页面链接地址")
    private String link;

    @ApiModelProperty(value = "广告宣传图片")
    private String url;

    @ApiModelProperty(value = "广告位置：1则是首页")
    private Integer position;

    @ApiModelProperty(value = "活动内容")
    private String content;

    @ApiModelProperty(value = "广告开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "广告结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "是否启动")
    private Boolean enabled;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String NAME = "name";

    public static final String LINK = "link";

    public static final String URL = "url";

    public static final String POSITION = "position";

    public static final String CONTENT = "content";

    public static final String START_TIME = "start_time";

    public static final String END_TIME = "end_time";

    public static final String ENABLED = "enabled";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
