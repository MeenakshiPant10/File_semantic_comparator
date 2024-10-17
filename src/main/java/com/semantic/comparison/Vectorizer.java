package com.semantic.comparison;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vectorizer {

    public static Map<String, Integer> vectorize(List<String> tokens) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String token : tokens) {
            frequencyMap.put(token, frequencyMap.getOrDefault(token, 0) + 1);
        }
        return frequencyMap;
    }
}
