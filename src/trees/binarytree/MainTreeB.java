package trees.binarytree;

//            4             left<root<right 4 3 1 8 7   1 3 7 10 8 4
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

        Tree tree1 = new Tree();
        tree1.insert(4);
        tree1.insert(8);
        tree1.insert(7);
        tree1.insert(3);
        tree1.insert(1);
        tree1.insert(10);


        System.out.println(tree1.minBST());
        System.out.println(tree.equals(tree1));
    }


}
