import java.io.*;
import java.util.*;

public class BonAppetit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int i=0; i < n; i++){
            c[i] = in.nextInt();
        }
        int sh = in.nextInt();
        
      int sum=0;
        if(k<n) {
            for (int i=0;i<n;i++) {
              if (i!=k){
                sum+=c[i];   
              }
            }
         
      }
     if (sum/2==sh) {
         System.out.println("Bon Appetit");
     }
        else
        System.out.println(sh -sum/2);    
    }
}