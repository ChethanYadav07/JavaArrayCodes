public class matching  
{
    public static void duplicate(int []a)
    {
        for(int i=0; i<=a.length-1;i++)
        {
        for(int j=i+1;j<a.length-1;j++)
        {
            if(a[i]==a[j])
            {
                System.out.println(a[j]);
            }
        }
        }        
    }
    public static void main(String[] args) 
    {
        int []a={1,2,3,1,4,5,1};
        duplicate(a);
    }
    
}
