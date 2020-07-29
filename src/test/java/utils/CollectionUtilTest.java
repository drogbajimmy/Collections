package utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Collection util test class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-29
 */
public class CollectionUtilTest {

    @Test
    public void testMergeWithTreeSet() {
        Collection<Integer> first = new TreeSet<>();
        first.add(-10);
        first.add(10);
        first.add(0);

        Collection<Integer> second = new TreeSet<>();
        second.add(1);
        second.add(12);
        second.add(0);

        Collection actual = CollectionUtil.merge(first, second);
        assertNotNull(actual);
        assertEquals(5, actual.size());
        Iterator<Integer> it = actual.iterator();
        assertEquals(-10, Integer.valueOf(it.next()).intValue());
        assertEquals(0, Integer.valueOf(it.next()).intValue());
        assertEquals(1, Integer.valueOf(it.next()).intValue());
        assertEquals(10, Integer.valueOf(it.next()).intValue());
        assertEquals(12, Integer.valueOf(it.next()).intValue());
    }

    @Test
    public void testMergeWithList() {
        Collection<Integer> first = new ArrayList<>();
        first.add(-100);
        first.add(10);
        first.add(0);

        Collection<Integer> second = new ArrayList<>();
        second.add(10);
        second.add(12);
        second.add(1);

        Collection actual = CollectionUtil.merge(first, second);
        assertNotNull(actual);
        assertEquals(5, actual.size());
        Iterator<Integer> it = actual.iterator();
        assertEquals(-100, Integer.valueOf(it.next()).intValue());
        assertEquals(0, Integer.valueOf(it.next()).intValue());
        assertEquals(1, Integer.valueOf(it.next()).intValue());
        assertEquals(10, Integer.valueOf(it.next()).intValue());
        assertEquals(12, Integer.valueOf(it.next()).intValue());
    }

    @Test
    public void testMergeWithOneBlankTreeSet() {
        Collection<Integer> first = new TreeSet<>();
        first.add(-10);
        first.add(10);
        first.add(0);

        Collection<Integer> second = new TreeSet<>();

        Collection actual = CollectionUtil.merge(first, second);
        assertNotNull(actual);
        assertEquals(3, actual.size());
        Iterator<Integer> it = actual.iterator();
        assertEquals(-10, Integer.valueOf(it.next()).intValue());
        assertEquals(0, Integer.valueOf(it.next()).intValue());
        assertEquals(10, Integer.valueOf(it.next()).intValue());
    }

    @Test
    public void testMergeWithTwoBlankTreeSet() {
        Collection<Integer> first = new TreeSet<>();

        Collection<Integer> second = new TreeSet<>();

        Collection actual = CollectionUtil.merge(first, second);
        assertNotNull(actual);
        assertEquals(0, actual.size());
    }

    @Test
    public void testMergeWithOneBlankList() {
        Collection<Integer> first = new ArrayList<>();
        first.add(-100);
        first.add(10);
        first.add(0);

        Collection<Integer> second = new ArrayList<>();

        Collection actual = CollectionUtil.merge(first, second);
        assertNotNull(actual);
        assertEquals(3, actual.size());
        Iterator<Integer> it = actual.iterator();
        assertEquals(-100, Integer.valueOf(it.next()).intValue());
        assertEquals(0, Integer.valueOf(it.next()).intValue());
        assertEquals(10, Integer.valueOf(it.next()).intValue());
    }

    @Test
    public void testMergeWithTwoBlankList() {
        Collection<Integer> first = new ArrayList<>();

        Collection<Integer> second = new ArrayList<>();

        Collection actual = CollectionUtil.merge(first, second);
        assertNotNull(actual);
        assertEquals(0, actual.size());
    }
}
