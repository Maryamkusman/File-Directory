///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment8
// File:               Directory.java
// Quarter:            (CSE8B) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//

import java.util.ArrayList;

/**
 * This class The Directory abstract class inherits directly from the FSComponent abstract class.
 * Directory class has a list of FSComponent objects stored in componentList.
 * This componentList as a data structure that stores all files and directories under the
 * current directory
 * Bugs: unknown
 *
 * @author Maryam Usman
 */public abstract class Directory extends FSComponent {

	private ArrayList<FSComponent> componentList;

	/**
	 * No-arg constructor. DO NOT CHANGE!
	 */
	public Directory() {
		super("Directory");
	}

	/**
	 * inisitalizes member variables
	 *
	 * @param String called name
	 * @return nothing
	 */
	 	protected Directory(String name) {
		super(name);
		ArrayList<FSComponent> myComp = new ArrayList<FSComponent>();
		this.componentList = myComp;

	}

	/**
	 * Public getter that retrieves instance variable - componentList. DO NOT
	 * CHANGE!
	 *
	 * @return the componentList instance variable
	 */
	public ArrayList<FSComponent> getComponentList() {
		return this.componentList;
	}

	/**
	 * Public setter that mutate instance variable - componentList. DO NOT CHANGE!
	 *
	 * @param componentList the new componentList variable to be assigned
	 */
	public void setComponentList(ArrayList<FSComponent> componentList) {
		this.componentList = componentList;
	}

	/**
	 * Add a component to the end of the {@code this.componentList}. DO NOT CHANGE!
	 *
	 * @param newComp the new component to be appended
	 */
	public void appendComponent(FSComponent newComp) {
		this.componentList.add(newComp);
		newComp.setParentDir(this);
	}

	/**
	 * This method adds a FSComponent to its componentList. A method as adding a
	 * new file or directory to the current directory.
	 * @param newComp of type FSComponent
	 * @return true
	 */
	 	public boolean addComponent(FSComponent newComp) {
		if (newComp instanceof File) {
			for (int i = 0; i < componentList.size(); i++) {
				if (componentList.get(i) instanceof File && componentList.get(i).getName().equals(newComp.getName())) {
					return false;
				}
			}
		}
		if(newComp instanceof Directory) {
			for (int j=0; j<componentList.size();j++) {
				if (componentList.get(j) instanceof Directory && componentList.get(j).getName().equals(newComp.getName())) {
					return false;

			}
		}
	}
		this.appendComponent(newComp);
		return true;
	}

	/**
	 * This method will print out all files and directories under the current directory.
	 *
	 * @return nothing because its void
	 */
	 	public void printDirectory() {
		System.out.println(this);
		for(int i=0; i<componentList.size(); i++) {
			System.out.println("\t"+componentList.get(i));
		}
	}


	/**
	 * This is a void method
	 *
	 * @return nothing
	 */
	 	public void printStructure() {

	}

	/**
	 * this returns the size to be -1
	 *
	 * @return -1
	 */
	 	@Override
	public int getSize() {
		return -1;
	}
}
