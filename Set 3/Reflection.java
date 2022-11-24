import java.lang.reflect.*;
class Reflection
{
    public static void main(String[] args)throws Exception
    {
        Method m=Reflection.class.getMethod("main",String[].class);
        for(final Parameter param:m.getParameters())
        {
            System.out.println("Parameter : "+param.getName());
        }
    }
}