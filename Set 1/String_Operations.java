class String_Operations
{
    public static void main()
    {
        String name="Krish Jaiswal";
        System.out.println("The Index of the Character at the Index 4 is: "+name.charAt(4));
        System.out.println("The Character at Unicode Code Point at the specified index is : "+name.codePointAt(0));
        System.out.println("The Character at Unicode Code Point before the specified index is : "+name.codePointBefore(2));
        System.out.println("The Character at Unicode Code Point count the specified index is : "+name.codePointCount(0,12));
        System.out.println("The Comparison of 2 names : "+name.compareTo("Jaiswal"));
        System.out.println("The Character at Unicode Code Point at the specified index is : "+name.compareToIgnoreCase("krish"));
        System.out.println("The Concatenation of 3 strings : "+name.concat("Krish"));
        System.out.println("The Concatenation of 3 strings : "+name.concat("Krish"));
    }
}