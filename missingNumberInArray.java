import java.util.*;

class missingNumberInArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int variation=a[0]-0;
        for(int i=0;i<n;i++)
        {
            if(variation<(a[i]-i))
            {
                while((a[i]-i)!=variation)
                {
                    System.out.print((variation+i)+" ");
                    variation++;
                } 
            }           
        }   
        
    }
}