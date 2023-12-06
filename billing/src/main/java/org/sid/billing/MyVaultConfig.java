package org.sid.billing;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user") // mapper les proprietes de config definie dans vault
@Data
public class MyVaultConfig {
    private String username;
    private String password;
    private String otp;
}
