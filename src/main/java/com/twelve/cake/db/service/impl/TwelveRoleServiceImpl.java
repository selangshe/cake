package com.twelve.cake.db.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.twelve.cake.db.entity.TwelveRole;
import com.twelve.cake.db.mapper.TwelveRoleMapper;
import com.twelve.cake.db.service.TwelveRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Service
public class TwelveRoleServiceImpl extends ServiceImpl<TwelveRoleMapper, TwelveRole> implements TwelveRoleService {


    @Override
    public Set<String> queryByIds(int[] roleIds) {
        Set<String> roles = new HashSet<String>();
        if(roleIds.length == 0){
            return roles;
        }
        QueryWrapper<TwelveRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", Arrays.asList(roleIds));
        List<TwelveRole> twelveRoles = baseMapper.queryByIds(queryWrapper);
        for(TwelveRole role : twelveRoles){
            roles.add(role.getName());
        }
        return roles;
    }
}
