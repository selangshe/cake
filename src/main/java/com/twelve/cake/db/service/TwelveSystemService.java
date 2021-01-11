package com.twelve.cake.db.service;

import com.twelve.cake.db.entity.TwelveSystem;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 系统配置表 服务类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
public interface TwelveSystemService extends IService<TwelveSystem> {


    Map<String, String> queryAll();

    void addConfig(String key,String value);
}
