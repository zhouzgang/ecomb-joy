package cn.ecomb.joy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author zhouzhigang
 * @date 2018/7/15.
 */
@SpringBootApplication
@EnableCaching
public class StartApplication {

    private static final Logger logger = LoggerFactory.getLogger(StartApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
        logger.info("--->Start success");
    }
}
