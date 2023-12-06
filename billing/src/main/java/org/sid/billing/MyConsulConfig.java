package org.sid.billing;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component // va etre automatiquement instanciee par Spring
@ConfigurationProperties(prefix = "token") // mapper les proprietes de config definie dans consul
@Data // genere les getters et setters
public class MyConsulConfig {
    private long accessTokenTimeout;
    private long refreshTokenTimeout;

}
