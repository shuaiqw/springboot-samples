package top.jlu.week04.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * User
 *
 * @author 86195
 * @date 2026/3/26
 * @description TODO: 类描述
 */
@Data
public class User {
    private Long id;
    private String username;
    private LocalDateTime createTime;
}
