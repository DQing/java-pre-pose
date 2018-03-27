package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Set<String> collection1WithoutDuplicates = new HashSet<>(collection1);
        Map<String, Integer> result = new HashMap<>();
        for (String s : collection1WithoutDuplicates) {
            Integer count = Collections.frequency(collection1, s);
            result.put(s, count);
        }
        return result;
    }
}
