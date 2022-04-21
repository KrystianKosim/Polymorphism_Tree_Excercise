package Zadanie;

/**
 * Klasa ConiferTree ktora dziedziczy po klasie Tree
 */
public class ConiferTree extends Tree {
    public ConiferTree(Trunk trunk, double high) {
        super(trunk, high);
    }


    /**
     * Metoda addBranch powoduje dodanie galezi do drzewa, czyli do listy "branches" z okreslona iloscia lisci na tej galezi.
     * Metoda losuje dlugosc galezi
     */
    @Override
    public void addBranch(int quantityOfLeaves) {
        int minLength = 1;
        int maxLength = 5;
        double lengthOfBranch = Math.random() * (maxLength - minLength) + minLength;
        Branch branchToAdd = new Branch(lengthOfBranch, TypesOfLeaves.CONIFER);
        for (int i = 0; i < quantityOfLeaves; i++) {
            branchToAdd.addLeaves();
        }
        getBranches().add(branchToAdd);
    }
}
