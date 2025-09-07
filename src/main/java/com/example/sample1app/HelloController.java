package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/{temp}")
    public String index(@PathVariable("temp") String temp) {    // コンパイラオプションで -parameters を有効化していないとValue属性いれないとエラーになる。あと、引数名とパス変数名が違うときも。
        switch (temp) {
            case "index":
                return "index";
        
            default:
                return "other";
        }
    }
}
