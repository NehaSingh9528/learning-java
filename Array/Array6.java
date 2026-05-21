import java.util.Arrays;

public class Array6
{
    public static void main(String args[])
    {
        //Alien a = new Alien(); //The conclusion is that, if there is no class then you can't create that class object

        //But here creating array with new keyword will not give you error. Every type of array behind the scene some predefined classes are available.
        int []arr = new int[4];
        float ar[] = new float[6];
        double r[][] = new double[6][5];


        System.out.println(arr.getClass().getName()); //output : [I
        System.out.println(ar.getClass().getName()); //output : [F
        System.out.println(r.getClass().getName()); //output : [[D

        int a[] = {29,10,4,7,5};
        //System.out.println("Before Sorting : "+a); //Before Sorting : [I@6acbcfc0
        for(int num : a)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        Arrays.sort(a);
        //System.out.println("After Sorting : "+a); //After Sorting : [I@6acbcfc0
        for(int num : a)
        {
            System.out.print(num+" ");
        }

        int d=Arrays.binarySearch(a, 4);
        System.out.println(d);
    }

}

/**
 * [I, [F, [D, [[D
 This class is there just to enable or fit in the criteria of object can be created only if there is a class.
 AS A developer can we do something with these classes ? Answer is - NO.

 Whenever there is a predefined classes, objects has predefined methods.
Coming to Array is there any its own predefined class using which we can perform and operation ? No we don't have one.
 Then do we have any alternative ? Yes ther is one "utility class"(Supporting class)
 utility ===> Arrays

 Which is the predefined class to manipulate the data ? It's "Arrays"
 */