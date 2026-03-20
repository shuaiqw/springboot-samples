package top.jlu.week03.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "app")
@Data
public class AppConfig {
    private String name;
    private String version;
    private String description;
    private List<String> env;
    private Author author;
    private String token;
    private Boolean enabled=true;
}

@Data
class Author {
    private String name;
    private String email;
    private String website;
}