package com.mercadopago.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {
    @Value("APP_USR-219ae4e3-3e73-4d39-a44a-603aab3c922f")
    private String mercadoPagoSamplePublicKey;

    @GetMapping
    public String renderMainPage(Model model) {
        model.addAttribute("publicKey", mercadoPagoSamplePublicKey);
        return "index";
    }
}
