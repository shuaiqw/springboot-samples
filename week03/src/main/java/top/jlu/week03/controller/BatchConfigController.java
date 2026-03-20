package top.jlu.week03.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jlu.week03.common.Result;
import top.jlu.week03.config.AppConfig;

@RestController
@RequestMapping("/config/batch")
@RequiredArgsConstructor
public class BatchConfigController {
    private final AppConfig appConfig;

    @GetMapping
    public Result<AppConfig> getConfigInfoBatch() {
        return Result.success(appConfig);
    }
}
