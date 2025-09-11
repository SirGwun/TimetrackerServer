package com.timetracker.server;

import jdk.jfr.ContentType;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
class PageController {
    @GetMapping("/home")
    String home() { return "home"; }

    // Отдаст JSON
    @GetMapping("/ping")
    @ResponseBody
    Map<String, String> ping() { return Map.of("ok", "true"); }
}
