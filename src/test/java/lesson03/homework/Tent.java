package lesson03.homework;

public class Tent {
    public static void main(String[] args) {
        // Реализация через while
        TentSearchWhile tentSearchWhile = new TentSearchWhile();
        tentSearchWhile.searchTentsWhileLoop();

        // Реализация через for
        TentSearchFor tentSearchFor = new TentSearchFor();
        tentSearchFor.searchTentsForLoop();
    }
}
