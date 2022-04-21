package Zadanie1;


import java.util.LinkedList;
import java.util.List;

public abstract class Tree {

    private Trunk trunk;
    private List<Branch> branches;
    private double high;

    public Tree(Trunk trunk, double high) {
        this.trunk = trunk;
        this.high = high;
        branches = new LinkedList<>();
    }

    /**
     * Metoda grow powoduje wzrost drzewa o losowa wartosc z danego przedzialu
     */
    public void grow() {
        int minValueToGrow = 1;
        int maxValueToGrow = 3;
        double valueToGrow = (Math.random() * (maxValueToGrow - minValueToGrow) + minValueToGrow);
        high += valueToGrow;
        System.out.println("Drzewo urosło o " + valueToGrow);
    }

    /**
     * Abstrakcyjna metoda addBranch, przy pomocy ktorej mozna dodac galez z okreslona iloscia lisci do drzewa.
     * Metoda jest abstrakcyjna poniewaz dlugosc danej galezi zalezy od rodzaju drzewa.
     */
    public abstract void addBranch(int quantityOfLeaves);

    /**
     * Metoda ktora zrzuca losowa ilosc lisci z losowej galezi, jezeli na danej galezi wystepuja liscie to zrzuca co najmniej jeden, jezeli nie dostajemu komunikat o braku lisci na galezi
     */
    public void dropLeaves() {
        int indexOfBranch = (int) (Math.random() * branches.size());
        Branch randomBranch = branches.get(indexOfBranch);
        if (randomBranch.getLeaves().size() != 0) {
            int maxLeavesToDrop = randomBranch.getLeaves().size() + 1;
            int minLeavesToDrop = 1;
            int quantityOfThrowdedLeaves = (int) (Math.random() * (maxLeavesToDrop - minLeavesToDrop)) + minLeavesToDrop;
            for (int i = 0; i < quantityOfThrowdedLeaves; i++) {
                int indexToDelete = (int) (Math.random() * (randomBranch.getLeaves().size()));
                randomBranch.getLeaves().remove(indexToDelete);
            }
            System.out.println("Zrzucono " + quantityOfThrowdedLeaves + " lisci");
        } else {
            System.out.println("Galaz nie ma lisci");
        }
    }

    public List<Branch> getBranches() {
        return branches;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "trunk=" + trunk +
                ", branches=" + branches +
                ", high=" + high +
                '}';
    }
}
