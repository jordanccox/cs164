// P6.java
// Author: Cox, Jordan
// Date:   Feb 25, 2019
// Class:  CS164
// Email:  jordancc@rams.colostate.edu

public class P6 {

    // Class variables
    public static Maze maze;
    public static int mazeWidth;
    public static int mazeHeight;

    public static void main(String[] args) {

        // Create maze
        String fileName = args[0];
        System.err.println("Maze name: " + fileName);

        // Get dimensions
        maze = new Maze(fileName);
        mazeWidth = maze.getWidth();
        mazeHeight = maze.getHeight();
        System.err.println("Maze width: " + mazeWidth);
        System.err.println("Maze height: " + mazeHeight);

        // Add code to move around maze
        int i;
        int j;
        
        for (i = 0; i < maze.getWidth(); i++) {
        	for (j = 0; j < maze.getHeight(); j++) {
        	if (((maze.getRow() == 0) || (maze.getRow() % 2 == 0)) && (maze.getColumn() < maze.getWidth() - 1)) {
        			maze.moveRight();
        	}
        	if (((maze.getRow() == 0) || (maze.getRow() % 2 == 0)) && (maze.getColumn() < maze.getWidth() - 1) && (maze.moveRight() == false)) {
        		maze.moveDown();
        		maze.moveRight();
        		maze.moveRight();
        		maze.moveUp();
        	}
        	if (((maze.getRow() == 0) || (maze.getRow() % 2 == 0)) && (maze.getColumn() == maze.getWidth() - 1)) {
        		maze.moveDown();
        	}
        	if ((maze.getRow() % 2 != 0) && (maze.getColumn() > 0)) {
        		maze.moveLeft();
        	}
        	if ((maze.getRow() % 2 != 0) && (maze.getColumn() > 0) && (maze.moveLeft() == false)) {
        		maze.moveDown();
        		maze.moveLeft();
        		maze.moveLeft();
        		maze.moveUp();
        	}
        	if ((maze.getRow() % 2 != 0) && (maze.getColumn() == 0)) {
        		maze.moveDown();
        	}
        	}
        }
    }
}   
