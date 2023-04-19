public class searchelement 
{
public static void search(int[] a,int ele)
 {
    for(int i=0;i<=a.length-1;i++)
    {
        if(a[i]==ele)
        {
            System.out.println("element founf at"+i);
        }
    }
}
public static void main(String[] args) 
{
    int[]a1={2,4,6,7,4,3,9};
int ele=7;
     search(a1,ele);
}
}
