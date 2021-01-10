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
 * 专题表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveTopic对象", description="专题表")
public class TwelveTopic implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "专题标题")
    private String title;

    @ApiModelProperty(value = "专题子标题")
    private String subtitle;

    @ApiModelProperty(value = "专题内容，富文本格式")
    private String content;

    @ApiModelProperty(value = "专题相关商品最低价")
    private BigDecimal price;

    @ApiModelProperty(value = "专题阅读量")
    private String readCount;

    @ApiModelProperty(value = "专题图片")
    private String picUrl;

    @ApiModelProperty(value = "排序")
    private Integer sortOrder;

    @ApiModelProperty(value = "专题相关商品，采用JSON数组格式")
    private String goods;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String TITLE = "title";

    public static final String SUBTITLE = "subtitle";

    public static final String CONTENT = "content";

    public static final String PRICE = "price";

    public static final String READ_COUNT = "read_count";

    public static final String PIC_URL = "pic_url";

    public static final String SORT_ORDER = "sort_order";

    public static final String GOODS = "goods";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
