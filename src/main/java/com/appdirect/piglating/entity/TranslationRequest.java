package com.appdirect.piglating.entity;

public class TranslationRequest {
    private String sentenceToTranslate;

    private String languageFrom;

    public String getSentenceToTranslate() {
        return sentenceToTranslate;
    }

    public void setSentenceToTranslate(String sentenceToTranslate) {
        this.sentenceToTranslate = sentenceToTranslate;
    }

    public String getLanguageFrom() {
        return languageFrom;
    }

    public void setLanguageFrom(String languageFrom) {
        this.languageFrom = languageFrom;
    }
}
