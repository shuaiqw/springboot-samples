package top.jlu.week04.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.jlu.week04.entity.Student;

/**
 * StudentConfig
 *
 * @author 86195
 * @date 2026/3/26
 * @description TODO: 类描述
 */
@Configuration
public class StudentConfig {
    @Bean
    public Student student() {
        Student student = new Student();
        student.setId(1L);
        student.setName("zhangsan");
        return student;
    }
}
