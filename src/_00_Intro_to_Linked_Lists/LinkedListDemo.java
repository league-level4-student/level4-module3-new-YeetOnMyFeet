package _00_Intro_to_Linked_Lists;

public class LinkedListDemo {

    public static <T> void main(String[] args) {

        /*
         * A LinkedList is a linear data structure, but unlike an ArrayList or
         * Array the data is not stored in contiguous memory locations.
         * 
         * Instead, each data node contains a reference that says where the next
         * node can be found.
         * 
         * Note: In the Node example provided there is also reference that
         * points back to the previous node.
         * 
         * 1. Read through the LinkedList and Node classes.
         * 
         * 2. Create a LinkedList of any type you like.
         * 
         * 3. Try using some LinkedList methods to add, remove and print
         * elements.
         * 
         * 4. Save the head or tail reference into a Node and try using 
         * references to perform an operation on every element in the LinkedList
         * 
         * e.g. multiply every element by something in a LinkedList containing
         * numbers or make word uppercase in a LinkedList containing String
         * nodes.
         * 
         */
    	Node<String> node;
    	LinkedList<String> linkedList = new LinkedList<String>();
    	linkedList.add("Hello");
    	linkedList.add("Hi there");
    	linkedList.add("My name is Roshan");
    	linkedList.add("Nice to meet you");
    	linkedList.add("Chicken");
    	node = linkedList.getHead();
    	System.out.println(node.getValue());
    	System.out.println(linkedList.getTail().getValue());
    	
    	for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(node.getValue());
			node = node.getNext();
		}
    	
    	
    }

}
