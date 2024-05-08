package com.example.util.guava;

import com.google.common.base.Preconditions;
import org.junit.Test;

import javax.validation.constraints.NotEmpty;

public class PreconditionsTest {


    @Test
    public void test(Object obj) {
        String name = "ts";
        Preconditions.checkNotNull(name,"name should not be empty.");
        Preconditions.checkArgument(!"".equals(name),"name should not be empty.");
        int age = 10;
        Preconditions.checkArgument(age >= 0 && age < 100,"age should not be negative.");
    }
}
