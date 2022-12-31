package homeWork.homeWork5;

import homeWork.homeWork5.model.IntArray;
import homeWork.homeWork5.model.Phone;

import java.util.Arrays;

/**
 * Класс, отвечающий за запуск ДЗ 5.
 *
 * @author Mehel_DS created 21.12.2022
 */
public class HomeWork5 {

    /**
     * Запуск ДЗ 5.
     */
    public static void main(String[] args) {

        System.out.println("=== PHONE ===");
        // создание экземпляров
        Phone phone1 = new Phone();
        phone1.setNumber(291119911);
        phone1.setModel("Samsung");
        phone1.setWeight(1.6);

        Phone phone2 = new Phone(292229922, "Xiaomi");
        phone2.setWeight(1.9);

        Phone phone3 = new Phone(293339933, "Lenovo", 2.1);


        System.out.println("\n getNumber");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        /* результат из консоли:
           291119911
           292229922
           293339933
        */

        System.out.println("\n receiveCall(String callerName)");
        System.out.println(phone1.receiveCall("Артем"));
        System.out.println(phone2.receiveCall("Витя"));
        System.out.println(phone3.receiveCall("Женя"));
        /* результат из консоли:
           Звонит Артем
           Звонит Витя
           Звонит Женя
        */

        System.out.println("\n receiveCall(String callerName, int callerNumber)");
        System.out.println(Phone.receiveCall("Артем", phone1.getNumber()));
        System.out.println(Phone.receiveCall("Витя", phone2.getNumber()));
        System.out.println(Phone.receiveCall("Женя", phone3.getNumber()));
        /* результат из консоли:
           Звонит Артем, тел. 291119911
           Звонит Витя, тел. 292229922
           Звонит Женя, тел. 293339933
        */

        System.out.println("\n sendMessage(int ... numbers)");
        Phone.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber(), 294444444);
        /* результат из консоли:
           291119911
           292229922
           293339933
           294444444
        */

        System.out.println("\n=== IntArray ===");
        // создание экземпляров
        IntArray intArray1 = new IntArray();
        IntArray intArray2 = new IntArray(intArray1.getNumbers());
        IntArray intArray3 = new IntArray(4);

        System.out.println("\n sort(int number)");
        System.out.println(Arrays.toString(intArray1.sort(1)));
        System.out.println(Arrays.toString(intArray2.sort(0)));
        System.out.println(Arrays.toString(intArray3.sort(-1)));
        /* результат из консоли:
           [8, 11, 15, 20, 26, 49, 55, 65, 88, 98]
           [98, 88, 65, 55, 49, 26, 20, 15, 11, 8]
           [85, 81, 52, 44]
        */
    }
}
