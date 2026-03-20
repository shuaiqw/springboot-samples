package top.jlu.week03.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jlu.week03.config.AppConfig;

import java.util.Map;


@RestController
@RequestMapping("/config")
public class BaseController {
    @Value("${server.port}")
    private String serverPort;
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;
    @Value("${app.description}")
    private String appDescription;
    @GetMapping("/port")
    public Map<String, Object> getPort() {
        return Map.of(
                "serverPort", serverPort,
                "applicationName", applicationName,
                "appName", appName,
                "appVersion", appVersion,
                "appDescription", appDescription);
    }

    @Resource
    private AppConfig appConfig;
    @GetMapping("/info2")
    public Map<String, Object> getInfo2() {
        return Map.of(
                "appname", appConfig.getName(),
                "version", appConfig.getVersion(),
                "description", appConfig.getDescription()
        );
    }
}
