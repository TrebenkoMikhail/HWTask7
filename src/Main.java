public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[]{
                new Cat("Max", 10),
                new Cat("Barsik", 5),
                new Cat("Murzik", 15),
        };
        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.printf("Кот %s статус сытости %s %n ", cat.getName(), cat.isSatiety());
        }
    }
}
