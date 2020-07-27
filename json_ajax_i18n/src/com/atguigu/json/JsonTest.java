package com.atguigu.json;

import com.atguigu.pojo.Person;
import com.google.gson.Gson;
import org.junit.Test;

public class JsonTest {
    @Test
    public void test1(){
        Person person = new Person(22, "小毛驴");
        Gson gson=new Gson();
        String s = gson.toJson(person);
        System.out.println(s);
        Person person1 = gson.fromJson(s, Person.class);
        System.out.println(person1);
    }
}