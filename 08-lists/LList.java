public class LList {
    private Node l=null;
    private Node dummy = new Node ("");
    private int length=0;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
	length++;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

     public String get(int i){
	Node temp = dummy;
	for (int c = 0; c<i; c++){
	    temp = temp.getNext();
	}
	return temp.getData();
    }

    public void add(int i, String s){
	if (i==0){
	    add(s);
	}
	else {
	    Node temp = l;
	    for (int x = 0; x < i - 1; x++){
		temp = temp.getNext();
	    }
	    Node n = new Node(s);
	    n.setNext(temp.getNext());
	    temp.setNext(n);
	    length++;
	}
    }

 public String remove(int i){
	Node temp = dummy;
	for (int x = 0; x < i; x++ ){
	    temp = temp.getNext();
	}
	Node tmp = temp.getNext();
	temp.setNext(tmp.getNext());
	length--;
	return temp.getData();
    }



    public static void main(String[] args) {
	LList ret = new LList();
	ll.add("Fri");
	ll.add("Wed");
	System.out.println(ret.find(0));
    }

    
		
}
