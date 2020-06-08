package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare(Double r) {
        double pi = 3.14f;
        double S = 4 * pi * r * r;
        return S;
    }

    public static Double earthSquare() {
        double rad = 6371.2;
        double EarthSpaceSquare = sphereSquare(rad);

        return EarthSpaceSquare;
    }

    public static Double mercurySquare() {
        double rad = 2439.7;
        double MercurySpaceSquare = sphereSquare(rad);

        return MercurySpaceSquare;
    }

    public static Double jupiterSquare() {
        double rad = 71492;
        double jupiterSpaceSquare = sphereSquare(rad);

        return jupiterSpaceSquare;
    }
    public static Double earthVsMercury(){
       double Result_vs1 = earthSquare()/mercurySquare();

        return Result_vs1;

    }
    public static Double earthVsJupiter(){
        double Result_vs2 = earthSquare()/jupiterSquare();

        return Result_vs2;

    }
}