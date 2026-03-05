package jlu.springboothello.Controller;

import jlu.springboothello.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public ResultVO<String> hello() {
        // 两种调用方式任选其一
        // 方式1：直接new
        // return new ResultVO<>(200, "success", "Hello Spring Boot");
        // 方式2：使用静态方法（更简洁）
        return ResultVO.success("Hello Spring Boot");
    }
}