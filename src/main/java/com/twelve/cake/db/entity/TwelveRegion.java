package com.twelve.cake.db.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 行政区域表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveRegion对象", description="行政区域表")
public class TwelveRegion implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "行政区域父ID，例如区县的pid指向市，市的pid指向省，省的pid则是0")
    private Integer pid;

    @ApiModelProperty(value = "行政区域名称")
    private String name;

    @ApiModelProperty(value = "行政区域类型，如如1则是省， 如果是2则是市，如果是3则是区县")
    private Integer type;

    @ApiModelProperty(value = "行政区域编码")
    private Integer code;


    public static final String PID = "pid";

    public static final String NAME = "name";

    public static final String TYPE = "type";

    public static final String CODE = "code";

}
