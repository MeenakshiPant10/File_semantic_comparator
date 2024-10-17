package com.semantic.comparison;

import java.util.*;

public class CosineSimilarity {

    public static double cosineSimilarity(Map<String, Integer> vector1, Map<String, Integer> vector2) {
        Set<String> allWords = new HashSet<>();
        allWords.addAll(vector1.keySet());
        allWords.addAll(vector2.keySet());

        double dotProduct = 0.0;
        double norm1 = 0.0;
        double norm2 = 0.0;

        for (String word : allWords) {
            int count1 = vector1.getOrDefault(word, 0);
            int count2 = vector2.getOrDefault(word, 0);
            dotProduct += count1 * count2;
            norm1 += Math.pow(count1, 2);
            norm2 += Math.pow(count2, 2);
        }

        if (norm1 == 0 || norm2 == 0) return 0.0;
        return dotProduct / (Math.sqrt(norm1) * Math.sqrt(norm2));
    }
}
