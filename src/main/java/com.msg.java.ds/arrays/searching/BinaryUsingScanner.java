package com.msg.java.ds.arrays.searching;

import java.util.Scanner;

public class BinaryUsingScanner {
        int f = 0;
        int l = 0;
        public int search(int[] nums, int target) {

            if(l>=f) {

                int mid = (f + l)/2;

                if(nums[mid] == target){
                    return mid;
                }
                else if ( target < nums[mid]){
                    l = mid - 1;
                    return search (nums, target);
                }
                else if(target > nums[mid]){
                    f = mid + 1;
                    return search (nums, target);
                }
            }

            return -1;
        }

        public static void main(String[] args) {

            BinaryUsingScanner s = new BinaryUsingScanner();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of elements you want to store: ");
            int n=sc.nextInt();
            int[] array = new int[n];
            System.out.println("Enter the elements of the array: ");

            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }

            System.out.print("Enter the target you want to find in the list");
            int target = sc.nextInt();
            s.l = n;
            int result = s.search(array, target);

            if (result == -1){
                System.out.println(target + "does not exist in nums so return" + result);
            }
            else {
                System.out.println(target + "exists in nums and its index is" + result);
            }
        }
    }

