import java.util.*;
class CaesenCipherROT13
{
    static String cipher(String str)
    {
        String fstr="";
        char ch;
        for(int i=0;i<=str.length()-1;i++)
        {
            ch=str.charAt(i);
            int j=(int)ch+13;
            if((Character.isUpperCase(ch)==true && j>90) || (Character.isLowerCase(ch)==true && j>122))
            {                
                j=j-26;
            }           
            fstr=fstr+(char)j;
        }
        return fstr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Plain Text: "+str);
        System.out.println("Cipher Text: "+cipher(str));
    }
}