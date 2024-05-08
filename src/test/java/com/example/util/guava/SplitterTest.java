package com.example.util.guava;

import com.google.common.base.Splitter;
import org.junit.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SplitterTest {

    @Test
    public void test1() {
        String str = "foo,bar,,  qux,";
        String[] strings = str.split(",");
        Arrays.stream(strings).forEach(s -> System.out.println(s));
    }

    @Test
    public void test2() {
        String str = "foo,bar,,  qux,";
        List<String> list = new ArrayList<>();
        Splitter.on(",")
                .trimResults() // trim
                .omitEmptyStrings()
                .split(str)
                .forEach(x -> list.add(x));
        System.out.println(list);
    }


    @Test
    public void test3() {
        // web http uri params
        String params = "id=123&name=ts&age=18";
        Map<String, String> split = Splitter.on("&").withKeyValueSeparator("=").split(params);
        System.out.println(split);
    }
}
