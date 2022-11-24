class taxi
{
    public static void main(int dis)
    {
        int fare=0;
        if(dis<=5)
        fare=50;
        else if(dis>5 && dis<=10)
        fare=50+(dis-5)*10;
        else if(dis>10 && dis<=15)
        fare=50+(5*10)+(dis-10)*12;
        else
        fare=50+(5*10)+(5*12)+(dis-15)*15;
        System.out.println("The fare is = "+fare);
    }
}