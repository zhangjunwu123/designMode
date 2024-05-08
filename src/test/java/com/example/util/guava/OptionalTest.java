package com.example.util.guava;

import com.google.common.base.Optional;
import org.junit.Test;


public class OptionalTest {

    @Test
    public void test() {
        Integer a = null;
        Integer b = 10;

        // call api
        // obj result
        // if obj != null

        Optional<Integer> optional = Optional.fromNullable(a);
        if (optional.isPresent()) {
            System.out.println("not null,value="+optional.get());
        }
    }
}
