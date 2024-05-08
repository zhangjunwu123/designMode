package com.example.util.guava;

import com.google.common.collect.*;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Test;

import java.util.*;

public class CollectionsTest {


    // guava create collection

    @Test
    public void test1() {
        List<String> list = Lists.newArrayList();
        List<String> list2 =Lists.newArrayList("张三","李四","王五");
        Map<String,String> map = Maps.newHashMap();
        //设置初始容量为100
        List<String> exactly100 = Lists.newArrayListWithCapacity(100);
        //设置初始预期容量，预期容量是 5+size+size/10
        List<String> approx100 = Lists.newArrayListWithExpectedSize(100);
        // capacity  =  expectedSize / 0.75F + 1.0F
        Set<String> approx100Set = Sets.newHashSetWithExpectedSize(100);
    }

    // 笛卡尔积
    @Test
    public void testCartesianProduct() {
        List<Integer> list1 = Lists.newArrayList(1, 2, 3);
        List<Integer> list2 = Lists.newArrayList(4,5);
        // 笛卡尔积
        List<List<Integer>> productList = Lists.cartesianProduct(list1,list2);
        System.out.println(productList);
    }

    // 分页 partition
    @Test
    public void testPartition() {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5);
        // size: page size
        List<List<Integer>> partitionList = Lists.partition(list, 2);
        System.out.println(partitionList);

        // get by page
        List<Integer> list1 = partitionList.get(1);
        System.out.println(list1);
    }

    @Test
    public void testReverse() {
        List<Integer> list = Lists.newArrayList(3, 1, 2);
        List<Integer> reverseList = Lists.reverse(list);
        System.out.println(reverseList);
    }

    // unmodifiable
    @Test
    public void test2() {
        // jdk unmodifiable
        Collections.unmodifiableList(new ArrayList<>());


        // guava  ImmutableXXX  -> ImmutableList  ImmutableMap ImmutableSet
        ImmutableList<Object> list = ImmutableList.builder().add("tes", "zm").build();
        ImmutableList<String> ofList = ImmutableList.of("ts", "zm", "xz", "ddd");
        ofList.add("lh" );
    }


    // multiSet

    @Test
    public void test3() {
        jdkWordCount();
        multiSetWordCount();;
    }


    public void multiSetWordCount() {
        HashMultiset<@Nullable String> multiset = HashMultiset.create();
        for (String s : STR_WORLD_ARRAY) {
            multiset.add(s);
        }
        //打印结果
        System.out.println("--------------单词出现频率--------------");
        for (String key : multiset.elementSet()) {
            System.out.println(key + " count：" + multiset.count(key));
        }
    }

    private String[] STR_WORLD_ARRAY = new String[]{"ts","ts","zm","ddd","xz","xz","zm","ddd","ddd"};

    public void jdkWordCount() {
        Map<String, Integer> countMap = new HashMap<>();
        //遍历单词
        for (String word : STR_WORLD_ARRAY) {

            Integer count = countMap.getOrDefault(word,0);
            /*if (!countMap.containsKey(word)) {
                countMap.put(word, 0);
            }
            ////获取key出现的次数并进行计数
            Integer count = countMap.get(word);*/
            //进行计数
            countMap.put(word, ++count);
        }
        //打印结果
        System.out.println("--------------单词出现频率--------------");
        for (String key : countMap.keySet()) {
            System.out.println(key + " count：" + countMap.get(key));
        }
    }




    // BiMap
     // key->value    value->key

    @Test
    public void test4() {
        BiMap<String, String> weekNameMap = HashBiMap.create();
        weekNameMap.put("星期一", "Monday");
        weekNameMap.put("星期二", "Tuesday");
        weekNameMap.put("星期三", "Wednesday");
        weekNameMap.put("星期四", "Thursday");
        weekNameMap.put("星期五", "Friday");
        weekNameMap.put("星期六", "Saturday");
        weekNameMap.put("星期日", "Sunday");

        String a = weekNameMap.get("星期一");
        System.out.println(a);
        // no force
        //weekNameMap.put("星期某", "Sunday");
        // force
        weekNameMap.forcePut("星期某", "Sunday");

        System.out.println("星期日的英文名是" + weekNameMap.get("星期日"));
        System.out.println("星期某的英文名是" + weekNameMap.get("星期某"));
        //通过这种方式获取key是不是十分简洁
        System.out.println("Sunday的中文是" + weekNameMap.inverse().get("Sunday"));
    }

    // MultiMap   [key:value]  Map<String,List<>>
    // http request params:   string[] params = rquest.getParameters("hobby")   hobby=lq&hobby=zq&hobby=j    Map<String,String[]> params = getParameterMap()
    @Test
    public void test5() {
        jdkCountScore();
        multimap();
    }

    private Map<String,Integer> studentMap = ImmutableMap.of("ts",90,"zm",80, "ddd",70,"xz",80,"qx",70);

    public void jdkCountScore() {
        Map<Integer, List<String>> scoreMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            if (!scoreMap.containsKey(entry.getValue())) {
                scoreMap.put(entry.getValue(),new ArrayList<>());
            }
            scoreMap.get(entry.getValue()).add(entry.getKey());
        }
        System.out.println("学员分数统计："+scoreMap);
    }

    public void multimap() {
        HashMultimap<Integer,String> multimap = HashMultimap.create();
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            multimap.put(entry.getValue(),entry.getKey());
        }
        System.out.println("学员分数统计："+multimap);

    }


}
