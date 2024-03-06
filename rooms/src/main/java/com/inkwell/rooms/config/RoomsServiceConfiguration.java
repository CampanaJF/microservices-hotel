package com.inkwell.rooms.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "rooms")
@Getter
@Setter
public class RoomsServiceConfiguration {

    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
}
