///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment8
// File:               File.java
// Quarter:            (CSE8B) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
/**
 * The NormalFile class extends from the File abstract class
 * and implements the Mutable interface (use the implements keyword). Since
 * NormalFile is a concrete class, NormalFile must override and implement all abstract
 * methods. NormalFile overrides the toString() method
 *
 * Bugs: unknown
 *
 * @author Maryam Usman
 */
 public abstract class File extends FSComponent {

    private int size;
    private Directory parentDir;

    /**
     * No-arg constructor. DO NOT CHANGE!
     */
    public File() {
        super("File");
    }

    /**
     * instanciates member variables
     *
     * @param String called name
     * @param int called size
     * @return nothing
     */
    public File(String name, int size) {
    	super(name);
    	this.parentDir=parentDir;
    	this.size=size;

    }

    /**
     * Public setter that mutates instance variable - size
     * DO NOT CHANGE!
     *
     * @param size instance variable - size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Public getter that retrieves instance variable - size
     * DO NOT CHANGE!
     *
     * @return instance variable - size
     */
    @Override
    public int getSize() {
        return this.size;
    }

    /**
     * Public getter that retrieves instance variable - parentDir
     * DO NOT CHANGE!
     *
     * @return instance variable - parentDir
     */
    public Directory getParentDir() {
        return this.parentDir;
    }

    /**
     * Public setter that mutates instance variable - parentDir
     * DO NOT CHANGE!
     *
     * @param parentDir instance variable - parentDir
     */
    @Override
    public void setParentDir(Directory parentDir) {
        this.parentDir = parentDir;
    }
}
