package com.moloko.javapractice.IntersectionLists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Jack Milk
 */
public class IntersectionLists {
    public static Set<Integer> intersectionLists(List<Integer> l1, List<Integer> l2){
        Set<Integer> hs1 = new HashSet<>(l1);
        Set<Integer> hs2 = new HashSet<>(l2);
        hs1.retainAll(hs2);
        return hs1;
    }
}
