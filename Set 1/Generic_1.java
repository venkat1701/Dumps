class Generic_1<T>
{
    T obj;
    Generic_1(T obj)
    {
        this.obj=obj;
    }
    T getobj()
    {
        return obj;
    }
}
class Gen1
{
    public static void main(String args[])
    {
        Integer i=12;
        Generic_1<Integer> obj=new Generic_1<>(i);
        System.out.println("U Stored: "+obj.getobj());
    }
}