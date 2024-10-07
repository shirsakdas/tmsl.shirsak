package tmsl.shirsak;

import java.util.*;
class GmailDomain{
    static GmailDomain ob = new GmailDomain();
    String sen;
    public void inputSentence(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email id: ");
        sen = sc.nextLine();
    }

    public void checkGmail(){
        if(sen.endsWith("gmail.com")){
            System.out.println("Email id is in gmail domain");
        }
        else{
            System.out.println("Email id is not in gmail domain");
        }
    }

    public void findUsername(){
        int num = sen.indexOf("@");
        String part = sen.substring(0,num);
        System.out.println("The username is: "+part);
    }

    public void findDomain(){
        int num = sen.indexOf("@");
        String part = sen.substring(num+1);
        if(sen.indexOf(".",num) != -1 && sen.charAt(sen.length()-1) != '.' && ((int) sen.charAt(num+1) >= 97 && (int) sen.charAt(num+1) <= 122 || (int) sen.charAt(num+1) >= 65 && (int) sen.charAt(num+1) <= 90)){
            System.out.println("The domain name is: "+ part);
        }
        else{
            System.out.println("Invalid domain name");
        }
    }

    public void notMain() {
        if (sen.indexOf("@") != -1){
            ob.checkGmail();
            ob.findUsername();
            ob.findDomain();
        }
        else{
            System.out.println("Invalid email");
        }
    }

    public static void main(String[] args) {
        ob.inputSentence();
        ob.notMain();
    }
}