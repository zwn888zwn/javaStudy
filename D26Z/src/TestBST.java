
public class TestBST {

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		   tree.insert(5);
		    tree.insert(8);
		    tree.insert(3);
		    tree.insert(6);
		    tree.insert(1);
		    tree.insert(7);
		    tree.postorder();
		    tree.StackPostorder(tree.root);
	}

}
