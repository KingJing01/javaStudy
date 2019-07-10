package com.king.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
* @Description: List 基础
* @Author: kingJing
* @Date: 2019/6/25 17:12
**/
public class ListDemo {
    public static void main(String[] args) {
        List<String> origin = new ArrayList<String>();
        for(int i = 0 ;i < 10 ;i++){
            origin.add("data"+i);
        }
        iteratorMethods(origin);
    }
    /**
     * iterator 测试
     * @param list
     */
    public static void iteratorMethods(List<String> list){
        for(Iterator iterator = list.iterator(); iterator.hasNext();){
            System.out.println(iterator.next().toString());
        }
    }
}
