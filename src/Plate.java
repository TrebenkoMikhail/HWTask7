public class Plate {
    public int foodQuantity;

    public Plate(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void info() {
        System.out.println("Текущее количество еды " + foodQuantity);
    }

    public void decreaseFood(Cat cat, int foodQuantity) {
        this.foodQuantity -= foodQuantity;
    }

    public void increaseFood() {
        this.foodQuantity += foodQuantity;
    }

    public boolean isFoodEnough(int hungerCount) {
        return this.foodQuantity >= hungerCount;
    }

}