package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 收货地址表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveAddress对象", description="收货地址表")
public class TwelveAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "收货人名称")
    private String name;

    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;

    @ApiModelProperty(value = "行政区域表的省ID")
    private String province;

    @ApiModelProperty(value = "行政区域表的市ID")
    private String city;

    @ApiModelProperty(value = "行政区域表的区县ID")
    private String county;

    @ApiModelProperty(value = "详细收货地址")
    private String addressDetail;

    @ApiModelProperty(value = "地区编码")
    private String areaCode;

    @ApiModelProperty(value = "邮政编码")
    private String postalCode;

    @ApiModelProperty(value = "手机号码")
    private String tel;

    @ApiModelProperty(value = "是否默认地址")
    private Boolean isDefault;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String NAME = "name";

    public static final String USER_ID = "user_id";

    public static final String PROVINCE = "province";

    public static final String CITY = "city";

    public static final String COUNTY = "county";

    public static final String ADDRESS_DETAIL = "address_detail";

    public static final String AREA_CODE = "area_code";

    public static final String POSTAL_CODE = "postal_code";

    public static final String TEL = "tel";

    public static final String IS_DEFAULT = "is_default";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
