package com.twelve.cake.db.service;

import com.twelve.cake.db.entity.TwelveRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
public interface TwelveRoleService extends IService<TwelveRole> {
    Set<String> queryByIds(int[] roleIds);

}
