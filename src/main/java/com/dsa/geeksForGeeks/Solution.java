package com.dsa.geeksForGeeks;

class Solution{

    public static void main(String[] args) {
        System.out.println(evenlyDivides(12));
    }
    static int evenlyDivides(int n){
    int temp =n;
     int count =0;    
      while(n >10) {
          int rem = n%10;
          if(rem % n == 0){
              count++;
          }
          n=n/10;
      }
      if(n % temp == 0){
          count++;
      }
        
       return count; 
        
    }
}