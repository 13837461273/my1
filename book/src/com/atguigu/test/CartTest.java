package com.atguigu.test;

import com.atguigu.pojo.Cart;
import com.atguigu.pojo.CartItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CartTest {

    @Test
    public void addItem() {
        Cart cart=new Cart();
        cart.addItem(new CartItem(1,"书",23,new BigDecimal(33.33),new BigDecimal(33.33)));
        cart.addItem(new CartItem(1,"书",23,new BigDecimal(33.33),new BigDecimal(33.33)));
        cart.addItem(new CartItem(2,"书2",23,new BigDecimal(33.33),new BigDecimal(33.33)));
        System.out.println(cart);
    }

    @Test
    public void deleteItem() {
    }

    @Test
    public void clear() {
    }

    @Test
    public void updateCount() {
    }
}