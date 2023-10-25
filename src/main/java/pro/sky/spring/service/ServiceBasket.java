package pro.sky.spring.service;

import java.util.List;

public interface ServiceBasket {
boolean addProductInBasket(List<Integer> product);
List<Integer> getProductInBasket();
}
