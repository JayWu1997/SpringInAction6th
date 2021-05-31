package cn.jay.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: HomeController
 * @Description: Home page controlelr
 * @Author: jay wu
 * @Date: 2021/5/24 13:32
 * @Version: 1.0
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
