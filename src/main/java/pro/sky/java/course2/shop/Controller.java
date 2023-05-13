package pro.sky.java.course2.shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/order")
public class Controller {

    private final CartService cartService;

    public Controller(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void add(@RequestParam int ... ids) {
        cartService.add();
    }
    @GetMapping("/get")
    public Collection<Integer> get() {
        return cartService.getItems();
    }
}
