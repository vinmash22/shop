package pro.sky.java.course2.shop;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class CartService {
    private final Set<Integer> items = new HashSet<>();

    public void add(int... ids) {
        for (int id : ids) {
            items.add(id);
        }
    }
    public Collection<Integer> getItems() {
        return items;
    }
}
