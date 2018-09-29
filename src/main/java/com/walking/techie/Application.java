package com.walking.techie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        ReadPropertiesFile propertiesFileBean = applicationContext.getBean(ReadPropertiesFile.class);
        Map<String, Integer> keyValuePair = propertiesFileBean.getKeyValue();
        for (String key : keyValuePair.keySet()) {
            System.out.println("Key:: " + key + " value:: " + keyValuePair.get(key));
        }
    }
}