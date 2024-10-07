package tmsl.shirsak;

import java.util.*;
class numberOfWords{
    String str, arr[],str1 = "";
    int count=0;
    public void inputs(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        str = sc.nextLine();
        str = str.trim();
        str = str+" ";
    }

    public void findWords(){
        arr = new String[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                str1 = str1+str.charAt(i);
            }
            else{
                arr[count] = str1;
                str1 = "";
                count++;
            }
        }
    }

    public void display(){
        System.out.println("Total number of words: "+count);
        System.out.println("Words are:");
        for(int i=0;i<count;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        numberOfWords ob = new numberOfWords();
        ob.inputs();
        ob.findWords();
        ob.display();
    }
}