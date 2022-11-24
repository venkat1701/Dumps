import java.util.*;
class Cryptography
{
    static char encode(char ch)
    {
        ch=Character.toLowerCase(ch);
        char ch2=' ';
        char[] ch_arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<=ch_arr.length-1;i++)
        {
            if(ch==ch_arr[i] && i<24)
            {
                ch2=ch_arr[i];                
                ch2=ch_arr[i+2];               
            }
            else if(ch==ch_arr[25])
            ch2=ch_arr[1];
            else if(ch==ch_arr[24])
            ch2=ch_arr[0];
        }
        return ch2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence to be Encoded");
        String sentence=sc.nextLine(),newstr="";
        for(int i=0;i<=sentence.length()-1;i++)
        {
            char ch=sentence.charAt(i);
            newstr=newstr+encode(ch);
        }
        System.out.println(newstr);
    }
}