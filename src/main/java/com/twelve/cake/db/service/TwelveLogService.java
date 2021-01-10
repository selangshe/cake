package com.twelve.cake.db.service;

import com.twelve.cake.db.entity.TwelveLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 操作日志表 服务类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
public interface TwelveLogService extends IService<TwelveLog> {
    void add(TwelveLog twelveLog);

}
