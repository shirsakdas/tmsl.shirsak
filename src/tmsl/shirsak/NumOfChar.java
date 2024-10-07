package tmsl.shirsak;

import java.util.*;
class NumOfChar{
    String str;
    char target;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        System.out.print("Enter target character: ");
        target = sc.next().charAt(0);
    }

    public int findOccurence(){
        int num=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == target){
                num++;
            }
        }
        return num;
    }

    public void display(){
        if(findOccurence() == 0){
            System.out.println("No Occurence Found");
        }
        else{
            System.out.printf("There are '" + findOccurence() + "' '" + target + "' in '" + str + "'");
        }
    }

    public static void main(String[] args) {
        NumOfChar ob = new NumOfChar();
        ob.input();
        ob.display();
    }
}