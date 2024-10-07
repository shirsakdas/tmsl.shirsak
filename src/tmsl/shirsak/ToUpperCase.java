package tmsl.shirsak;

public class ToUpperCase
{
    public String transform(String s)
    {
        String s1 = "";
        s = " " + s.trim();
        for(int i = 1; i < s.length()-1; i++){
            if(s.charAt(i-1) == ' '){
                s1 = s1 + Character.toUpperCase(s.charAt(i));
//                i++;
            }
            else{
                s1 = s1 + s.charAt(i);
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        ToUpperCase obj = new ToUpperCase();
        System.out.println(obj.transform("i love"));
    }
}