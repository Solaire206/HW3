public class Main {
    public static void main(String[] args)
            //Задание 1.1
    {System.out.println(" Задание №1.1 ");
        int age = 9;
        if (age >= 18){System.out.println(" Вы можете водить ");}
        if (age < 18) {System.out.println(" Вы не можете водить ");}
        //Задание 1.2
        System.out.println(" Задание №1.2 ");
        int age1 =16;
        if (age1 >= 7) {System.out.println(" Ребёнок ходит в школу ");}
            if (age1 >= 18) { System.out.println(" Закончил школу и может идти в университет "); }
            if (age1 >=24) { System.out.println(" Человек закончил университет и ходит на работу ");}
            //Задание 1.3
        System.out.println(" Задание №1.3");
            int places = 5;
            if (places <=60) { System.out.println(" Есть сидячее место "); }
            if (places >=61) { System.out.println("Есть стоячие места "); }
            if (places >=120) { System.out.println("Мест нет "); }

//Задание 2.1
        System.out.println(" Задание №2.1 ");
        int age2 = 52;
            if (age2 >=18) { System.out.println(" Поздравляем с совершеннолетием "); }
            else { System.out.println(" Нужно немного подождать ");}
//Задание 2.2
        System.out.println(" Задание №2.2 ");
        int age3 =25;
        if (age3 >= 7) {System.out.println(" Ребёнок ходит в школу ");}
        if (age3 <= 24) { System.out.println(" Закончил школу и может идти в университет "); }
        else  { System.out.println(" Человек закончил университет и ходит на работу ");}
        //Задание 2.3
        System.out.println(" Задание №2.3");
        int places1 = 121;
        if (places1 <=60){ System.out.println(" Есть сидячее место "); }
        if (places1 <=120) { System.out.println("Есть стоячие места "); }
        else  { System.out.println("Мест нет "); }
        //Задание 3.1
        System.out.println(" Задние №3.1");
        int age4 = 50;
        if (age4 >=2 && age4 <=6) { System.out.println(" Ходит в детский сад ");}
        if (age4 >6 && age4 <=18) { System.out.println(" Ходит в школу ");}
        if (age4 >18 && age4 <=24) { System.out.println(" Ходит в универ ");}
        if (age4 >24){ System.out.println(" Работает ");}
        //Задание 3.2
        System.out.println(" Задание №3.2");
        int a = 7;
        if (a<5){ System.out.println(" Ребенок не может кататься на атракционах ");}
        if (a>=5 && a<14){ System.out.println(" Только в сопровождении взрослого ");}
        if (a>=14) {System.out.println(" Можно кататься ");}
        //Задание 3.3
        System.out.println(" Задание №3.3");
        int one = 6;
        int two = 6;
        int three = 5;
        if (one>two && one>three) {System.out.println(" Число one самое большое");}
        if (two>one && two>three) {System.out.println(" Число two самое большое");}
        if (three>one && three>two) {System.out.println(" Число three самое большое ");}
        if (one==two && one==three && three==two) {System.out.println(" Все числа равны ");}
        else System.out.println(" Равные числа больше ");


    }

}