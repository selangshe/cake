package com.twelve.cake.db.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.twelve.cake.db.entity.TwelveRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
public interface TwelveRoleMapper extends BaseMapper<TwelveRole> {

    List<TwelveRole> queryByIds(QueryWrapper<TwelveRole> queryWrapper);
}
