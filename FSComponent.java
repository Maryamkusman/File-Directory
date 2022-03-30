///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment8
// File:               FSComponent.java
// Quarter:            (CSE8B) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
/**
 *  FSComponent defines two abstract methods (toString() and
 * setParentDir(Directory dir)) that need to be overridden by its subclasses
 *
 * Bugs: Unknown
 *
 * @author Maryam Usman
 */
 public abstract class FSComponent {
	private String name;

	/**
	 * No-arg constructor. DO NOT CHANGE!
	 */
	public FSComponent() {
	}

	/**
	 * Public constructor that takes in a String. DO NOT CHANGE!
	 *
	 * @param name the name of the FSComponent
	 */
	public FSComponent(String name) {
		this.name = name;
	}

	/**
	 * Public getter that retrieves instance variable - name DO NOT CHANGE!
	 *
	 * @return instance variable - name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Public setter that mutates instance variable - name DO NOT CHANGE!
	 *
	 * @param name instance variable - name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Two FSComponent objects are equal if and only if they have the same class AND their names are the same.
	 * a NormalFile instance is not equal to a SubDirectory instance even
	 * if they have the same name.
	 * @param Object type called obj
	 * @return false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		FSComponent myComp = (FSComponent) obj;
		if (this.getName().equals(myComp.getName())) {
			return true;

		}

		return false;

	}

	/*
	 * The following three abstract methods needs to be implemented by its
	 * subclasses. DO NOT CHANGE!
	 */
	public abstract String toString();

	public abstract void setParentDir(Directory dir);

	/*
	 * For Assignment 9, the following abstract method needs to be implemented by
	 * its subclasses. DO NOT CHANGE!
	 */
	public abstract int getSize();
}
