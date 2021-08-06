package com.company;

class Rectangle extends Figure implements Moveable{
    private final float height;
    private final float width;
    /** Конструктор **/
    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }
    /** Наследование **/
    @Override
    public float getArea(float x, float y) {
        return 0;
    }

    @Override
    public float getPerimeter(float x, float y) {
        return 2*(height+width);
    }
    /** Интерфейс **/
    @Override
    public void move(float dx, float dy) {
        System.out.println("Перемещение по оси Ox: "+super.getX()+dx+"\n"+
                "Перемещение по оси Oy: "+super.getY()+dy);

    }

    @Override
    public void resize(float koeff) {
        System.out.println("Увеличение Высоты: "+height*koeff+"\n"+
                            "Увеличение Ширины"+width*koeff);

    }
    /** ToString **/
    @Override
    public String toString() {

        return "Center: "+"("+(getX()+width/2)+", "+(getY()+width/2)+")"+"\n" +
                "Radius: "+ height+"\n"+
                "Width: "+width;
    }
}
