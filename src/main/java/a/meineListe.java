package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class meineListe {
	
	/**
	 * Methode, die zwei Listen zusammenführt, duplizierte Elemente entfernt und die Elemente sortiert zurückgibt.
	 * @param list1
	 * @param list2
	 * @return sortierte zusmammengefügte Liste ohne Duplikate
	 */
    public List<Integer> mergeAndSortLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> mergedSet = new HashSet<>(list1);
        mergedSet.addAll(list2);
        List<Integer> mergedList = new ArrayList<>(mergedSet);
        Collections.sort(mergedList);
        return mergedList;
    }
}
