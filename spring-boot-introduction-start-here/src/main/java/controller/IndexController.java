package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class IndexController {
    //http://localhost:8080/にアクセス後、Helloworldを表示
    @GetMapping
    public String index(){
        return "index";
    }
}
