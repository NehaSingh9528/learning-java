import java.util.Scanner;

class Array1
{
    public static void main(String args[])
    {
        //create an array to store 5 students marks
        int []marks=new int[5];

//        marks[0]=4;
//        marks[1]=5;
//        marks[2]=5;
//        marks[3]=8;
//        marks[4]=10;

        Scanner scan = new Scanner(System.in);
        System.out.println("Marks collection app");
        for(int i=0; i<5; i++)
        {
            System.out.println("Kindly enter marks of student "+(i+1));
            marks[i] = scan.nextInt();
        }
        System.out.println("Marks are stored as follows");
        for(int i=0; i<5; i++)
        {
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
    }
}

