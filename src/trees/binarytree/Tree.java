package trees.binarytree;

import java.util.ArrayList;

public class Tree {

    Node root;

    private class Node {
        int value;
        Node leftChild;
        Node rightChild;

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
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);


    }
    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.value<min || root.value>max){
            return  false;
        }

        return isBinarySearchTree(root.leftChild,min,root.value-1) &&
                isBinarySearchTree(root.rightChild,root.value+1,max);
    }
//            4 ->d3
//           / \           left<root<right 4 3 1 8 7 10
//         3     8 ->d2
//        /     / \
//       1    7   10 ->d1 d= distance
//                  \
//                   12 ->d0
//
//  height = 1 + max(height(left),height(right))

    public ArrayList<Integer> getNodesAtDistance(int distance){

        ArrayList<Integer> list = new ArrayList<>();
        printNodesAtDistance(root,distance,list);
        return list;
    }

    private void printNodesAtDistance(Node root, int distance,ArrayList<Integer> list){

        if (root == null){
            return;
        }
        if(distance==0){
            list.add(root.value);
        }

        printNodesAtDistance(root.leftChild,distance-1,list);
        printNodesAtDistance(root.rightChild,distance-1,list);



    }

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
        return 1 + Math.max(height(root.leftChild),height(root.rightChild));
    }

    public int min(){
       return min(root);
    }

    private  int min(Node root){

        if (root == null)
            return Integer.MAX_VALUE;


        var leftMin = min(root.leftChild);
        var rightMin = min(root.rightChild);
        return  Math.min(Math.min(leftMin,rightMin),root.value);
    }

    public int minBST(){
        return minBST(root);
    }

    private int minBST(Node root){

        if(root==null)
            throw new IllegalArgumentException("Tree is empty");

        Node current = root;
        while (current.leftChild !=null){
            current = current.leftChild;
        }

        return current.value;


    }

    private boolean isLeaf(Node node){
        return node.leftChild == null && node.rightChild == null;

    }

    private void traversePreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);


    }

    private void traversePostOrder(Node root){
        if(root == null){
            return;
        }

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
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
                if(current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            else {
                if(current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

   public boolean find(int value){
        var current = root;
        while (current!=null){
            if(value<current.value)
                current = current.leftChild;
            else if (value> current.value)
                current = current.rightChild;
            else
                return true;
            }
        return false;

   }

   public boolean equals(Tree other){
        if(other ==null)
            return false;

        return equals(other.root,root);
   }

   private boolean equals(Node first,Node second){

        if(first == null && second ==null){
            return true;
        }

       if(first != null && second !=null){
           return first.value == second.value &&
                   equals(first.leftChild,second.leftChild) &&
                   equals(first.rightChild,second.rightChild);

       }

       return false;

   }

}
