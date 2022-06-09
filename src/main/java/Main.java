public class Main {

    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println("Результат вычисления суммы: " + binOps.sum("10", "101"));
        System.out.println("Результат вычисления возведения в степень: " + binOps.mult("10", "101"));
    }
}
