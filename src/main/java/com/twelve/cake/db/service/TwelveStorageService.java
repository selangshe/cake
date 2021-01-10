package com.twelve.cake.db.service;

import com.twelve.cake.db.entity.TwelveStorage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 文件存储表 服务类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
public interface TwelveStorageService extends IService<TwelveStorage> {
    void add(TwelveStorage storageInfo);
    TwelveStorage findByKey(String key);

}
