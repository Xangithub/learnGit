import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner ввод = new Scanner(System.in);
       int возраст;
       int возрастНачало = 5;
       int возрастВопроса = 50;
       int возрастСлева = 1;
       int возрастСправа = 50;
       int falseAge = 50;
       String имя;
       String qestStr=" лет? введи 1 если да и 0 если нет";
       MyArray myArray = new MyArray(2);

       myArray.insert(9);
       myArray.insert(1);
       myArray.insert(3);
       myArray.insert(2);
       myArray.insert(7);
        myArray.display();
//        myArray.sortSelect();
        myArray.sortInsert();
        myArray.display();

//        myArray.insert(3);
//        myArray.insert(4);
//        myArray.insert(3);
//       myArray.display();


      /* System.out.println("Как тебя зовут?");
       имя=ввод.nextLine();

       System.out.println(имя+", Привет! давай я угадаю сколько тебе лет. ");
        int ответ;


        while (возрастСправа-возрастСлева>=2){
            System.out.println("Тебе меньше чем " + возрастВопроса + qestStr);
            ответ = ввод.nextInt();
            if(ответ==0) {
                возрастСлева=возрастВопроса;
                возрастВопроса=возрастСлева+(возрастСправа-возрастСлева)/2;
            }

            if(ответ==1)     {
                 возрастСправа=возрастВопроса;

                возрастВопроса=возрастСлева+(возрастСправа-возрастСлева)/2;

            }
        }
        System.out.println(имя+ ", тебе " + возрастВопроса + " лет");
*/

    }



}
