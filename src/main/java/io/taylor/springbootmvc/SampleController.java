package io.taylor.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
//    @CrossOrigin(origins = "https://localhost:18080")  // cors 개별 설정
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "taylor");
        return "hello";
    }
}
