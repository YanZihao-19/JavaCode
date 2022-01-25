package map;

import java.util.*;

/**
 * @author 燕子豪
 */
public class MapFor {

    public static void main(String[] args) {
        Map<String, Integer> hs = new HashMap<>();
        hs.put("yzh", 20);
        hs.put("zl", 20);
        hs.put("zs", 19);
        hs.put("ls", 18);
        hs.put("ww", 17);

        // 第一种遍历:Set<K> keySet(); V get(K);和foreach或迭代器
        Set<String> set1 = hs.keySet();
        System.out.println("第一种遍历");
        for (String s : set1) {
            System.out.println(s + "=" + hs.get(s));
        }
        System.out.println("===============");
        // 迭代器
        Iterator<String> it1 = set1.iterator();
        while (it1.hasNext()) {
            String next = it1.next();
            System.out.println(next + "=" + hs.get(next));
        }
        System.out.println("===============");


        // 第二种遍历：Collection<> values();和foreach或迭代器(用的少，因为只能遍历value信息)
        Collection<Integer> c1 = hs.values();
        System.out.println("第二种遍历");
        for (Integer i : c1) {
            System.out.println("value=" + i);
        }
        System.out.println("===============");
        // 迭代器
        Iterator<Integer> it2 = c1.iterator();
        while (it2.hasNext()) {
            Integer next = it2.next();
            System.out.println("value=" + next);
        }
        System.out.println("===============");


        // 第三种遍历:Set<Entry> entrySet();K getKet();V getValue();和foreach或迭代器
        Set<Map.Entry<String, Integer>> set2 = hs.entrySet();
        System.out.println("第三种遍历");
        for (Map.Entry<String, Integer> me : set2) {
            System.out.println(me.getKey() + "=" + hs.get(me.getKey()));
        }
        System.out.println("===============");
        //迭代器
        Iterator<Map.Entry<String, Integer>> it3 = set2.iterator();
        while (it3.hasNext()) {
            Map.Entry<String, Integer> next = it3.next();
            System.out.println(next.getKey() + "=" + hs.get(next.getKey()));
        }
    }
}

