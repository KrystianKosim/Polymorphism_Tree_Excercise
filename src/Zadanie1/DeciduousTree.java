package Zadanie1;

/**
 * Klasa DeciduousTree, ktora dziedziczy po klasie Tree
 */
public class DeciduousTree extends Tree {
    public DeciduousTree(Trunk trunk, double high) {
        super(trunk, high);
    }


    /**
     * Metoda addBranch powoduje dodanie galezi do drzewa, czyli do listy "branches" z okreslona iloscia lisci na tej galezi.
     * Metoda losuje dlugosc galezi
     */
    @Override
    public void addBranch(int quantityOfLeaves) {
        int minLength = 3;
        int maxLength = 9;
        double lengthOfBranch = Math.random() * (maxLength - minLength) + minLength;
        Branch branchToAdd = new Branch(lengthOfBranch, TypesOfLeaves.DECIDUOUS);
        for (int i = 0; i < quantityOfLeaves; i++) {
            branchToAdd.addLeaves();
        }
        getBranches().add(branchToAdd);
    }

}
