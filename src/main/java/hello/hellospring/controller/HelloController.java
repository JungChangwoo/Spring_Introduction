package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello") // 웹 어플리케이션에서 hello라고 들어오면 이 메소드를 호출해줌
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";
    }
    @GetMapping("hello-mvc")
    public String hello_mvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }
    //html로 주는게 아니라 그냥 문자 자체가 클라이언트에게 보여짐
    @GetMapping("hello-string")
    @ResponseBody
    public String hello_stirng(String name){
        return "hello"+name;
    }
    //json형식으로 // json은 key - value로 이루어짐
    @GetMapping("hello-api")
    @ResponseBody
    public Hello hello_api(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }
    static class Hello {
        private String name;

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
}
