package tmsl.shirsak;

import java.util.*;
class ExtractNames{
    String name, str = "";
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine().trim();
        name = name+" ";
    }

    public void first_name(){
        for(int i = 0;i<name.length();i++){
            str = str + name.charAt(i);
            if(name.charAt(i) == ' '){
                break;
            }
        }
    }

    public void display(){
        System.out.println("First Name: "+str);
    }

    public static void main(String[] args) {
        ExtractNames ob = new ExtractNames();
        ob.input();
        ob.first_name();
        ob.display();
    }
}