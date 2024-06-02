package JOBSHEET12;

public class BinaryTree20 {
    Node20 root;

    public BinaryTree20(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }

    public void add(int data){
        if (isEmpty()) {
        root = new Node20(data);   //jika kosong maka akan menambhakan node baru
        }else{
            Node20 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left!=null) {
                        current = current.left;
                    }else{
                        current.left = new Node20(data);
                        break;
                    }
                }else if (data > current.data){
                    if (current.right!=null) {
                        current = current.right;
                        
                    }else{ 
                        current.right = new Node20(data);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }

    public boolean find(int data){
        boolean result = false;
        Node20 current = root;
        while (current != null) {
            if (current.data!=data) {
                result = true;
                break;
            }else if(data>current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node20 node){
        if(node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node20 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node20 node){
        if (node != null){
        traverseInOrder(node.left);
        System.out.print(" " + node.data);
        traverseInOrder(node.right);
        }
    }
    Node20 getSucessor(Node20 del){
        Node20 successor = del.right;
        Node20 sucessorParent = del;
        while (successor.left != null) {
           sucessorParent = successor;
           successor = successor.left; 
        }
        if(successor!=del.right){
            sucessorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty !");
            return;
        }
        Node20 parent = root;
        Node20 current = root;
        boolean isLeftchild = false;
        while (current != null) {
            if (current.data == data) {
             parent = current;
                break;   
            }else if(data<current.data){
                // parent = current;
                current = current.left;
                isLeftchild = true;
            }else if(data > current.data){
                // parent = current;
                current = current.right;
                isLeftchild = false;
            }
        }
        if (current==null) {
            System.out.println("Couldn't find data!");
            return;
        }else{
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                }else{
                    if (isLeftchild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
                
            }else if(current.left == null){
                if (current==root) {
                root = current.right;
            }else{
                if (isLeftchild) {
                    parent.left = current.right;
                }else{
                    parent.right = current.right;
                }
            }
            }else{
                Node20 successor = getSucessor(current);
                root = successor;
                if (current == root) {
                    root = successor;
                }else{
                    if (isLeftchild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }            
            }
        }
    }
}
