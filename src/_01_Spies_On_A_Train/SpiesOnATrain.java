package _01_Spies_On_A_Train;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    	//print clues
    	for (int i = 0; i < clues.length; i++) {
			System.out.println(clues[i]);
		}
    	//make an array of all passeneger names
    	ArrayList<String> names = new ArrayList<String>();
    	Node<TrainCar> node2 = train.getHead();
    	for (int i = 0; i < train.size(); i++) {
			names.add(node2.getValue().toString());
			node2 = node2.getNext();
		}
    	
    	//then go through and question the passenegrs
    	//check for name matching the list of a different passeneger
    	//if name matches clue who is not passenger, then its spy
    	Node<TrainCar> node = train.getHead();
    	for (int i = 0; i < train.size(); i++) {
    		TrainCar trainCar = node.getValue();
    		for (int j = 0; j < clues.length; j++) {
				System.out.println(trainCar.toString() + clues[j]);
				System.out.println(" ");
				System.out.println(trainCar.questionPassenger());
				for (int j2 = 0; j2 < names.size(); j2++) {
					if (trainCar.questionPassenger().contains(clues[j])) {
						if (trainCar.questionPassenger().contains(names.get(j2)) && !names.get(j2).equals(trainCar.toString())) {
							return names.get(j2);
						}
					}
				}
				
				
			}
    		node = node.getNext();
		}
    	
        return null;

    }

}
