package marvel.geni.nutrientanalysis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("v1/")
public class TestController {
    @GetMapping("test")
    public String test(){
        return "nutrient-analysis-test";
    }

}
