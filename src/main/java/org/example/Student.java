package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "student")
public class Student {
//    @Value("nihao")
    public String name;
//    @Value("18")
    public Integer age;
}
