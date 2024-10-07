package tmsl.shirsak;

public class GenericsSample<T> {
    static Integer[] array;
    public static <T extends Number>void sampleMethod(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //GenericsSample<Integer> obj = new GenericsSample<>();
        Integer[] intArray = {45, 26, 89, 96};
        sampleMethod(intArray);

//        This won't run as they are not of Type Number
        /*String[] stringArray = {"Krishna", "Raju", "Sima", "Geeta"};
        sampleMethod(stringArray);
        Character[] charArray = {'a', 's', 'w', 't'};
        sampleMethod(charArray);*/


    }
}
/*
class Harami{
    public static void main(String[] args) {
        Integer[] arr = {2,4,5};
        GenericsSample.sampleMethod(arr);
    }
}
*/
