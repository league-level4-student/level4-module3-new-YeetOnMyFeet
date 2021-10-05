package _05_Intro_to_AVL_Trees;

import _03_Intro_to_Binary_Trees.BinaryTree;
import _03_Intro_to_Binary_Trees.Node;
import _04_Morse_Code.MorseCode;

public class AVLTreeDemo {

	/*
	 * An AVLTree is a special BinaryTree that is capable of balancing itself. On a
	 * regular binary tree, depending on the elements inserted, you might have a
	 * root with one very long right branch and one very long left branch with
	 * nothing else in between.
	 * 
	 * 1.) Read through the AVLNode and AVLTree. Notice that the methods are similar
	 * to those in BinaryTree with two important distinctions:
	 * 
	 * a) Each Node has a balance factor that keeps track of how many levels "down"
	 * it is relative to the rest of the tree.
	 * 
	 * b) There are "rotate" helper methods used when a given node gets too
	 * unbalanced(> 1 level out of sync with the rest of the tree) to rotate
	 * branches back into place.
	 * 
	 * 2.) Create a BinaryTree and an AVLTree.
	 * 
	 * 3.) Try inserting the same values into both trees and observe how they differ
	 * using the print method.
	 * 
	 * 4.) Try removing elements and see how they change.
	 */

	public static void main(String[] args) {
		Node<Integer> node;
		Node<Integer> node2;
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
		tree.insert(8);
		binaryTree(tree.getRoot());
		
		
		

		AVLTree<Integer> avltree = new AVLTree<Integer>();
		avltree.insert(5);
		avltree.insert(6);
		avltree.insert(7);
		avltree.insert(8);
		avlTree(avltree.getRoot());
		//System.out.println("This is the avl tree");
		
		
	}
	public static void binaryTree(Node<Integer> node) {
		if (node == null) {
			return;
		}
		System.out.println(node.getValue());
		binaryTree(node.getLeft());
		binaryTree(node.getRight());
		
	}
	public static void avlTree(Node<Integer> node2) {
		if (node2 == null) {
			return;
		}
		System.out.println(node2.getValue());
		avlTree(node2.getLeft());
		avlTree(node2.getRight());
		
	}

}
