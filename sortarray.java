public class sortarray 
{
    public static void sort(int []a)
    {
        for(int i=0; i<=a.length-1;i++)
        {
        for(int j=i+1;j<=a.length-1;j++)
        {
            if(a[i]>a[j])
            {
              int temp=0;
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }   
        }
        System.out.println(a[i]);   
        }           
    }
    public static void main(String[] args) 
    {
        int []a1={1,5,7,3,2,8,12,90};
        sort(a1);
    }
    
}
