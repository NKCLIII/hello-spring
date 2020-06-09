package nkmg1c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class NkConfig {
    @Bean
    public Address getAddress() {
        return new Address();
    }
}