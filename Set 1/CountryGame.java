import java.util.*;
class CountryGame
{
    static int live = 3;
    static void option1()
    {
        
        Scanner sc=new Scanner(System.in);
        live=3;
        System.out.println("Welcome to The Game");       
        System.out.println("You have to Fill in the Blanks with the correct Characters of the Countries");
        System.out.println("You Have 3 Lives. Your each Live will decrease if your answer is wrong. And it will increase when your answer is correct");
        while(live!=0)
        {
            
        System.out.println("Here's Your Question");
        Random random=new Random();
        String country[]={"South Africa","South Brazil","China","Chile","India","Pakistan","Afganistan","Nepal","Indonesia","Sumatra","Scandinavia","Russia","Bhutan","Canada","USA","Mexico","Atacama","Malaysia"};
        int length=country.length;
        int rnd_num=random.nextInt(length);
        
        Random rand2=new Random();
        String countryname=country[rnd_num];
        countryname.trim();
        int len_coun=countryname.length();        
        int blank=rand2.nextInt(len_coun);
        char ch=countryname.charAt(blank);
        
        String replaced=countryname.replace(ch,'_');
        System.out.println(replaced);
        System.out.println("Enter your Answer");
        char ans=sc.next().charAt(0);
        
        if(ch==ans)
        {
            live++;
            System.out.println("\t\tNumber of Lives: "+live);
            System.out.println("Correct Answer!Keep Going");
        }
        else
        {
            live--;
            System.out.println("\t\tNumber of Lives: "+live);
            System.out.println("Wrong Answer!");
        }
    }
    if(live==0)
            {
                System.out.println("Oops! You have no more Lives Left");
            }
    }
    static void option2()
    {
        System.out.println("Thank You for playing the Game");
        System.exit(0);
    }
    static void option3()
    {
        option1();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to this Game.");
        System.out.println("To Enter, Press 1");
        System.out.println("To Exit, Press 2");
        System.out.println("To Replay, Press 3");
        System.out.println("<Mind that this Game is in Sentence Case and is Case Sensitive>");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:option1();
            break;
            case 2: option2();
            break;
            case 3:option3();
            break;
        }
    }
}