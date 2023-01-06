// I declare that all the solutuions given are my own and are not taken from internet or any other source
import java.util.Scanner;

public class D_WaterTrapped {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int i=0;
        int[] left=new int[n];
        int[] right=new int[n];
        int water=0;
        int max=0;

        for(i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            left[i]=max;
        }

        max=0;
        for(i=n-1;i>=0;i--)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            right[i]=max;
        }

        for(i=0;i<n;i++)
        {
            int temp=Math.min(left[i], right[i]);
            water=water +temp-arr[i];
        }
        System.out.println(water);
    }
}
