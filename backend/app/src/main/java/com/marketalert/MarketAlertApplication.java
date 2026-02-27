package com.marketalert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Market Alerting backend.
 * Run with: ./gradlew :app:bootRun
 * Health check: GET http://localhost:8080/actuator/health
 */
@SpringBootApplication
public class MarketAlertApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketAlertApplication.class, args);
    }
}
