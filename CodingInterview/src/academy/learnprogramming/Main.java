package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.lookup(33);
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

        System.out.println(tree.getNumOfLeaves());
        tree.lookup(9);
        tree.lookup(4);
        tree.lookup(6);
        tree.lookup(20);
        tree.lookup(21);
        tree.remove(170);
        tree.lookup(170);
        tree.lookup(15);
        tree.lookup(1);
    }
}
