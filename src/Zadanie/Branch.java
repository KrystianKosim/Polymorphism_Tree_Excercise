package Zadanie;


import java.util.LinkedList;
import java.util.List;

/**
 * Klasa Branch posiadajaca pola typeOfLeaves ktore mowi nam o rodzaju lisci przechowywanych na danej galezi, length czyli dlugosc galezi, oraz liste lisci na danej galezi
 */
public class Branch {
    private TypesOfLeaves typeOfLeaves;
    private double length;
    private List<Leaf> leaves;

    public Branch(double length, TypesOfLeaves typeOfLeaves) {
        this.length = length;
        this.typeOfLeaves = typeOfLeaves;
        leaves = new LinkedList<>();
    }

    /**
     * Metoda ktora tworzy oraz dodaje lisc o losowej wielkosci z przedziału od 1 do 10 do listy lisci na danej galezi
     */
    public void addLeaves() {
        int minimalSizeOfLeaf = 1;
        int maximalSizeOfLeaf = 10;
        double sizeOfLeaf = Math.random() * (maximalSizeOfLeaf - minimalSizeOfLeaf) + minimalSizeOfLeaf;
        Leaf leafToAdd = new Leaf(typeOfLeaves, sizeOfLeaf);
        leaves.add(leafToAdd);
    }


    public List<Leaf> getLeaves() {
        return leaves;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "typeOfLeaves=" + typeOfLeaves +
                ", length=" + length +
                ", leaves=" + leaves +
                '}';
    }
}

