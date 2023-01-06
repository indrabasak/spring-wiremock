package com.basaki.springwiremock.config;

import com.github.tomakehurst.wiremock.core.Options;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.cloud.contract.wiremock.WireMockSpring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureWireMock
public class WireMockConfig {

    private WireMockProperties properties;

    @Autowired
    public WireMockConfig(WireMockProperties properties) {
        this.properties = properties;
    }

    @Bean
    public Options wireMockOptions() {
        final WireMockConfiguration options = WireMockSpring.options();
        options.port(properties.getPort());
        options.usingFilesUnderDirectory(properties.getRoot());

        return options;

    }
}
