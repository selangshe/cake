package com.twelve.cake.db.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TwelveUser对象", description="用户表")
public class TwelveUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名称")
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "性别：0 未知， 1男， 1 女")
    private Integer gender;

    @ApiModelProperty(value = "生日")
    private LocalDate birthday;

    @ApiModelProperty(value = "最近一次登录时间")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty(value = "最近一次登录IP地址")
    private String lastLoginIp;

    @ApiModelProperty(value = "0 普通用户，1 VIP用户，2 高级VIP用户")
    private Integer userLevel;

    @ApiModelProperty(value = "用户昵称或网络名称")
    private String nickname;

    @ApiModelProperty(value = "用户手机号码")
    private String mobile;

    @ApiModelProperty(value = "用户头像图片")
    private String avatar;

    @ApiModelProperty(value = "微信登录openid")
    private String weixinOpenid;

    @ApiModelProperty(value = "微信登录会话KEY")
    private String sessionKey;

    @ApiModelProperty(value = "0 可用, 1 禁用, 2 注销")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    private Boolean deleted;


    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String GENDER = "gender";

    public static final String BIRTHDAY = "birthday";

    public static final String LAST_LOGIN_TIME = "last_login_time";

    public static final String LAST_LOGIN_IP = "last_login_ip";

    public static final String USER_LEVEL = "user_level";

    public static final String NICKNAME = "nickname";

    public static final String MOBILE = "mobile";

    public static final String AVATAR = "avatar";

    public static final String WEIXIN_OPENID = "weixin_openid";

    public static final String SESSION_KEY = "session_key";

    public static final String STATUS = "status";

    public static final String ADD_TIME = "add_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String DELETED = "deleted";

}
