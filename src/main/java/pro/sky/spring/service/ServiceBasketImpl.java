package pro.sky.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ServiceBasketImpl implements ServiceBasket {
    private final List<Integer> basketList = new ArrayList();

    @Override
    public boolean addProductInBasket(List<Integer> product) {
        return basketList.addAll(product);
    }

    @Override
    public List<Integer> getProductInBasket() {
        return basketList;
    }
}
