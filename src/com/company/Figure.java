package com.company;

abstract class Figure {
    private final float x;
    private final float y;

    public abstract float getArea(float x, float y); //Площадь

    abstract float getPerimeter(float x, float y);//Пермитер

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
