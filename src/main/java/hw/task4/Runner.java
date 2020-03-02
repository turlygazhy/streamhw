package hw.task4;

public class Runner {
    public static void main(String[] args) {
        ThreeFunction<Integer> multiply = (var1, var2, var3) -> var1 * var2 * var3;
        System.out.println(multiply.execute(2, 3, 4));

        ThreeFunction<String> concat = (var1, var2, var3) -> var1 + " " + var2 + " " + var3;
        System.out.println(concat.execute("Hello", "Name", "Son"));
    }
}
