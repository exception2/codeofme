/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static long largestArea(long A[],int n){
        Stack<Integer> st=new Stack<>();
        int s=0;
        long la=Integer.MIN_VALUE;
        while(s<n){
            if(st.empty() || A[st.peek()]<=A[s]){
                st.push(s++);
            }
            else{
                int top=st.pop();
                long current_la=A[top]*((st.empty())?s:s-st.peek()-1);
                la=Math.max(la,current_la);
            }
        }
        while(!st.empty()){
            int top=st.pop();
            long current_la=A[top]*((st.empty())?s:s-st.peek()-1);
            la=Math.max(la,current_la);
        }
        return la;
    }
	public static void main (String[] args) throws Exception {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(in.readLine());
		while(t--!=0){
		    int n=Integer.parseInt(in.readLine());
		    String input=in.readLine();
		    String input0[]=input.split(" ");
		    long A[]=new long[n];
		    for(int i=0;i<n;i++){
		        A[i]=Long.parseLong(input0[i]);
		    }
		    System.out.println(largestArea(A,n));
		}
	}
}