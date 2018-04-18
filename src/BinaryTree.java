

public class BinaryTree {
	Node root;
	
	//adding new values for nodes
	
	/*public static void main(String [] args) {
		BinaryTree theTree = new BinaryTree();
		theTree.addNode (50,"Cat Adult ");
		theTree.addNode (25,"Kitten Kid ");
		theTree.addNode (15,"Kitten Baby ");
		theTree.addNode (30,"Cat Teenager ");
		theTree.addNode (75,"Cat Granny ");
		theTree.addNode (85,"Cat Senior Sitizen ");
		theTree.inOrderTraverseTree(theTree.root);
		System.out.println("Search for 30");
		System.out.println(theTree.findNode(30));
		
	}
	*/

	
	public void addNode (int key, String name) {
		Node newNode = new Node (key, name);
		
		
		
		if (root == null) {
			root = newNode;
			
		}else {
			Node focusNode = root;
			Node parent;
			
			
			while (true) {
				parent = focusNode;
				if (key<focusNode.key) {
					focusNode = focusNode.leftChild;
					
					
					
					if (focusNode==null) {
						parent.leftChild = newNode;
						return;
					}
				}else {
					focusNode = focusNode.rightChild;
					if (focusNode==null) {
						parent.rightChild = newNode;
						/*int t = parent.rightChild.key + root.key;
						System.out.println("The total sum of one of your bouquets is " + t); */
						return;
					}
					
				
						
					}
				
			
					
				}
			
				
				
			}
		
			
		}
	
	
	//inOrder way of traverse has been chosen to structure the nodes
	//the ascending order: left nodes go first, the right ones are the last
		
	public void inOrderTraverseTree(Node focusNode) {

	
		if (focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			Flower fl = new Flower (null, null, 0);
			fl.print();
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);
			
			
		}
		
	}
	
		

//the structure of the Node itself
//also the constructor for it within the same class with the same name

class Node{
	int key;
	String name;
	Node rightChild;
	Node leftChild;

	
	Node (int key, String name){
		this.key = key;
		this.name = name; 
	
	}

	public String toString() {
		return name + "that have a cost of " + key + " pounds";
	}

}

}





	
