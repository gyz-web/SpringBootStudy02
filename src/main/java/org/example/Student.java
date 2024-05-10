package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

@Data
@Component
@Validated
@ConfigurationProperties(prefix = "student")
public class Student {
//    @Value("nihao")
    public String name;
    @Email
    public String mail;
//    @Value("18")
    public Integer age;
}
