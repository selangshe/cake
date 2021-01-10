package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品规格表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveGoodsSpecification对象", description="商品规格表")
public class TwelveGoodsSpecification implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品表的商品ID")
    private Integer goodsId;

    @ApiModelProperty(value = "商品规格名称")
    private String specification;

    @ApiModelProperty(value = "商品规格值")
    private String value;

    @ApiModelProperty(value = "商品规格图片")
    private String picUrl;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String GOODS_ID = "goods_id";

    public static final String SPECIFICATION = "specification";

    public static final String VALUE = "value";

    public static final String PIC_URL = "pic_url";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
