package com.ss.dataStructuresInJavaPart1.reversearray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallerInArray {

    public static void main(String[] args) {

        int[] nums ={1,2,3,4};

        Arrays.sort(nums);

        int size = nums.length;

        List<Integer> l = new ArrayList<>();
        for (int num:nums){
            if (num<size){
                l.add(num);
            }
        }




    }

}
