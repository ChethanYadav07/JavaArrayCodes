public class copyarray
 {
    public static void copy(int [] a)
     {
        int[]res=new int[a.length];
        for(int i=0;i<=res.length-1;i++)
        {
            res[i]=a[i];
            System.out.println(res[i]);

        }
    }
    public static void main(String[] args)
    {
        int[]a1={2,4,3,5,7,6,8};
        copy(a1);

    }
}
