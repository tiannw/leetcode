package lego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class findMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        list.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));

        Collections.sort(list);
        if (list.size() == 0){
            return 0;
        }
        if(list.size()%2>0){
            return list.get(((list.size()+1)/2)-1);
        }else {
            int a = list.size()/2;
            return  (double)(list.get(a) +list.get(a-1))/2;
        }

    }}