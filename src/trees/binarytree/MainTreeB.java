package trees.binarytree;

//            4
//         3     8
//        1     7  10

public class MainTreeB {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(4);
        tree.insert(8);
        tree.insert(7);
        tree.insert(3);
        tree.insert(1);
        tree.insert(10);
        System.out.println(tree.find(1));
        System.out.println("done");
    }
}
