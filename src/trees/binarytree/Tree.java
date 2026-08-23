package trees.binarytree;

public class Tree { // root insert(value) find(value):boolean

    Node root;



    private class Node { //value // leftchild //rightchild
        int value;
        Node leftchild;
        Node rightchild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString(){
            return "Node=" + value;
        }
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traverseInOrder(Node root){
        if(root == null){
            return;
        }
        traverseInOrder(root.leftchild);
        System.out.println(root.value);
        traverseInOrder(root.rightchild);


    }
//            4
//           / \           left<root<right 4 3 1 8 7 10
//         3     8
//        /     / \
//       1    7   10
//                  \
//                   12         height = 1 + max(height(left),height(right))

    public  int height(){
        return height(root);
    }

    private int height(Node root){
        if(root == null){
            return -1;
        }
        if(isLeaf(root)){
            return  0;
        }
        return 1 + Math.max(height(root.leftchild),height(root.rightchild));
    }

    private boolean isLeaf(Node node){
        return node.leftchild ==null && node.rightchild ==null;

    }



    private void traversePreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.value);
        traversePreOrder(root.leftchild);
        traversePreOrder(root.rightchild);


    }

    private void traversePostOrder(Node root){
        if(root == null){
            return;
        }

        traversePostOrder(root.leftchild);
        traversePostOrder(root.rightchild);
        System.out.println(root.value);


    }

    public void insert(int value){

        var node = new Node(value);

        if(root == null){
            root = node;
            return;
        }

        var current = root;
        while(true){
            if (value<current.value){
                if(current.leftchild == null){
                    current.leftchild = node;
                    break;
                }
                current = current.leftchild;
            }
            else {
                if(current.rightchild == null){
                    current.rightchild = node;
                    break;
                }
                current = current.rightchild;
            }
        }
    }

   public boolean find(int value){
        var current = root;
        while (current!=null){
            if(value<current.value)
                current = current.leftchild;
            else if (value> current.value)
                current = current.rightchild;
            else
                return true;
            }
        return false;
    }

}
