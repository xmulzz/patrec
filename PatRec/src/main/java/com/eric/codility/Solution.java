package com.eric.codility;

public class Solution {
	
	public static void main(String[] args){
		//Solution s = new Solution();
		//System.out.println(s.solution(5));
		System.out.println("test");
		
	}
	public int solution(int N){
		String s = Integer.toBinaryString(N);
		System.out.println(s);
		int[] a = {0,-1,-1,0}; // len, firstIndex of '1', lastIndex of '1', tempLen
 		for(int i = 0, len = s.length(); i < len ; i++){		
			if(String.valueOf(s.charAt(i)).equals("0")){
				if(a[1] >= 0 && a[2] <= a[1]){
					a[3]++;            // length keep going;
				}else if(a[2] > a[1]){
					/*if(a[3]>a[0]){
						a[0] = a[3];   // update new length value;
						a[3] = 1;      // set tempLen back to zero;
					}*/
					a[0] = a[3];
					a[1] = i - 1;
					a[2] = -1;
				}
			}else{
				if(a[1] == -1){
					a[1] = i;
				}else{
					if( a[1] == i-1){
						a[1] = i;
					}else{
						a[2] = i;
					}
				}
			}
		}
		
 		if(a[2]>a[1] && (a[2]-a[1])>a[0]){
 			return a[2] - a[1];
 		}
		return a[0];
	}

}
