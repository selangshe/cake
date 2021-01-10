package com.twelve.cake.db.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.twelve.cake.db.entity.TwelveStorage;
import com.twelve.cake.db.mapper.TwelveStorageMapper;
import com.twelve.cake.db.service.TwelveStorageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * <p>
 * 文件存储表 服务实现类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Service
public class TwelveStorageServiceImpl extends ServiceImpl<TwelveStorageMapper, TwelveStorage> implements TwelveStorageService {

    @Override
    public void add(TwelveStorage storageInfo) {
        storageInfo.setAddTime(LocalDateTime.now());
        storageInfo.setUpdateTime(LocalDateTime.now());
        baseMapper.insert(storageInfo);
    }

    @Override
    public TwelveStorage findByKey(String key) {
        QueryWrapper<TwelveStorage> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("key",key);
        TwelveStorage twelveStorage = baseMapper.selectOne(queryWrapper);
        return twelveStorage;
    }
}
