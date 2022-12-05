package org.example;

public class StringProcessor
{//тест
    public static String StringCopy(String s, int N)
    {
        String str1 = "";
        if(s==null)
        {
            throw new IllegalArgumentException();
        }
        if (N>0)
        {
            for(int i=0;i<N;i++)
            {
                str1 += s;
            }
        }
        else if(N==0)
        {
            str1="";
        }
        else
        {
            throw new IllegalArgumentException();
        }
        return str1;
    }
    public static int quantity(String str1, String str2)
    {
        int value=0;
        int quantity=0;
        if  (("".equals(str2))||(str2==null)||(str1==null))
        {
            throw new IllegalArgumentException();
        }
        if(str1.indexOf(str2,0)==0)
        {
            quantity++;
        }
        while (value>-1)
        {
            value = str1.indexOf(str2,(value+1));
            if(value!=-1)
            {
                quantity++;
            }
        }
        return quantity;
    }
    public static String StringChange(String s)
    {
        String str="";
        String str1="",str2="",str3="";
        int i=0;
        if ("".equals(s)||s==null)
        {
            throw new IllegalArgumentException();
        }
        while(i<s.length())
        {

            str1=s.replace("1","один");
            str2=str1.replace("2","два");
            str3=str2.replace("3","три");
            str=str3;
            i++;
        }
        return str;
    }
    public static String StringDelete(StringBuilder str)
    {
        int i=1;
        if ("".equals(str)||str==null)
        {
            throw new IllegalArgumentException();
        }
        while(i<str.length())
        {
            str=str.delete(i,i+1);
            i++;
        }
        String str1= str.toString();
        return str1;
    }
}
