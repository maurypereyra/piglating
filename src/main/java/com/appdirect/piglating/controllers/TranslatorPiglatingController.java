package com.appdirect.piglating.controllers;

import com.appdirect.piglating.entity.TranslationRequest;
import com.appdirect.piglating.service.TranslatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/translator")
public class TranslatorPiglatingController {

    @Autowired
    private TranslatorService translationService;

    @PostMapping("/singleWordTranslation")
    public String getSingleWordTranslation(@RequestBody TranslationRequest translationRequest) {
        String translation = "";
        translation = translationService.getSingleWordTranslation(translationRequest.getSentenceToTranslate());
        return translation;
    }

    @PostMapping("/sentenceTranslation")
    public String getSentenceTranslation(@RequestBody TranslationRequest translationRequest) {
        return translationService.getSentenceTranslation(translationRequest.getSentenceToTranslate());
    }
}
