package JOBSHEET12;

public class BinaryTreeMain20 {
    public static void main(String[] args) {
        BinaryTree20 bt = new BinaryTree20();

        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);

        System.out.print("Preorder traversal\t: ");
        bt.traversePreOrder(bt.root);
        
        System.out.println("");
        System.out.print("Inorder traversal\t: ");
        bt.traverseInOrder(bt.root);
        
        System.out.println("");
        System.out.print("Postorder traversal\t: ");
        bt.traversePostOrder(bt.root);
        
        System.out.println("");
        System.out.print("Find node\t\t: " + bt.find(5));
        
        System.out.println("");
        System.out.println("Delete node 8");
        bt.delete(8);
        
        System.out.print("Preorder traversal\t: ");
        bt.traversePreOrder(bt.root);

        System.out.println("");
        System.out.println("Print semua data dalam leaf : ");
        bt.printAll(bt.root);
        
        System.out.println("");
        System.out.println("Jumlah leaf node : " + bt.countLeaf(bt.root));
        System.out.println("Nilai terkecil : " + bt.lowest(bt.root));
        System.out.println("Nilai terbesar : " + bt.highest(bt.root));
        
        System.out.println("");
    }
}