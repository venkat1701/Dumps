import java.util.*;

class Solution {
    public static boolean solve(String s) {
        String rev="";
        for(int i=0;i<=s.length()-1;i++)
        {
            rev=s.charAt(i)+rev;
        }
        if(s.contains(rev))
        return true;
        else
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(solve(s));
    }
}