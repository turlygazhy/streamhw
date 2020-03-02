package hw.task8;

import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        int firstValue = 0;
        int secondValue = 1;
        int thirdValue = 2;
        Tree seventh = new Tree(22, new Tree(33));
        Tree sixth = new Tree(21);
        Tree fifth = new Tree(12);
        Tree fourth = new Tree(11);
        Tree second = new Tree(secondValue, fifth, fourth);
        Tree third = new Tree(thirdValue, seventh, sixth);
        Tree tree = new Tree(firstValue, second, third);

        Stream<Tree> flattened = tree.flattened();
        flattened.forEach(s -> System.out.println(s.getValue()));
    }
}
