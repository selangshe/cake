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
 * 团购规则表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveGrouponRules对象", description="团购规则表")
public class TwelveGrouponRules implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品表的商品ID")
    private Integer goodsId;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "商品图片或者商品货品图片")
    private String picUrl;

    @ApiModelProperty(value = "优惠金额")
    private BigDecimal discount;

    @ApiModelProperty(value = "达到优惠条件的人数")
    private Integer discountMember;

    @ApiModelProperty(value = "团购过期时间")
    private LocalDateTime expireTime;

    @ApiModelProperty(value = "团购规则状态，正常上线则0，到期自动下线则1，管理手动下线则2")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String GOODS_ID = "goods_id";

    public static final String GOODS_NAME = "goods_name";

    public static final String PIC_URL = "pic_url";

    public static final String DISCOUNT = "discount";

    public static final String DISCOUNT_MEMBER = "discount_member";

    public static final String EXPIRE_TIME = "expire_time";

    public static final String STATUS = "status";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
