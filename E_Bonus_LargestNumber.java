//I declare that all the solutions given are my own and are not taken from internet or any other source
import java.util.*;

public class E_Bonus_LargestNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            //int num=61534;
            StringBuilder str =new StringBuilder();
            String s=Integer.toString(num);
            //System.out.println(s.charAt(0));
            int j=0;
            int m=0;
            int flag=0;
            for(m=1;m<s.length();m++,j++)
            {
                    if (s.charAt(j) < s.charAt(m) && flag == 0)
                    {
                        flag = 1;
                    }
                    else
                    {
                        str.append(s.charAt(j));
                    }
            }

            if(j<s.length())
            {
                str.append(s.charAt(s.length()-1));
            }
            System.out.println(str);
            }
        }
    }

/********** why is the solution part of greedy**************
 * it is a part of greedy because because we are choosing that element from the left which is smaller than its right element
 * inorder to maximize the remaining number
 *  We are making the best possible choice locally , that provides solution to the complete problem
 */