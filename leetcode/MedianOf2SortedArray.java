package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */

public class MedianOf2SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MedianOf2SortedArray moa = new MedianOf2SortedArray();
		int nums1[] = {1, 2};
		int nums2[] = {3, 4};
		double res = moa.findMedianSortedArrays(nums1, nums2);
		System.out.println(res);

	}
	
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
	int n1 = nums1.length;
	int n2 = nums2.length;
	
	double[] nums3 = new double[n1+n2];
	
	for(int i=0; i<n1;i++){
		nums3[i] = nums1[i];
	}int j=0;
	for(int i=n1; i<nums3.length;i++){
		nums3[i] = nums2[j];
		j++;
	}
	Arrays.sort(nums3);
	int mid = nums3.length/2;
	double res = 0.0;
	if(nums3.length % 2 == 0){
		return (nums3[mid-1]+nums3[mid])/2;
	} else {
		return nums3[mid];
	}
	
	
    }

}
