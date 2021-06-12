package treeASD2;
public class binaryTreeApp {
  public static void main(String[] args) {
        var tree = new binarryTree();
        
        treeNode node;
        node = new treeNode('D');
        tree.insert(node);
        
        node = new treeNode('B');
        tree.insert(node);
        
        node = new treeNode('A');
        tree.insert(node);
        
        node = new treeNode('C');
        tree.insert(node);
        
        node = new treeNode('F');
        tree.insert(node);
        
        node = new treeNode('E');
        tree.insert(node);
        
        node = new treeNode('G');
        tree.insert(node);
        
    
        System.out.println("Traversal dengan Preorder : ");
        tree.preOrder();
        System.out.println("\nTraversal dengan Post Orde : " );
        tree.postOrder();
        System.out.println("\nTraversal dengan In Order : " );
        tree.inOrder();
        System.out.println();
       
        
  }
}
