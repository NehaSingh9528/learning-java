public class LaunchString1
{
    public static void main(String args[])
    {
        String str1 = "neha";
        String str2 = "neha";

        //Methods to compare the string

        System.out.println(str1==str2); // == - reference variables will be compared

        String str3 = new String("neha");
        String str4 = new String("neha");

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4)); // equals() - compare two values of variables

        String str5 = "Neha";
        String str6 = "neha";
        System.out.println(str5==str6); //false  - because Java is case-sensitive
        System.out.println(str5.equalsIgnoreCase(str6)); //true


        //compareTo() method will check String values character by character using ASCII value
        //It will give integer value as an output -
        // 0 = equal
        // -ve = 1st value is greater
        // +ve = 2nd value is greater
        String str7 = "SACHIN"; //83 65 72 73 78
        String str8 = "SACHIN"; //83 65 72 73 78

        System.out.println(str7.compareTo(str8)); //Output - 0 (means both the strings are equal)

        String str9 = "SACHIN"; //83 65 72 73 78
        String str10 = "SAUARV"; //83 65 82 65 86  //Now Subtract both ASCII values line by line (72-82==> -18), further it will not compare the values, it means first value is greater that's why it will give the output -18
        System.out.println(str9.compareTo(str10));

    }
}
