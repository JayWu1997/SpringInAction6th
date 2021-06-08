package cn.jay.tacocloud.web;

/**
 * @ClassName: OrderController
 * @Description: operations on orders
 * @Author: jay wu
 * @Date: 2021/6/2 10:00
 * @Version: 1.0
 */
import cn.jay.tacocloud.TacoOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("tacoOrder", new TacoOrder());
        return "orderForm";
    }

    @PostMapping
    public String processOrder(TacoOrder order) {
        log.info("Order submitted: " + order);
        System.out.println("" + order);
        return "redirect:/";
    }
}