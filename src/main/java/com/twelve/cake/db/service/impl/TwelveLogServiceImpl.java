package com.twelve.cake.db.service.impl;

import com.twelve.cake.db.entity.TwelveLog;
import com.twelve.cake.db.mapper.TwelveLogMapper;
import com.twelve.cake.db.service.TwelveLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志表 服务实现类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
@Service
public class TwelveLogServiceImpl extends ServiceImpl<TwelveLogMapper, TwelveLog> implements TwelveLogService {

    @Override
    public void add(TwelveLog twelveLog) {
        baseMapper.insert(twelveLog);
    }
}
