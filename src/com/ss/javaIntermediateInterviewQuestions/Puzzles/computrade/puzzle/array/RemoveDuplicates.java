package com.ss.javaIntermediateInterviewQuestions.Puzzles.computrade.puzzle.array;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums1= {0,0,1,1,1,2,2,3,3,4};

        int prev=nums1[0];
        int j=0;
        for (int i=1; i<nums1.length;i++){

            if (prev != nums1[i]){
                prev=nums1[i];
                nums1[j] = nums1[i];
                j++;
            }
        }

        System.out.println(j+1);
    }

}
