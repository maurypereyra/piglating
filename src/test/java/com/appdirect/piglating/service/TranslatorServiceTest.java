package com.appdirect.piglating.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class TranslatorServiceTest {
    @Autowired
    TranslatorService translatorService;

    @Test
    void getSingleWordTranslation() {
        assertEquals("ellohay", translatorService.getSingleWordTranslation("hello"));
    }

    @Test
    void get() {
        assertEquals("ellohay owhay reaay ouyay", translatorService.getSentenceTranslation("hello how are you"));
    }
}