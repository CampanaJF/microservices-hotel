package com.inkwell.reservations.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "reservations")
@Getter
@Setter
public class ReservationsServiceConfiguration {

    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
}
