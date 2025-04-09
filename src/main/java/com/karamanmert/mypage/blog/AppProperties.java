package com.karamanmert.mypage.blog;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author karamanmert
 */
@Configuration
@ConfigurationProperties(prefix = "my.page")
@Data
public class AppProperties {
    private String title;
    private String description;
}
