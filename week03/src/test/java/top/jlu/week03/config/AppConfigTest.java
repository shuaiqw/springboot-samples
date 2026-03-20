package top.jlu.week03.config;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class AppConfigTest {
    @Resource
    private AppConfig appConfig;

    @Test
    public void getAppName() {
        log.info("应用名称:{}", appConfig.getName());
    }
    @Test
    public void getVersion() {
        log.info("应用版本:{}", appConfig.getVersion());
    }
    @Test
    public void getDescription() {
        log.info("应用描述:{}", appConfig.getDescription());
    }
}
