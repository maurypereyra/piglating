package com.appdirect.piglating.service;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TranslatorService {

    public String getSingleWordTranslation(String sentenceToTranslate) {
        return singleWordTranslation(sentenceToTranslate);

    }

    public String getSentenceTranslation(String sentence) {
        String sentenceToTranslate = sentence.trim();
        return Stream.of(sentenceToTranslate.split(" ")).map(word -> singleWordTranslation(word)).collect(Collectors.joining(" "));
    }

    private String singleWordTranslation(String word) {
        Optional<String> optionalSting = Optional.of(word.substring(1).concat(word.substring(0, 1)).concat("ay"));

        return optionalSting.orElse("");
    }
}
