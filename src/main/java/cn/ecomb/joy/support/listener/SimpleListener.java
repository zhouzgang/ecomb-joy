package cn.ecomb.joy.support.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 使用servlet的监听器注解
 * 同时需要将配置以组件的形式放到IOC容器里
 *
 * @author zhouzhigang
 * @date 2017/11/25.
 */
@WebListener
@Component
public class SimpleListener implements ServletContextListener{

    private static final Logger logger = LoggerFactory.getLogger(SimpleListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("-----> contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("-----> contextDestroyed");
    }
}
