import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long nocc=n/s.length();
        long remaining = n%s.length();
        for (int i=0;i<nocc-1;i++) {
            s+=s;
        }
        s=s.substring(0,(int)n); 
        int count = s.length() - s.replace("a", "").length();
        System.out.println(count);
    }
}