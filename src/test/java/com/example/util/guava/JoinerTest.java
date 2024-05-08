package com.example.util.guava;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.ArrayList;
import java.util.List;

public class JoinerTest {

    // ["ts","zm","ddd","xz"] =====join,  # -> ts#zm#

    List<String> data;

    @Before
    public void init() {
        data = new ArrayList<String>() {{
            add("ts");
            add("zm");
            add(null);
            add("ddd");
            add("xz");
        }};
    }


    @Test
    public void javaJoin() {
        String join = join(data, "&");
        System.out.println(join);
    }

    public String join(List<String> list,String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            if (s!=null) {
                sb.append(s).append(delimiter);
            }
        }
        // trim last delimiter
        sb.setLength(sb.length() - delimiter.length());
        return sb.toString();
    }


    @Test
    public void guavaJoin() {
        String join = Joiner.on("#")
                .skipNulls()
                .join(data);
        System.out.println(join);

        String join1 = String.join("%", data);
        System.out.println(join1);
    }


  //  http get params
    @Test
    public void test2() {
        // map<string,string>
        ImmutableMap<String, String> map = ImmutableMap.of("id", "123", "name", "ts", "age", "18");
        String join = Joiner.on("&").withKeyValueSeparator("=").join(map);
        System.out.println(join);
    }


}
