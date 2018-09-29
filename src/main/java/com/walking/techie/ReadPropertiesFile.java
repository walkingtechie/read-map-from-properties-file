package com.walking.techie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ReadPropertiesFile {
    @Value("#{${walking.techie.map}}")
    private Map<String, Integer> map;

    public Map<String, Integer> getKeyValue() {
        return map;
    }
}