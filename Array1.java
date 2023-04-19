class Array1
{
    public static void printarray(int[]a1)
     {
for(int index=0;index<=a1.length-1;index++)
{
    System.out.println(a1[index]);
}
    }
    public static void main(String[] args)
     {
        int []a1={1,5,7,9,10};
        printarray(a1);
        int []a2={1,6,5,3};
        printarray(a2);
        int []a3={10,20,30};
        printarray(a3);
        
    }
}

