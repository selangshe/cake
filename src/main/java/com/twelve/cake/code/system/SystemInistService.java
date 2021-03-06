package com.twelve.cake.code.system;

import com.twelve.cake.code.util.SystemInfoPrinter;
import com.twelve.cake.db.service.TwelveSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 系统启动服务，用于设置系统配置信息、检查系统状态及打印系统信息
 */
@Component
class SystemInistService {
    private SystemInistService systemInistService;


    @Autowired
    private Environment environment;

    @PostConstruct
    private void inist() {
        systemInistService = this;
        initConfigs();
        SystemInfoPrinter.printInfo("TwelveCake 初始化信息", getSystemInfo());
    }


    private final static Map<String, String> DEFAULT_CONFIGS = new HashMap<>();

    static {
        // 小程序相关配置默认值
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_WX_INDEX_NEW, "6");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_WX_INDEX_HOT, "6");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_WX_INDEX_BRAND, "4");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_WX_INDEX_TOPIC, "4");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_WX_INDEX_CATLOG_LIST, "4");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_WX_INDEX_CATLOG_GOODS, "4");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_WX_SHARE, "false");
        // 运费相关配置默认值
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_EXPRESS_FREIGHT_VALUE, "8");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_EXPRESS_FREIGHT_MIN, "88");
        // 订单相关配置默认值
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_ORDER_UNPAID, "30");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_ORDER_UNCONFIRM, "7");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_ORDER_COMMENT, "7");
        // 商城相关配置默认值
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_MALL_NAME, "litemall");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_MALL_ADDRESS, "上海");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_MALL_Latitude, "31.201900");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_MALL_LONGITUDE, "121.587839");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_MALL_PHONE, "021-xxxx-xxxx");
        DEFAULT_CONFIGS.put(SystemConfig.TwelveCake_MALL_QQ, "705144434");
    }

    @Autowired
    private TwelveSystemService systemConfigService;

    private void initConfigs() {
        // 1. 读取数据库全部配置信息
        Map<String, String> configs = systemConfigService.queryAll();

        // 2. 分析DEFAULT_CONFIGS
        for (Map.Entry<String, String> entry : DEFAULT_CONFIGS.entrySet()) {
            if (configs.containsKey(entry.getKey())) {
                continue;
            }

            configs.put(entry.getKey(), entry.getValue());
            systemConfigService.addConfig(entry.getKey(), entry.getValue());
        }

        SystemConfig.setConfigs(configs);
    }

    private Map<String, String> getSystemInfo() {

        Map<String, String> infos = new LinkedHashMap<>();

        infos.put(SystemInfoPrinter.CREATE_PART_COPPER + 0, "系统信息");
        // 测试获取application-db.yml配置信息
        infos.put("服务器端口", environment.getProperty("server.port"));
        infos.put("数据库USER", environment.getProperty("spring.datasource.druid.username"));
        infos.put("数据库地址", environment.getProperty("spring.datasource.druid.url"));
        infos.put("调试级别", environment.getProperty("logging.level.org.linlinjava.TwelveCake.wx"));

        // 测试获取application-core.yml配置信息
        infos.put(SystemInfoPrinter.CREATE_PART_COPPER + 1, "模块状态");
        infos.put("邮件", environment.getProperty("TwelveCake.notify.mail.enable"));
        infos.put("短信", environment.getProperty("TwelveCake.notify.sms.enable"));
        infos.put("模版消息", environment.getProperty("TwelveCake.notify.wx.enable"));
        infos.put("快递信息", environment.getProperty("TwelveCake.express.enable"));
        infos.put("快递鸟ID", environment.getProperty("TwelveCake.express.appId"));
        infos.put("对象存储", environment.getProperty("TwelveCake.storage.active"));
        infos.put("本地对象存储路径", environment.getProperty("TwelveCake.storage.local.storagePath"));
        infos.put("本地对象访问地址", environment.getProperty("TwelveCake.storage.local.address"));
        infos.put("本地对象访问端口", environment.getProperty("TwelveCake.storage.local.port"));

        // 微信相关信息
        infos.put(SystemInfoPrinter.CREATE_PART_COPPER + 2, "微信相关");
        infos.put("微信APP KEY", environment.getProperty("TwelveCake.wx.app-id"));
        infos.put("微信APP-SECRET", environment.getProperty("TwelveCake.wx.app-secret"));
        infos.put("微信支付MCH-ID", environment.getProperty("TwelveCake.wx.mch-id"));
        infos.put("微信支付MCH-KEY", environment.getProperty("TwelveCake.wx.mch-key"));
        infos.put("微信支付通知地址", environment.getProperty("TwelveCake.wx.notify-url"));

        //测试获取System表配置信息
        infos.put(SystemInfoPrinter.CREATE_PART_COPPER + 3, "系统设置");
        infos.put("自动创建朋友圈分享图", Boolean.toString(SystemConfig.isAutoCreateShareImage()));
        infos.put("商场名称", SystemConfig.getMallName());
        infos.put("首页显示记录数：NEW,HOT,BRAND,TOPIC,CatlogList,CatlogMore",
                SystemConfig.getNewLimit() + "," + SystemConfig.getHotLimit() + "," + SystemConfig.getBrandLimit() +
                        "," + SystemConfig.getTopicLimit() + "," + SystemConfig.getCatlogListLimit() + "," + SystemConfig.getCatlogMoreLimit());

        return infos;
    }
}
