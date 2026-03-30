package top.jlu.week04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.jlu.week04.Config.StudentConfig;
import top.jlu.week04.entity.Student;

/**
 * TestStudent
 *
 * @author 86195
 * @date 2026/3/26
 * @description TODO: 类描述
 */
public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student = context.getBean("student", Student.class);
        student.study();
    }
}
