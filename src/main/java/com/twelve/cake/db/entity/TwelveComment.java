package com.twelve.cake.db.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveComment对象", description="评论表")
public class TwelveComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "如果type=0，则是商品评论；如果是type=1，则是专题评论。")
    private Integer valueId;

    @ApiModelProperty(value = "评论类型，如果type=0，则是商品评论；如果是type=1，则是专题评论；")
    private Integer type;

    @ApiModelProperty(value = "评论内容")
    private String content;

    @ApiModelProperty(value = "管理员回复内容")
    private String adminContent;

    @ApiModelProperty(value = "用户表的用户ID")
    private Integer userId;

    @ApiModelProperty(value = "是否含有图片")
    private Boolean hasPicture;

    @ApiModelProperty(value = "图片地址列表，采用JSON数组格式")
    private String picUrls;

    @ApiModelProperty(value = "评分， 1-5")
    private Integer star;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String VALUE_ID = "value_id";

    public static final String TYPE = "type";

    public static final String CONTENT = "content";

    public static final String ADMIN_CONTENT = "admin_content";

    public static final String USER_ID = "user_id";

    public static final String HAS_PICTURE = "has_picture";

    public static final String PIC_URLS = "pic_urls";

    public static final String STAR = "star";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
