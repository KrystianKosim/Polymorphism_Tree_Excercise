package Zadanie;

/**
 * Klasa Leaf posiadajaca dwa pola w ktorych jest zawarty rodzaj danego liscia oraz jego rozmiar
 */
public class Leaf {
    private TypesOfLeaves typeOfLeaf;
    private double sizeOfLeaf;

    public Leaf(TypesOfLeaves typeOfLeaf, double sizeOfLeaf) {
        this.typeOfLeaf = typeOfLeaf;
        this.sizeOfLeaf = sizeOfLeaf;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "typeOfLeaf=" + typeOfLeaf +
                ", sizeOfLeaf=" + sizeOfLeaf +
                '}';
    }
}
