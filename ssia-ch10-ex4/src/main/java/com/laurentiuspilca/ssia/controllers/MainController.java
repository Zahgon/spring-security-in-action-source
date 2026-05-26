package com.laurentiuspilca.ssia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.logging.Logger;

@Controller
public class MainController {

    private Logger logger = Logger.getLogger(MainController.class.getName());

    @GetMapping("/")
    public String main() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @PostMapping("/test")
    @ResponseBody
    public //    @CrossOrigin("http://localhost:8080")
    String test() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
