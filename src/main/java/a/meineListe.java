package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class meineListe {
    public List<Integer> mergeAndSortLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> mergedSet = new HashSet<>(list1);
        mergedSet.addAll(list2);
        List<Integer> mergedList = new ArrayList<>(mergedSet);
        Collections.sort(mergedList);
        return mergedList;
    }
}
