package com.gmail.arthurstrokov.cloud.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Артур Александрович Строков
 * @email astrokov@clevertec.ru
 * @created 14.10.2022
 */
@RestController
public class CloudController {

    @GetMapping
    public String hello() {
        return "Hello! I'm cloud-configuration-server.";
    }

    @GetMapping("/dev")
    public String helloDevTools() {
        return "Hello dev tools!";
    }
}
