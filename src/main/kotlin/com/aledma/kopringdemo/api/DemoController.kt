package com.aledma.kopringdemo.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/demo")
class DemoController {

    @GetMapping("/test")
    fun greeting() : String {
        return "Hello Kopring";
    }
}
