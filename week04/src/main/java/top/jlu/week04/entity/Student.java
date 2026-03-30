package top.jlu.week04.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Student
 *
 * @author 86195
 * @date 2026/3/26
 * @description TODO: 类描述
 */
@Data
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;
    public void study() {
        System.out.println(name+"学习学习");
    }
}

