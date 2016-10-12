import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int dg1=0;
        int dg2=0;
        
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int b;
        int[][] array = new int[n][n];
        int d=0;
        
        if (n%2!=0) {

            array=construct_matrix(n,in);

            display_matrix(array,n);   
            
                      for (int i=0; i<n*n;i++) {
                        for (int j=0;j<n;j++) 
                            if (i==j) {
                            dg1+=array[i][j];
                        }
                        //    System.out.println();
                      }
            
                    for (int i=0; i<n;i++) {
                        
                            dg2+=array[i][n-i-1];
                                   
                      }
            if (dg1>=dg2)
            d=dg1-dg2;
            else
            d=dg2-dg1;
            System.out.println(d);
            
          }
        else {
            System.out.println("not a valid matrix");
        }

     
    }
    
    public static int[][] construct_matrix(int nbr, Scanner inn) {
        int b;
        int[][] a = new int[nbr][nbr];
          for (int i=0; i<nbr*nbr;i++) {
            for (int j=0;j<nbr;j++) {
                if(inn.hasNext()){
                b = inn.nextInt();
                a[i][j]=b;
                
 
                }
            }

                         
    }
        return a;
    }
    
    public static void display_matrix(int[][] a, int nbr) {
                  for (int i=0; i<nbr;i++) {
                        for (int j=0;j<nbr;j++) 
                  
                            System.out.print(a[i][j] + " ");
                         
                            System.out.println();
                         
    }
    }
    

}