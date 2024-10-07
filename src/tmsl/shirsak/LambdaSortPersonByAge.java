package tmsl.shirsak;

// Given a List of Person object, write a program to sort Person according to their age

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class InitializePerson {
    private String personName;
    private int personAge;

    public InitializePerson(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public int getPersonAge() {
        return personAge;
    }

    @Override
    public String toString() {
        return personName + " " + personAge;
    }
}

class TakePersonInput {
    List<String> nameList = new ArrayList<>();
    List<Integer> ageList = new ArrayList<>();

    public void takePersonInput() {
        Scanner scanner = new Scanner(System.in);
        int ageCount = 1, nameCount = 1;

        System.out.println("Enter age followed by name\nEnter age as -1 to quit");
        while (true) {
            System.out.printf("Enter age %d: ", ageCount++);
            int age = scanner.nextInt();
            scanner.nextLine();
            ageList.add(age);
            if (ageList.contains(-1)) {
                break;
            }
            System.out.printf("Enter name %d: ", nameCount++);
            String name = scanner.nextLine();
            nameList.add(name);
        }
        ageList.remove(ageCount - 2);


    }
}

class AddTwoLists {
    public void addTwoLists() {
        List<InitializePerson> personList = new ArrayList<>();
        TakePersonInput obj = new TakePersonInput();
        obj.takePersonInput();
        List<Integer> getAgeList = obj.ageList;
        List<String> getNameList = obj.nameList;
        for (int i = 0; i < getAgeList.size(); i++) {
            personList.add(new InitializePerson(getNameList.get(i), getAgeList.get(i)));
        }
        Collections.sort(personList, ((o1, o2) -> o1.getPersonAge() - o2.getPersonAge()));
        System.out.println("Ascending Order By Age: " + personList);
        Collections.sort(personList, ((o2, o1) -> o1.getPersonAge() - o2.getPersonAge()));
        System.out.println("Descending Order By Age: " + personList);
    }
}

public class LambdaSortPersonByAge {
    public static void main(String[] args) {
        AddTwoLists obj = new AddTwoLists();
        obj.addTwoLists();
    }
}
