package co.uk.mailnewspapers.context;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource(value = "classpath:config.properties")
public class Environment {

    @Value("${uat.url}")
    private String uatUrl;
    @Value("${prod.url}")
    private String prodUrl;

}