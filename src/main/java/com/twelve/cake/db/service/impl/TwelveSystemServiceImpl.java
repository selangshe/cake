package com.twelve.cake.db.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.twelve.cake.db.entity.TwelveSystem;
import com.twelve.cake.db.mapper.TwelveSystemMapper;
import com.twelve.cake.db.service.TwelveSystemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 系统配置表 服务实现类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Service
public class TwelveSystemServiceImpl extends ServiceImpl<TwelveSystemMapper, TwelveSystem> implements TwelveSystemService {

    @Override
    public Map<String, String> queryAll() {

        QueryWrapper<TwelveSystem> wrapper = new QueryWrapper();
        wrapper.eq("deleted" ,0);
        List<TwelveSystem> twelveSystems = baseMapper.selectList(wrapper);
        Map<String, String> systemConfigs = new HashMap<>();
        for (TwelveSystem item : twelveSystems) {
            systemConfigs.put(item.getKeyName(), item.getKeyValue());
        }

        return systemConfigs;
    }

    @Override
    public void addConfig(String key, String value) {
        TwelveSystem system = new TwelveSystem();
        system.setKeyName(key);
        system.setKeyValue(value);
        system.setAddTime(LocalDateTime.now());
        system.setUpdateTime(LocalDateTime.now());
        baseMapper.insert(system);
    }
}
