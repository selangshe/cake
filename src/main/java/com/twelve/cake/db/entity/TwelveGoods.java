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
 * 商品基本信息表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveGoods对象", description="商品基本信息表")
public class TwelveGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品编号")
    private String goodsSn;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "商品所属类目ID")
    private Integer categoryId;

    private Integer brandId;

    @ApiModelProperty(value = "商品宣传图片列表，采用JSON数组格式")
    private String gallery;

    @ApiModelProperty(value = "商品关键字，采用逗号间隔")
    private String keywords;

    @ApiModelProperty(value = "商品简介")
    private String brief;

    @ApiModelProperty(value = "是否上架")
    private Boolean isOnSale;

    private Integer sortOrder;

    @ApiModelProperty(value = "商品页面商品图片")
    private String picUrl;

    @ApiModelProperty(value = "商品分享海报")
    private String shareUrl;

    @ApiModelProperty(value = "是否新品首发，如果设置则可以在新品首发页面展示")
    private Boolean isNew;

    @ApiModelProperty(value = "是否人气推荐，如果设置则可以在人气推荐页面展示")
    private Boolean isHot;

    @ApiModelProperty(value = "商品单位，例如件、盒")
    private String unit;

    @ApiModelProperty(value = "专柜价格")
    private BigDecimal counterPrice;

    @ApiModelProperty(value = "零售价格")
    private BigDecimal retailPrice;

    @ApiModelProperty(value = "商品详细介绍，是富文本格式")
    private String detail;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String GOODS_SN = "goods_sn";

    public static final String NAME = "name";

    public static final String CATEGORY_ID = "category_id";

    public static final String BRAND_ID = "brand_id";

    public static final String GALLERY = "gallery";

    public static final String KEYWORDS = "keywords";

    public static final String BRIEF = "brief";

    public static final String IS_ON_SALE = "is_on_sale";

    public static final String SORT_ORDER = "sort_order";

    public static final String PIC_URL = "pic_url";

    public static final String SHARE_URL = "share_url";

    public static final String IS_NEW = "is_new";

    public static final String IS_HOT = "is_hot";

    public static final String UNIT = "unit";

    public static final String COUNTER_PRICE = "counter_price";

    public static final String RETAIL_PRICE = "retail_price";

    public static final String DETAIL = "detail";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
