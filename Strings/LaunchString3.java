public class LaunchString3
{
    public static void main(String args[])
    {
//        String str1 = "alien";
//        str1 = "telusko";
//        System.out.println(str1); //output - telusko Behind the scene new object is created and now str1 referring to this new object instead o previous one. Suppose previous object has address 1000 and new object has address 2000. So now str1 holding the address 2000 and referring to new object which is telusko. Immutability is different from constant/final because there you can't reassign the value to those variables but here you can reassign the values.

        String str1 = "alien";
        String str2 = " telusko";
        String str3 = " java";

        //Will "alien telusko" be created in the String Constant Pool (SCP) or in Heap memory?
        //concat() creates a new String object in the Heap memory, not automatically in the String Constant Pool.
        String str4 = str1.concat(str2); //str4 -> Heap object
        System.out.println(str4);
        String str5 = "alien telusko";
        System.out.println(str4==str5);

        //concat() method is used to add only two Strings it's not used to add three or more Strings.
        //If you want to add multiple strings then you can use "+" operator
        String str6 = str1+str2+str3+ " devops"; //A new String object is created in Heap memory. Because this is runtime concatenation using variables.
        System.out.println(str6);


        //In Java:
        //If both operands are numbers → Java performs mathematical addition.
        //If one operand is String → Java performs String concatenation.
        //And evaluation happens: LEFT TO RIGHT
        String str8 = 10 + 2 + "java"; //12java ==> 10 + 2 ==> 12 ==> 12 + "java" ==> 12java
        System.out.println(str8);

        String str9 = "java" + 10 + 2; //java102 ==> "java" + 10 ==> "java10" ==> "java10" + 2 ==> "java102"
        System.out.println(str9);
        //Before String appears → arithmetic
        //After String appears → concatenation
        //(while moving left to right)


    }
}

/**
 Internal Flow:-

 When this executes: String str4 = str1.concat(str2);

 Java roughly does this internally: new String("alien telusko") - That new object is placed in the Heap.

 The String Constant Pool stores string literals and interned strings.
 interned = The string is stored in the String Constant Pool (SCP) so that Java can reuse the same object instead of creating duplicates.
 Example:
 String s = "Hello";

 Example 3 — Using intern()
 String s1 = new String("Hello");
 String s2 = s1.intern();
 String s3 = "Hello";

 Now: s2 == s3
 becomes: true
 Why? Because: s1.intern() returns the SCP reference of "Hello".

 Compile-time concatenation → SCP

 Example:
 String s = "Java" + "Spring";
 Compiler converts it to: String s = "JavaSpring";  This goes into SCP.

 Runtime concatenation → Heap

 But in your code: str1 + str2 + str3 + " devops"
 str1, str2, str3 are variables.
 So compiler CANNOT know final value during compilation.
 Thus concatenation happens during runtime.
 Result → Heap object.

 What if we use final?
 Now this becomes advanced.
 final String s1 = "Hello";
 final String s2 = "World";
 String s3 = s1 + s2;

 Now compiler CAN optimize because final values cannot change.
 Compiler treats them like constants.
 So: s3 -> SCP


 String literals → SCP

 Runtime concatenation → Heap

 intern() → Can move/reference string into SCP

 + with variables → Internally uses StringBuilder at runtime
 */