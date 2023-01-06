package com.basaki.springwiremock.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("wiremock.server")
@Getter
@Setter
public class WireMockProperties {

    private int port;

    private String root;
}
