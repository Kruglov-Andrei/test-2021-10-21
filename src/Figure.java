public class Figure {
    private int a;
    private int b;
    private int c;

    public Figure(){};
       public Figure(int A){ //конструктор круга, здесь а - радиус круга, поля b, c не используются
        a = A;
    }

        public Figure(int A, int B){ //конструктор прямоугольника, здесь а, b - стороны прямоугольника, с не используется
        a = A; b = B;
    }

        public Figure(int A, int B, int C) { //конструктор трапеции, здесь а, b - стороны трапеции, с - высота трапеции
        a = A; b = B; c = C;
    }

    public void setA(int A){ //метод, устанавливающий значение поля а
        a = A;
    }

    public void setB(int B){ //метод, устанавливающий значение поля b
        b = B;
    }

    public void setC(int C){ //метод, устанавливающий значение поля c
        c = C;
    }

    /*метод, вычисляющий площадь фигуры по ее номеру
     * N - номер фигуры
     * 1 - круг, 2 - прямоугольник, 3 - трапеция*/
    public double getArea(int N){
        switch(N){
            case 1: return a*a*Math.PI; //площадь круга
            case 2: return a*b; //площадь прямоугольника
            case 3: return (a+b)*c/2; //площадь трапеции
        }
        return 0;
    }
}
