import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        
        char[][] array = construct_matrix(n);
        
        display_matrix(array,n);
    }
    
       public static char[][] construct_matrix(int nbr) {
        int b;
        char[][] a = new char[nbr][nbr];
          for (int i=0; i<nbr;i++) {
            for (int j=nbr-1;j>nbr-i-1;j--){ 
                a[i][j]='#';
          }
 
                }
                                  
        return a;
    }
    
        public static void display_matrix(char[][] a, int nbr) {
                  for (int i=0; i<nbr;i++) {
                        for (int j=0;j<nbr;j++) 
                  
                            System.out.print(a[i][j] + " ");
                         
                            System.out.println();
                         
    }
    }
}