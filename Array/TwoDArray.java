import java.util.Scanner;

public class TwoDArray
{
    public static void main(String args[])
    {
        System.out.println("Marks Collection App");

        int [][]marks=new int[3][4]; // 3 classrooms with 4 students in each class.

        int size = marks.length; //How do you identify the length of an array. By using length property(it's just a variable) of Array class.

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<size; i++) //classes
        {
            for(int j=0; j<marks[i].length; j++) //students
            {
                System.out.println("Kindly enter marks of class "+(i+1) +" Student "+(j+1));
                marks[i][j]=sc.nextInt();
            }
        }
        System.out.println("Marks are stored as below");
        for(int i=0; i<size; i++) //classes
        {
            for(int j=0; j<marks[i].length; j++) //students
            {
                System.out.print(marks[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
