package com.company;

import static com.company.Main.PI;

class Circle extends Figure implements Moveable{
    private final float radius;
    /** Конструктор  **/
    public Circle(float x, float y , float radius) {
        super(x, y);
        this.radius = radius;

    }
    /** Наследование **/
    @Override
    public float getArea(float x, float y) {
        return (float) (PI *radius*radius);
    }

    @Override
    public float getPerimeter(float x, float y) {
        return (float) (2*PI*radius);
    }
    /** Интерфейс **/
    @Override
    public void move(float dx, float dy) {
        System.out.println("Перемещение по оси Ox: "+super.getX()+dx+"\n"+
                            "Перемещение по оси Oy: "+super.getY()+dy);

    }

    @Override
    public void resize(float koeff) {
        System.out.println("Увеличение Радиуса: "+radius*koeff);
    }

    @Override
    public String toString() {
        return "Center:"+"("+getX()+", "+getY()+")"+"\n" +
                "Radius:"+radius+"\n";
    }
}
