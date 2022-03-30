///////////////////////////////////////////////////////////////////////////////
// Title:              Virtual File System
// File:               Assignment8.java
// Quarter:            Fall 2021
//
// Author:             CSE 8B Staff
// Email:              N/A
// Instructor's Name:  Benjamin Ochoa
///////////////////////////////////////////////////////////////////////////////

/**
 * The {@code Assignment8} class contains testers to test the functionality of
 * all other java classes.
 *
 * Bugs: None
 *
 * @author CSE 8B Staff
 */
public class Assignment8 {
    /**
     * A tester for the file system.
     *
     * @return return true if the tester passes
     */
    private static boolean testOne() {
        RootDirectory root = new RootDirectory("Home");
        NormalFile pic = new NormalFile("cat.png", 4);
        NormalFile rice = new NormalFile("rice.mp3", 10);
        SubDirectory music = new SubDirectory("music");
        root.addComponent(pic);
        root.addComponent(rice);
        root.addComponent(music);

        if (!root.getName().equals("Home")) return false;
        if (!pic.getName().equals("cat.png")) return false;
        if (!rice.getName().equals("rice.mp3")) return false;
        if (!music.getName().equals("music")) return false;

        /**
         * I expect `printDirectory()` to show the following:
         * * * * * * * * * * * * * * * * * * * *
         *  Root Directory: Home
         *      Normal file: cat.png
         *      Normal file: rice.mp3
         *      Sub Directory: music
         * * * * * * * * * * * * * * * * * * * *
         */
        root.printDirectory();
        System.out.println();

        return true;
    }
    private static boolean testTwo() {
        RootDirectory root = new RootDirectory("CSE8b");
        NormalFile pic = new NormalFile("dog.png", 4);
        NormalFile rice = new NormalFile("food.mp3", 10);
        SubDirectory music = new SubDirectory("sounds");
        root.addComponent(pic);
        root.addComponent(rice);
        root.addComponent(music);

        if (!root.getName().equals("CSE8b")) return false;
        if (!pic.getName().equals("dog.png")) return false;
        if (!rice.getName().equals("food.mp3")) return false;
        if (!music.getName().equals("sounds")) return false;

        root.printDirectory();
        System.out.println();

        return true;
    }
    private static boolean testThree() {
        RootDirectory root = new RootDirectory("Canvas");
        NormalFile pic = new NormalFile("bird.png", 4);
        root.addComponent(pic);


        if (!root.getName().equals("Canvas")) return false;
        if (!pic.getName().equals("bird.png")) return false;
        root.printDirectory();
        System.out.println();

        return true;
    }
    private static boolean testFour() {
        RootDirectory root = new RootDirectory("Cool");
        NormalFile pic = new NormalFile("amazing.png", 4);
        root.addComponent(pic);


        if (!root.getName().equals("Cool")) return false;
        if (!pic.getName().equals("amazing.png")) return false;
        root.printDirectory();
        System.out.println();

        return true;
    }
    private static boolean testFive() {
        RootDirectory root = new RootDirectory("Computer");
        NormalFile pic = new NormalFile("fantastic.png", 4);
        root.addComponent(pic);


        if (!root.getName().equals("Computer")) return false;
        if (!pic.getName().equals("fantastic.png")) return false;
        root.printDirectory();
        System.out.println();

        return true;
    }
    private static boolean testSix() {
        RootDirectory root = new RootDirectory("This is a test");
        NormalFile pic = new NormalFile("test.png", 4);
        root.addComponent(pic);


        if (!root.getName().equals("This is a test")) return false;
        if (!pic.getName().equals("test.png")) return false;
        root.printDirectory();
        System.out.println();

        return true;
    }

    // TODO: ADD MORE TESTER METHODS.

    // Suggestion: you should test moving, renaming,
    // and deleting files/directories. Check for edges cases
    // (e.g., moving a file into a directory, but the directory
    // already contains a file of the same name).


    /**
     * All unit tests. This method should be executed to ensure that all
     * methods are correctly implemented.
     *
     * @return true if all unit tests passed, false otherwise.
     */
    public static boolean unitTests() {
      if (!testOne()){
        return false;
      }
      if(!testTwo()){
        return false;
      }
      if(!testThree()){
        return false;
      }
      if(!testFour()){
        return false;
      }
      if(!testFive()){
        return false;
      }
      if(!testSix()){
        return false;
      }
      return true;


    }

    /**
     * The main method, where program execution begins.
     *
     * @param args Any command-line arguments.
     */
    public static void main(String[] args) {
        if (unitTests()) {
            System.out.println("All unit tests passed.\n");
        } else {
            System.out.println("Failed test.\n");
        }
    }
}
