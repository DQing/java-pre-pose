package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> keys = object.get("value");
        for (String key: keys) {
            updateCollectionValue(collectionA, key);
        }

        return collectionA;
    }

    private void updateCollectionValue(Map<String, Integer> collectionA, String key) {
        Integer originalValue = collectionA.get(key);
        Integer destinationValue = originalValue - originalValue / 3;
        collectionA.put(key, destinationValue);
    }
}
