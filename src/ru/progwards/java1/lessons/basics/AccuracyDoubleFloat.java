package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius)
    {   double pi=3.14f;
        double r = radius;
        double v=4*pi*r*r*r/3;
        return v;
    }
    public static float volumeBallFloat(float radius)
    {   double pi=3.14f;
        float r = radius;
        Double v1 = Double.valueOf(4*pi*r*r*r/3);
        float v2 = v1.floatValue();
        return v2;
    }
    public static double calculateAccuracy(double radius){
        Double r1 = Double.valueOf(radius);
        float r= r1.floatValue();
        double x = volumeBallDouble(radius);
        Float y1 = Float.valueOf(volumeBallFloat(r));
        double y = y1.doubleValue();
        return x-y;
    }
}
