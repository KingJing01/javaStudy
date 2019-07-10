package com.king.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetDemo {

    public static void main(String[] args) {
        String[] arr = {"jack","tom","apple","jack","nick","anta","eclipse","tom"};
        List<String> list = Arrays.asList(arr);
        // 不保证顺序行
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (String data:list) {
            hashSet.add(data);
            linkedHashSet.add(data);
        }
        System.out.println("------------------ hashSet  无法保证顺序 ------------------");
        for (String setData:hashSet) {
            System.out.println(setData);
        }
        System.out.println("------------------ LinkedhashSet 保证有序 ------------------");
        //使用迭代器进行数据遍历
        for(Iterator iterator = linkedHashSet.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }


}
