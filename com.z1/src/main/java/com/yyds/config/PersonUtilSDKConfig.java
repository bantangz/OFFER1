package com.yyds.config;

import com.yyds.util.PersonUtil;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("ban.tang")
@Data
@ComponentScan
public class PersonUtilSDKConfig {

    String name;
    String age;

    @Bean
    public PersonUtil getPersonUtil(){
        return new PersonUtil(name,Long.parseLong(age));
    }
}
