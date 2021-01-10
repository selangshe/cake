package com.twelve.cake.db.service;

import com.twelve.cake.db.entity.TwelvePermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
public interface TwelvePermissionService extends IService<TwelvePermission> {
    Set<String> queryByRoleIds(int[] roleIds);


}
