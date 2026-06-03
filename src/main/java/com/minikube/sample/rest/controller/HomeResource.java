package com.minikube.sample.rest.controller;

import com.minikube.sample.properties.PropertiesConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeResource {

    @Autowired
    private PropertiesConfig config;

    @GetMapping("/data")
    public ResponseEntity<ResponseData> getData() {
        ResponseData responseData = new ResponseData();
        responseData.setId(1);                       
        responseData.setName(config.getName());       
        responseData.setPlace("Hyderabad");           
        responseData.setValue(config.getTest());      
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @Getter
    @Setter
    public static class ResponseData {
        private String name;
        private Integer id;
        private String place;
        private String value;
    }
}
