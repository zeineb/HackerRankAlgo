import java.io.*;
import java.util.*;

public class Dichtomie {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[]array = new int[5];
        array[0] =1; 
        array[1] =6;
        array[2] =15;
        array[3] =17;
        array[4] =123;
        
        Boolean b = exists(array, 17, 0, 4);
        System.out.println(b);
    }
    
    static boolean exists(int[] ints, int k, int l, int r) {
		int m=(l+r)/2;
		Boolean find=false;
		
		while(l<=r && find==false) {
		    m=(l+r)/2;

		    if(ints[m]==k){
		        find= true;
		    }
		    else {
		        if (ints[m]<k) {
                    find=exists(ints,k,m+1,r);
		        }
		        else {
                    find=exists(ints,k,m-1,l);
		        }
		    }
		}
		
		return find;
}
}