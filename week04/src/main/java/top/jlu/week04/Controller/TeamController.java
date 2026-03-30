package top.jlu.week04.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jlu.week04.Common.Result;
import top.jlu.week04.entity.Team;
import top.jlu.week04.exception.BusinessException;

/**
 * TeamController
 *
 * @author 86195
 * @date 2026/3/26
 * @description TODO: 类描述
 */
@RestController
@RequestMapping("/api/team")
@Slf4j
public class TeamController {

    @PostMapping("/add")
    public Result addTeam(@Validated @RequestBody Team team, HttpServletRequest request) {
        // 验证 token
        String token = request.getHeader("token");
        if (token == null || token.isBlank()) {
            throw new BusinessException(401, "请先登录");
        }
        if (!"admin".equals(token)) {
            throw new BusinessException(403, "没有权限");
        }
        int a=1/0;
        log.info("添加团队: {}", team);
        return Result.success("添加成功");
    }
}
