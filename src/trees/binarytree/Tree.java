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
