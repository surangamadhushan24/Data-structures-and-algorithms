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
        tree.insert(12);
//        System.out.println(tree.find(1));
        tree.traverseInOrder();
        System.out.println("================================inorder==================================================");

        tree.traversePreOrder();
        System.out.println("==================================preorder==============================================");

        tree.traversePostOrder();
        System.out.println("=====================================postorder=============================================");

        System.out.println(tree.height());
    }


}
