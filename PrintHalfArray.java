public class halfarray 
{
    public static void printarray(int[] a1)
     {
        for(int index=0;index<=(a1.length-1/2);index++)
        {
          System.out.println(a1[index]);
        }
    }
    public static void main(String[] args)
     {
        int[]a1={2,5,4,7,8,9};
        printarray(a1);
    }
}

