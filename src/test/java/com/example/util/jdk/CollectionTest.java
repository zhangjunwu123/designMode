package com.example.util.jdk;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

    List<Integer> list = new ArrayList<>();

    @Before
    public void init() {
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(18);
        list.add(8);
    }


    // sort
    @Test
    public void testSort() {

        Collections.sort(list);//升序  Arrays.sort
        System.out.println(list);

        Collections.reverse(list);//降序
        System.out.println(list);
    }

    @Test
    public void testMaxOrMin() {

        // how to impl ?
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
    }

    // synchronizedxxx 方法
    @Test
    public void testConcurrentCollection() {
        List<Integer> synList = Collections.synchronizedList(this.list);

        synList.add(17);
        // juc
    }


    @Test
    public void testEmptyCollection() {
        // not a empty ArrayList, a EmptyList type
        Collections.emptyList();
        Collections.emptyMap();
        Collections.emptySet();
    }


    // binarySearch
    @Test
    public void testBinarySearch() {
        // must be sort
        Collections.sort(list);
        int i = Collections.binarySearch(list, 8);
        System.out.println(i);
    }

    // unmodifiablexxx
    @Test
    public void testUnmodifiable() {
        // return UnmodifiableList
        List<Integer> list = Collections.unmodifiableList(this.list);
        list.add(25);
    }

    // other ........

}
