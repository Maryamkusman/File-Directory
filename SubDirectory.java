///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment8
// File:               SubDirectory.java
// Quarter:            (CSE8B) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
/**
 * The SubDirectory class extends from the Directory abstract class (use the extends keyword)
 * and implements the Mutable interface (use the implements keyword). Since
 * SubDirectory is a concrete class, it must override and implement all abstract methods
 *
 * Bugs: unknwon
 *
 * @author Maryam Usman
 */
public class SubDirectory extends Directory implements Mutable {
  private Directory parentDir;
	public SubDirectory() {
	}
  /**
   * instantiates member variable from super class
   *
   * @param String called name
   * @param int called size
   * @return nothing
   */
	public SubDirectory(String name) {
		super(name);
	}
  public void setParentDir(Directory parentDir){
    this.parentDir=parentDir;
  }
  public Directory getParentDir(){
    return this.parentDir;
  }
  /**
 * This method takes in a String representing the new name to change.
 * If this directory has no parentDir, then simply change the member variable name of the
 * current directory to parameter name, and return true
 *
 * @param A String called name
 * @return true
 */
  @Override
	public boolean rename(String name) {
		if(this.getParentDir()==null) {
			setName(name);
			return true;
		}
    int i=this.getParentDir().getComponentList().size();
		for(int j=0; j<i; j++) {
			if(this.getParentDir().getComponentList().get(j) instanceof Directory && name.equals(this.getParentDir().getComponentList().get(j).getName())) {
				return false;
			}
		}
		setName(name);
		return true;
	}
  /**
 * This method removes the current object from the componentList of its parent and
 * returns true. This method should ALWAYS return true because one can always
 * delete the current Directory.
 *
 * @return true
 */
@Override
	public boolean delete() {
    int j=this.getParentDir().getComponentList().size();
		for (int i = 0; i < j; i++) {
			if (this==this.getParentDir().getComponentList().get(i)) {
  			this.getParentDir().getComponentList().remove(i);
				this.setParentDir(null);
				return true;
			}
		}
		return true;
	}
  /**
 * Moves the current Directory to the designated Directory called dir. This method checks
 * whether dir contains a file that has the same name as our current file (only those
 * components in dir's componentList).
 *
 * @param Directory type called dir
 * @return true
 */
@Override
	public boolean moveTo(Directory dir) {
    int j=dir.getComponentList().size();
		for (int m = 0; m < j; m++) {
      String componentName=dir.getComponentList().get(m).getName();
			if (dir.getComponentList().get(m) instanceof Directory  && componentName==this.getName()){
				return false;
			}
		}
    this.delete();
			dir.addComponent(this);
      this.setParentDir(dir);
			return true;
	}
  /**
   * (This method should return the string representation of the SubDirectory object
   *
   * @return "Sub Directory: " + this.getName()
   */
	@Override
	public String toString() {
		return "Sub Directory: " + this.getName();
	}
}
