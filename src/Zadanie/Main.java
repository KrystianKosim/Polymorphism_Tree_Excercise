package Zadanie;

public class Main {
    public static void main(String[] args) {
        ConiferTree coniferTree = new ConiferTree(new Trunk(2, 0.23), 5);
        DeciduousTree decidousTree = new DeciduousTree(new Trunk(2, 3), 10);
        System.out.println("=========");
        coniferTree.addBranch(3);
        System.out.println("=========");
        coniferTree.grow();
        System.out.println("=========");
        coniferTree.dropLeaves();

    }
}
