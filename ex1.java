// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.LinkedList;

public class ex1 {

    public static void main(String[] args) {

        LinkedList<String> listOfNumbers = new LinkedList<>();
        listOfNumbers.add(0, " 88005553535, 89443332354");
        listOfNumbers.add(1, " 8919445588, 8989007777");
        listOfNumbers.add(2, " 8912333188, 8933112547");
        listOfNumbers.add(3, " 8989334226");

        LinkedList<String> numbersOwner = new LinkedList<>();
        numbersOwner.add(0, "Anatolii ");
        numbersOwner.add(1, "Vladimir ");
        numbersOwner.add(2, "Arina ");
        numbersOwner.add(3, "Kristina ");

        HashMap<String, String> telephoneNote = new HashMap<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {

            telephoneNote.put(numbersOwner.get(i), listOfNumbers.get(i));

        }
        System.out.println(telephoneNote);
    }

}
