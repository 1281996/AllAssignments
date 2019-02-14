package com.mallika.collections;

import java.util.TreeSet;

public class TreesetAssi1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreesetAssignment1 tree1 = new TreesetAssignment1("maalika", 5.5, 45);
		TreesetAssignment1 tree2 = new TreesetAssignment1("prasad", 5.9, 78);
		TreesetAssignment1 tree3 = new TreesetAssignment1("santhi", 5.9, 75);
		TreesetAssignment1 tree4 = new TreesetAssignment1("akka", 5.0, 135);
		TreeSet<TreesetAssignment1> treeSet1 = new TreeSet();
		treeSet1.add(tree1);
		treeSet1.add(tree2);
		treeSet1.add(tree3);
		treeSet1.add(tree4);
		for (TreesetAssignment1 tree : treeSet1) {
			System.out.println("name " + tree.name + " " + "height "
					+ tree.height + " " + "weight " + tree.weight);
		}

	}

}
