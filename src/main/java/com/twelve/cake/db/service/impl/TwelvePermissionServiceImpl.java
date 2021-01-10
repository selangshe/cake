package com.twelve.cake.db.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.twelve.cake.db.entity.TwelvePermission;
import com.twelve.cake.db.mapper.TwelvePermissionMapper;
import com.twelve.cake.db.service.TwelvePermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Service
public class TwelvePermissionServiceImpl extends ServiceImpl<TwelvePermissionMapper, TwelvePermission> implements TwelvePermissionService {


    @Override
    public Set<String> queryByRoleIds(int[] roleIds) {
        Set<String> permissions = new HashSet<String>();
        if(roleIds.length == 0){
            return permissions;
        }
        QueryWrapper<TwelvePermission> wrapped = new QueryWrapper();
        wrapped.in("roleId", Arrays.asList(roleIds));
        List<TwelvePermission> permissionList = baseMapper.selectList(wrapped);
        for(TwelvePermission permission : permissionList){
            permissions.add(permission.getPermission());
        }
        return permissions;
    }
}
