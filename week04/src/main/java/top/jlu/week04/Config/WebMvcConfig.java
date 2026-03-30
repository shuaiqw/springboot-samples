package top.jlu.week04.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvcConfig
 *
 * @author 86195
 * @date 2026/3/26
 * @description TODO: 类描述
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
//    // 简单的字符串 Bean
//    @Bean
//    public String helloBean() {
//        return "Hello from @Bean annotation";
//    }
//
//    // 简单的工具类 Bean
//    @Bean
//    public StringUtil stringUtil() {
//        return new StringUtil();
//    }
//
//    // 内部工具类
//    public static class StringUtil {
//        public String toUpperCase(String str) {
//            return str != null ? str.toUpperCase() : null;
//        }
//    }

@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
    // 映射 /upload/** 请求到 classpath:/static/upload/ 目录
    registry.addResourceHandler("/upload/**").addResourceLocations("classpath:/static/upload/");
}
}
