package com.semantic.comparison;

import edu.stanford.nlp.simple.*;
import java.util.List;
import java.util.stream.Collectors;

public class TextPreprocessor {
    public static List<String> tokenize(String text) {
        Document doc = new Document(text);
        return doc.sentences().stream()
                .flatMap(sentence -> sentence.words().stream())
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}
