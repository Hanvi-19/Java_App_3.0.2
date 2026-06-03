package com.minikube.sample.rest.controller;

import com.minikube.sample.properties.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @Autowired
    private PropertiesConfig config;

    @GetMapping("/home")
    public ResponseData home() {
        ResponseData responseData = new ResponseData();

        responseData.setId(1);
        responseData.setName(config.getName());
        responseData.setValue(config.getTest());

        return responseData;
    }

    public static class ResponseData {
        private int id;
        private String name;
        private String value;

        // id
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        // name
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        // value
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
    }
}
