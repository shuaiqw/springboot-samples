package top.jlu.week05.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * User
 *
 * @author 86195
 * @date 2026/4/2
 * @description TODO: 类描述
 */
@Data
public class User {
    @Schema(description="主键")
    private Long id;

    @Schema(description="用户名")
    private String username;

    @Schema(description="密码")
    private String password;

    @Schema(description="年龄")
    private Integer age;

    @Schema(description="邮箱")
    private String email;

    @Schema(description="创建时间")
    private LocalDateTime createTime;
}
