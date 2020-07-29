package utils;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Collection util class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-29
 */
public class CollectionUtil {

    /**
     * This method is used to merge two sorted collections.
     *
     * @param first This is the first sorted collection.
     * @param second This is the second sorted collection.
     * @return Collection This returns the merged sorted collection.
     */
    public static <T extends Comparable<T>> Collection<Comparable<T>> merge(Collection<T> first, Collection<T> second) {
        SortedSet<Comparable<T>> result = new TreeSet<Comparable<T>>();
        result.addAll(first);
        result.addAll(second);

        return result;
    }
}
