package tmsl.shirsak;

import java.util.*;
public class Anagram
{
    public static void ana()
    {
        String Q="";
        String W="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=sc.nextLine();
        System.out.println("Enter another string");
        String str=sc.nextLine();
        int l=st.length();
        int l1=str.length();
        st=st.toUpperCase();
        str=str.toUpperCase();
        for (int j=65;j<=90;j++)
        {
            for (int i=0;i<l;i++)
            {
                char c=st.charAt(i);
                int n=(int)c;
                if (n==j)
                    Q=Q+(char)n;
            }
        }
        for (int k=65;k<=90;k++)
        {
            for (int x=0;x<l1;x++)
            {
                char c=str.charAt(x);
                int m=(int)c;
                if (m==k)
                    W=W+(char)m;
            }
        }
        if (Q.compareTo(W)==0)
            System.out.println("They are anagram");
        else
            System.out.println("They are not anagram");
    }

    public static void main(String[] args) {
       ana();
    }
}