package com.example.util.apachecommons;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionUtilsTest {

    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    @Before
    public void init() {
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(18);
        list.add(8);

        // init list2
        list2.add(18);
        list2.add(4);
        list2.add(9);
        list2.add(6);
        list2.add(7);
        list2.add(15);
        list2.add(12);
    }

    // judge void
    @Test
    public void testEmpty() {
        System.out.printf("集合是否为空: %s \n", CollectionUtils.isEmpty(list));
    }

    // 并集，交集，差集，补集
    @Test
    public void testOperations() {
        // union 并集
        Collection<Integer> union = CollectionUtils.union(list, list2);
        System.out.println(union);
        //intersection 交集
        Collection<Integer> intersection = CollectionUtils.intersection(list, list2);
        System.out.println(intersection);
        // disjunction 补集
        Collection<Integer> disjunction = CollectionUtils.disjunction(list, list2);
        System.out.println(disjunction);
        // subtract 差集
        Collection<Integer> subtract = CollectionUtils.subtract(list, list2);
        System.out.println(subtract);
    }
}
