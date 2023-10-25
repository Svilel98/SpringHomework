package pro.sky.spring.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.spring.service.ServiceBasketImpl;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ControllerBasket {
    private ServiceBasketImpl serviceBasket;

    public ControllerBasket(ServiceBasketImpl serviceBasket) {
        this.serviceBasket = serviceBasket;
    }
    @GetMapping(path = "/add")
    public boolean addProductInBasket(@RequestParam("productList") ArrayList<Integer> productList){
        return serviceBasket.addProductInBasket(productList);
    }
    @GetMapping(path = "/get")
    public List<Integer> getProductInBasket(){
        return serviceBasket.getProductInBasket();
    }
}
