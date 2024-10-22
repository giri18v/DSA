package com.dsa.assignments;

import java.util.ArrayList;
import java.util.List;

public class PanCakeSwap {


    public static void main(String[] args) {

        int[] nums ={1,2,3};

        System.out.println(pancakeSort(nums));

    }
        public static List<Integer> pancakeSort(int[] arr) {
            List<Integer> list = new ArrayList<>();
            int len = arr.length-1;
            if(len < 0){
                return list;
            }

            while(len >=0){

                int maxElement = maxElementIndex(arr,len);

                if(maxElement != len){

                    swap(arr,0,maxElement);
                    list.add(maxElement+1);
                    swap(arr,0,len);
                    list.add(len+1);
                }
                len--;
            }

            return list;
        }


        static int[] swap(int[] arr,int start,int end){

            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] =temp;
                start++;
                end--;
            }

            return arr;
        }

        static int maxElementIndex(int[] arr,int len){

            int maxElementIndex = 0;
            int maxElement = arr[0];
            for(int i=1;i<=len;i++){
                if(arr[i] > maxElement){
                    maxElement = arr[i];
                    maxElementIndex =i;
                }

            }
            return maxElementIndex;
        }

    }

