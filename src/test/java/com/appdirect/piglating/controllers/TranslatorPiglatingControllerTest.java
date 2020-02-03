package com.appdirect.piglating.controllers;

import com.appdirect.piglating.entity.TranslationRequest;
import com.appdirect.piglating.service.TranslatorService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
//@WebMvcTest(TranslatorPiglatingController.class)
@SpringBootTest
class TranslatorPiglatingControllerTest {
    @MockBean
    private TranslatorService service;

    @Autowired
    private TranslatorPiglatingController controller;

    /*@Autowired
    private MockMvc mvc;


    void getSingleWordTranslation() throws Exception {

        mvc.perform(MockMvcRequestBuilders.get("/translator/singleWordTranslation")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", IsCollectionWithSize.hasSize(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name", CoreMatchers.is("ellohay")));
    }*/

    @Test
    void getSingleWordTranslationTest() {
        TranslationRequest request = new TranslationRequest();
        request.setLanguageFrom("English");
        request.setSentenceToTranslate("hello");
        given(service.getSingleWordTranslation(eq("hello"))).willReturn("ellohay");

        String translatedSentence = controller.getSingleWordTranslation(request);

        assertEquals("ellohay", translatedSentence);
    }
}