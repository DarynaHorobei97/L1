public class Cat {

    String color;
    int weight;

    void showCatInfo() {
        System.out.println("Cat has such characteristics " + color + " " + weight);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.color = "black";
        cat1.weight = 5;
        Cat cat3 = new Cat();
    }
}
