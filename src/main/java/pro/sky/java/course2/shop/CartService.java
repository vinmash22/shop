package pro.sky.java.course2.shop;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@SessionScope
public class CartService {
    private final List<Integer> items = new ArrayList<>();

    public void add(int... ids) {
        for (int id : ids) {
            items.add(id);
        }
    }
    public List<Integer> getItems() {
        return items;
    }
}
