package hw.task8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tree {

    private int value;
    private List<Tree> children = new LinkedList<>();

    public Tree(int value, List<Tree> children) {
        this.value = value;
        this.children.addAll(children);

    }

    public Tree(int value, Tree... children) {
        this(value, Arrays.asList(children));
    }

    public int getValue() {
        return value;
    }

    public List<Tree> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public Stream<Tree> flattened() {
        Stream<Tree> own = Stream.of(this);
        Stream<Tree> childrenStream = this.getChildren().stream();
        Stream<Tree> grandChildrenStream = this.getChildren().stream()
                .flatMap(tree -> tree.getChildren().stream());
        Stream<Tree> concat = Stream.concat(childrenStream, grandChildrenStream);
        return Stream.concat(own, concat);
    }

    // Get all values in the tree:
    public List<Integer> getAllValues() {
        return flattened()
                .map(Tree::getValue)
                .collect(Collectors.toList());
    }

    // Get even values:
    public List<Integer> getEvenValues() {
        return flattened()
                .filter(tree -> tree.getValue() % 2 == 0)
                .map(Tree::getValue)
                .collect(Collectors.toList());
    }

    // Sum of even values:
    public Optional<Integer> sumOfEvenValues() {
        return flattened()
                .filter(tree -> tree.getValue() % 2 == 0)
                .map(Tree::getValue)
                .reduce((i1, i2) -> i1 + i2);
    }

    // Does it contain 13?
    public Boolean isContains13() {
        return flattened().anyMatch(tree -> tree.getValue() == 13);
    }

}
