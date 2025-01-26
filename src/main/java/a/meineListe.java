package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class meineListe {
	
	/**
	 * Methode, die zwei Listen zusammenführt, duplizierte Elemente entfernt und die Elemente sortiert zurückgibt.
	 * @param list1
	 * @param list2
	 * @return sortierte zusmammengefügte Liste ohne Duplikate
	 */
    public List<Integer> mergeAndSortLists(List<Integer> list1, List<Integer> list2) {
/*        if (list1 == null && list2 == null) {
            throw new IllegalArgumentException("Beide Eingabelisten dürfen nicht null sein.");
        }
*/
		if (list1 == null && list2 == null) {
			return null;
		}
    	
        // Behandle null als leere Listen
        if (list1 == null) list1 = new ArrayList<>();
        if (list2 == null) list2 = new ArrayList<>();


        // Zusammenführen der Listen und Entfernen von Duplikaten
        Set<Integer> mergedSet = new TreeSet<>(list1);
        mergedSet.addAll(list2);

        // Rückgabe der sortierten Liste
        return new ArrayList<>(mergedSet);
    }
}
