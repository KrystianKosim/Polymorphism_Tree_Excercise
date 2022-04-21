package Zadanie1;

/**
 * Klasa Trunk posiadająca pola określające wiek oraz szerkosć Pnia
 */
public class Trunk {
    private double age;
    private double width;

    public Trunk(double age, double width) {
        this.age = age;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Trunk{" +
                "age=" + age +
                ", width=" + width +
                '}';
    }
}
