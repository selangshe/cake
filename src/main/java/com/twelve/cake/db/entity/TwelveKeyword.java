package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 关键字表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveKeyword对象", description="关键字表")
public class TwelveKeyword implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "关键字")
    private String keyword;

    @ApiModelProperty(value = "关键字的跳转链接")
    private String url;

    @ApiModelProperty(value = "是否是热门关键字")
    private Boolean isHot;

    @ApiModelProperty(value = "是否是默认关键字")
    private Boolean isDefault;

    @ApiModelProperty(value = "排序")
    private Integer sortOrder;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String KEYWORD = "keyword";

    public static final String URL = "url";

    public static final String IS_HOT = "is_hot";

    public static final String IS_DEFAULT = "is_default";

    public static final String SORT_ORDER = "sort_order";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
