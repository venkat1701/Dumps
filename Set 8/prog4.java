class prog4 
{
 public static void main() 
 {
 int k,s=0; 
for(k=1;k<=20;k++)
{
if(k%2==0)
s=s-(k*2);
 else 
 s=s+(k*2); 
 } //end of the loop 
 System.out.println("the sum of the series is "+s);
}
}