package com.atguigu.pojo;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
    private Integer totalCount;
    private BigDecimal totalPrice;

    public void addItem(CartItem cartItem){
        CartItem item = items.get(cartItem.getId());
        if (item==null){
            items.put(cartItem.getId(),cartItem);
        }else {
            item.setCount(item.getCount()+1);
            item.setTotalPrice(item.getPrice().multiply(new BigDecimal(item.getCount())));
        }
    }
    public void deleteItem(Integer id){
        items.remove(id);

    }
    public void clear(){
        items.clear();

    }
    public void updateCount(Integer id,Integer totalCount){
        CartItem item = items.get(id);
        if (item!=null){
            item.setCount(totalCount);
            item.setTotalPrice(item.getPrice().multiply(new BigDecimal(item.getCount())));
        }

    }

    @Override
    public String toString() {
        return "Cart{" +
                "totalCount=" + getTotalCount() +
                ", totalPrice=" + getTotalPrice() +
                ", items=" + items +
                '}';
    }

    public Integer getTotalCount() {
        totalCount=0;
        for (Map.Entry<Integer, CartItem> entry:items.entrySet()
        ){totalCount+=entry.getValue().getCount();


        }
        return totalCount;
    }



    public BigDecimal getTotalPrice() {
        totalPrice=new BigDecimal(0);
        for(Map.Entry<Integer,CartItem> entry:items.entrySet()){
            totalPrice=totalPrice.add(entry.getValue().getTotalPrice());
        }
        return totalPrice;
    }



    public Map<Integer,CartItem> getItems() {
        return items;
    }

    public void setItems(Map<Integer,CartItem> items) {
        this.items = items;
    }

    private Map<Integer,CartItem> items=new LinkedHashMap<>();
}
