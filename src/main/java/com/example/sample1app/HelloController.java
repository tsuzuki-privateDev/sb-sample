package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)    // 引数が複数ある場合は、引数名を指定して書く   // @GetMapping("/") という書き方もできる
    public ModelAndView index(ModelAndView mav) {
        mav.addObject("msg", "名前を書いてください。");
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)   // @PostMapping という書き方もできる
    public ModelAndView form(@RequestParam("text1") String str, ModelAndView mav) {
        mav.addObject("msg", "こんにちは、" + str + "さん！" );
        mav.addObject("value", str);
        mav.setViewName("index");
        return mav;
    }
}
