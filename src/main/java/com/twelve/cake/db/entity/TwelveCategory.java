package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 类目表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveCategory对象", description="类目表")
public class TwelveCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类目名称")
    private String name;

    @ApiModelProperty(value = "类目关键字，以JSON数组格式")
    private String keywords;

    @ApiModelProperty(value = "类目广告语介绍")
    private String desc;

    @ApiModelProperty(value = "父类目ID")
    private Integer pid;

    @ApiModelProperty(value = "类目图标")
    private String iconUrl;

    @ApiModelProperty(value = "类目图片")
    private String picUrl;

    private String level;

    @ApiModelProperty(value = "排序")
    private Integer sortOrder;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String NAME = "name";

    public static final String KEYWORDS = "keywords";

    public static final String DESC = "desc";

    public static final String PID = "pid";

    public static final String ICON_URL = "icon_url";

    public static final String PIC_URL = "pic_url";

    public static final String LEVEL = "level";

    public static final String SORT_ORDER = "sort_order";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
