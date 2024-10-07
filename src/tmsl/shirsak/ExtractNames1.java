package tmsl.shirsak;

import java.util.*;
class ExtractNames1{
    String name, str1 = "", str2 = "",str3="";
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine().trim();
    }

    public String first_name(){
        for(int i=0;i<name.length();i++){
            str1 = str1 + name.charAt(i);
            if(name.charAt(i) == ' '){
                break;
            }
        }
        return str1;
    }

    public String middle_name(){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == ' '){
                for(int j=i+1;j<name.length();j++){
                    str2 = str2 + name.charAt(j);
                    if(name.charAt(j) == ' '){
                        break;
                    }
                }
                break;
            }
        }
        return str2;
    }

    public String last_name(){
        for(int i=name.length()-1;i>=0;i--){
            str3 = name.charAt(i) + str3;
            if(name.charAt(i) == ' '){
                break;
            }
        }
        return str3;
    }

    public void display(){
        System.out.println("First Name: "+first_name());
        System.out.println("Middle Name: "+middle_name());
        System.out.println("last Name: "+last_name());
    }

    public static void main(String[] args) {
        ExtractNames1 ob = new ExtractNames1();
        ob.input();
        ob.display();
    }
}