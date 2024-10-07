package tmsl.shirsak;

/*

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

*/

import java.util.*;
class DefangedIPAddress {
    public String defangIPaddr(String address) {
        String str="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                str=str.concat("[.]");
            }
            else
                str=str+address.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String address=sc.next();
        DefangedIPAddress ob=new DefangedIPAddress();
        System.out.println(ob.defangIPaddr(address));
    }
}