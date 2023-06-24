package com.inotekk.batch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
@Configuration
public class FlywayConfiguration {

    @Bean
    public FlywayMigrationStrategy migrationStrategy(){
        return flyway -> {
            flyway.clean();
            flyway.migrate();
        };
    }
}
