package ru.progwards.java1.lessons.basics;

import static ru.progwards.java1.lessons.basics.Astronomy.sphereSquare;
import static ru.progwards.java1.lessons.basics.Astronomy.earthSquare;
import static ru.progwards.java1.lessons.basics.Astronomy.mercurySquare;
import static ru.progwards.java1.lessons.basics.Astronomy.jupiterSquare;
import static ru.progwards.java1.lessons.basics.Astronomy.earthVsJupiter;
import static ru.progwards.java1.lessons.basics.Astronomy.earthVsMercury;
import static ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.volumeBallDouble;
import static ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.volumeBallFloat;
import static ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.calculateAccuracy;

public class ReverseDigits {
    public static int reverseDigits(int number) // xyz меняем на zyx
    { int x = number/100; //x - количество сотен
      int yz =number%100; //y - количество десятков и единиц
      int y = yz/10 ; // y - количество десятков
      int z = yz%10; //z - количество единиц
        return z*100+y*10+x;
    }



    public static void main(String[] args){

    // H3. Task1 Реализовать функцию
    //public static int reverseDigits(int number), которая получает параметром number трёхзначное положительное число,
    // а вернуть должна число в котором цифры идут в обратном порядке (например, если на вход передаётся 123,
    // то функция должна вернуть 321).
        int a = 123;
        int b = reverseDigits (a);
        System.out.println("Число " + a + " Реверс "+ b );
        double rad =  1.55f;
        double rad3 = 6371.2;
        float rad4 = 6371.2f;
        float rad5 = 100.00f;
        System.out.println("Площадь поверхности сферы радиуса R по формуле S = 4πR2 = " + sphereSquare(rad));
        earthSquare();
        System.out.println("Площадь поверхности Земли, считая радиус равным 6 371,2 км равна " + earthSquare() + " кв.км");
        mercurySquare();
        System.out.println("Площадь поверхности Меркурия, считая радиус равным 2 439,7 км равна " + mercurySquare() + " кв.км");
        jupiterSquare();
        System.out.println("Площадь поверхности Юпитера, считая радиус равным 71 492 км равна " + jupiterSquare() + " кв.км");
        earthVsMercury();
        System.out.println("Отношение площади поверхности Земли к площади поверхности Меркурия равно " + earthVsMercury());
        earthVsJupiter();
        System.out.println("Отношение площади поверхности Земли к площади поверхности Юпитера равно " + earthVsJupiter());
        volumeBallDouble(rad3);
        System.out.println("Объём шара с радиусом radius и основана на типе double равен " + volumeBallDouble(rad3));
        volumeBallFloat(rad4);
        System.out.println("Объём шара с радиусом radius и основана на типе float равен " + volumeBallFloat(rad4));
        calculateAccuracy(rad5);
        System.out.println("Разница между функциями volumeBallDouble и volumeBallFloat равна " + calculateAccuracy(rad5));
    }


}

