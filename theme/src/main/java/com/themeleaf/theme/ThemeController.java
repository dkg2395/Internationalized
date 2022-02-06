package com.themeleaf.theme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThemeController {

    //http://localhost:8080/index?language=fr    Internationalized

    //http://localhost:8080/index
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/locale")
    public String locale() {
        return "locale";
    }
}
