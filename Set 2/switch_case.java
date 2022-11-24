class switch_case
{
    public static void main(int day_num)
    {
        switch(day_num)
        {
            case 6:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println("WeekDay");
            break;
            case 1:
            case 7:System.out.println("Weekend");
            break;
            default:System.out.println("Wrong Day Number");
        }
    }
}