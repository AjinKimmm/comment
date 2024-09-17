package com.plc.comment;


import org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //annotation : 아래 클래스가 컨트롤러 기능 수행한다는뜻.이래야 컨트롤러 인식함
public class HelloController {
    @GetMapping("/hello")

    @ResponseBody //ㅁ메서드 출력결과가 문자열임을 나타냄
    public String hello(){ //url명과 메서드명 달라도됨
        return "Hello World";
    }

}



