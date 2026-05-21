public class Array5
{
    public static void main(String args[])
    {
        //If the data has known to you
//        int arr[]={10, 50, 67};
//        int arr1[][]={{2, 4}, {2, 4}}; //2D regular
//        int arr2[][]={{2, 4, 5}, {2, 4}}; //2D jagged

        //for each loop

        int data[]={10, 47, 67, 45, 78, 98};
        for(int i=0; i<data.length; i++) //If it's a normal for loop you have control over it how you want to traverse in an array.
        {
            System.out.println(data[i]);
        }

        for(int num : data) //Here you don't have complete control, automatically it traverse and store the data in num variable
        {
            System.out.println(num);
        }

        int marks[][]={{23,45}, {56, 78}};
        for(int row[] : marks)
        {
            for(int newMarks: row)
            {
                System.out.println(newMarks);
            }
        }



        for(int i =0; i<marks.length; i++)
        {
            for(int j = 0; j<marks.length; j++)
            {
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
