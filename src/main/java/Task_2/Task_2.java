package Task_2;

/**
 * Описать ошибки в коде и предложить варианты оптимизации:
 */


public class Task_2 {
    //классы и интерфейсы лучше реализовать отдельными файлами(если исключить возможность, что это условность д/з)

    interface Moveable {
        void move();
    }

    interface Stopable {
        void stop();
    }

    abstract class Car {
        public Engine engine;   //отсутствует реализаация класса Engine, либо, если оно есть необходимо его импортировать
        private String color;
        private String name;

        protected void start() {    //возможно лучше реализовать это действие в интерфейсе, и нужен ли модификатор protected
            System.out.println("Car starting");
        }

        abstract void open();    //возможно лучше реализовать это действие в интерфейсе,
        // В любом случае его обязательно нужно переопределить в классах наследниках (см. комментарий к классу Lorry)

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class LightWeightCar extends Car implements Moveable {   // возможно, лучше реализовать интерфейсы в классе Car
        @Override
        void open() {
            System.out.println("Car is open");
        }

        @Override
        public void move() {
            System.out.println("Car is move");
        }
    }

    class Lorry extends Car, Stopable, Moveable { // Moveable, Stopable - интерфейсы, для их реализации необходимо использовать implements
        public void move() {
            System.out.println("Car is moving");
        }

        public void stop() {
            System.out.println("Car is stop");
        }

        //т.к. класс Car содержит абстрактный метод open(), его необходимо переопределить в данной реализации
    }
}
