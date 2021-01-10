package com.twelve.cake.db.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.twelve.cake.db.entity.TwelveAdmin;
import com.twelve.cake.db.mapper.TwelveAdminMapper;
import com.twelve.cake.db.service.TwelveAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Service
public class TwelveAdminServiceImpl extends ServiceImpl<TwelveAdminMapper, TwelveAdmin> implements TwelveAdminService {

    @Override
    public List<TwelveAdmin> findAdmin(String username) {
        QueryWrapper<TwelveAdmin> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        List<TwelveAdmin> twelveAdmins = baseMapper.selectList(wrapper);
        return twelveAdmins;
    }
}
