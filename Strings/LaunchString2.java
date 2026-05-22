public class LaunchString2
{
    public static void main(String args[])
    {
        String str = "RajaRamMohanRoy";
        System.out.println(str.toUpperCase()); //RAJARAMMOHANROY
        System.out.println(str.toLowerCase()); //rajarammohanroy
        System.out.println(str.charAt(7)); //M
        System.out.println(str.endsWith("Roy")); //true
        System.out.println(str.endsWith("Mohan")); //false
        System.out.println(str.startsWith("Raja")); //true
        System.out.println(str.startsWith("R")); //true
        System.out.println(str.length()); //15
        char ch[] = str.toCharArray();
        for(char character : ch )
        {
            System.out.print(character + " "); //R a j a R a m M o h a n R o y
        }

        System.out.println(str.substring(0, 7)); //RajaRam
        System.out.println(str.substring(7)); //MohanRoy

        //Method chaining
        int l = str.toLowerCase().substring(6).length();
        System.out.println(l); //output - 9




    }

}
