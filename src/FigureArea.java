public class FigureArea {
    public static void main(String[] args) {
        double s;

        Figure f1 = new Figure(3); //создаём объект круг, радиусом 3
        s = f1.getArea(1);
        System.out.println("Площадь круга: " + s);

        Figure f2 = new Figure(3, 6); //создаём объект прямоугольник, задаем длины сторон прямоугольника a=3, b=6
        s = f2.getArea(2);
        System.out.println("Площадь прямоугольника: " + s);

        Figure f3 = new Figure(3, 6, 5); //создаём объект трапеция, задаём длины сторон a=3, b=6, высоту с=5
        s = f3.getArea(3);
        System.out.println("Площадь трапеции: " + s);

    }
}
