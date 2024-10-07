package tmsl.shirsak;

import java.util.*;
class numberOfOccurrence {
    String str;
    char ch;
    int count;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        str = sc.nextLine();
        System.out.print("Enter the character to be searched: ");
        ch = sc.next().charAt(0);
    }

    public void occurence(){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
    }

    public void display(){
        System.out.println("Occurences of "+ch+" in "+str+" is: "+ count);
    }

    public static void main(String[] args) {
        numberOfOccurrence ob = new numberOfOccurrence();
        ob.input();
        ob.occurence();
        ob.display();
    }
}