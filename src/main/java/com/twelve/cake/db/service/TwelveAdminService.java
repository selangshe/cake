package com.twelve.cake.db.service;

import com.twelve.cake.db.entity.TwelveAdmin;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 管理员表 服务类
 * </p>
 *
 * @author guodongyu
 * @since 2021-01-05
 */
public interface TwelveAdminService extends IService<TwelveAdmin> {


    List<TwelveAdmin> findAdmin(String username);

}
