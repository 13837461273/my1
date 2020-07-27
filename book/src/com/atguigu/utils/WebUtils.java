package com.atguigu.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class WebUtils {
    public static <T> T copyParameterToBean(Map value, T bean){
        try {

            System.out.println(bean);
            BeanUtils.populate(bean,value);
            System.out.println(bean);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();}
        return bean;
    }
    public static int parseInt(String str,int defaultValue){

        try {  if (str!=null){
            return Integer.parseInt(str);}
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultValue;
    }
}
