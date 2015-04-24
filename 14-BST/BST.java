public class BST {
    
    private Node root;

    public BST(){
	root = null;
    }

    public BST(Node n){
	root = n;
    }
   
    public String toString(){	
	return toString(root);
    }

    public String toString(Node a){
	String s = "";
	if (a != null)
	    s += "" + a.getData() + "\n" ;
	if (a.getLeft() != null)
	    s += "Left: " + toString(a.getLeft()) + "\n" ;
	if (a.getRight() != null)
	    s += "Right: " + toString(a.getRight()) + "\n" ;
	return s;
    }

    public Node search(int x){
	Node p = root;
	while (p != null && p.getData()!=x){
	    if (p.getData() > x){
		p = p.getLeft();
	    }
	    else {
		p = p.getRight();
	    }
	}
	return p;
    }
    
}
"
    public void insert(int x){
	if (root == null){
	    root = new Node(x);
	    return;
	}
	Node next = root;
	while (next!= null){
	    if (x < next.getData()){
		next = next.getLeft();
	}
	}
    }
}
