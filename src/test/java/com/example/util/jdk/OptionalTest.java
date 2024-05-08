package com.example.util.jdk;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void test() {
        Optional<Object> o = Optional.ofNullable(null);
        o.isPresent();
        o.get();
    }
}
