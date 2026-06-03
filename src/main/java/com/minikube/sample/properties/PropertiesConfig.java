package com.minikube.sample.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "app")
public class PropertiesConfig {
    private String name;
    private String test;


    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for test
    public String getTest() {
        return test;
    }
    public void setTest(String test) {
        this.test = test;
    }
}
