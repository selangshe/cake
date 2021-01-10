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
 * 品牌商表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveBrand对象", description="品牌商表")
public class TwelveBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "品牌商名称")
    private String name;

    @ApiModelProperty(value = "品牌商简介")
    private String desc;

    @ApiModelProperty(value = "品牌商页的品牌商图片")
    private String picUrl;

    private Integer sortOrder;

    @ApiModelProperty(value = "品牌商的商品低价，仅用于页面展示")
    private BigDecimal floorPrice;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String NAME = "name";

    public static final String DESC = "desc";

    public static final String PIC_URL = "pic_url";

    public static final String SORT_ORDER = "sort_order";

    public static final String FLOOR_PRICE = "floor_price";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
