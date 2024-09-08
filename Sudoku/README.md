Overview: This Java program implements a console-based Sudoku game where users can choose from three pre-defined Sudoku boards and then interactively solve the puzzle. The game adheres to standard Sudoku rules: no duplicate numbers in any row, column, or 3x3 sub-grid.

Key Features:

Board Selection:

Users can choose from three pre-defined Sudoku boards.
Each board is initialized with some numbers filled in and the rest of the cells are empty (represented by 0).
Game Rules:

No number can repeat in any row.
No number can repeat in any column.
Each 3x3 sub-grid must contain all numbers from 1 to 9 without repetition.
Gameplay:

Users are prompted to enter numbers to fill in the empty cells of the Sudoku board.
The program checks for the validity of the number based on the Sudoku rules before placing it in the board.
The game ends when the board is completely filled correctly or when a certain number of moves have been made.
Validation:

The program validates each number entry against the current state of the board to ensure no rule violations occur.
Validation includes checking rows, columns, and 3x3 sub-grids.
Code Description:

Main Method:

Displays available Sudoku boards and prompts the user to choose one.
Initializes the chosen board and its fixed cells (those that cannot be changed).
Starts the gameplay loop.
Board Initialization:

boardAssign(int[][] entries, int[][] board): Initializes the Sudoku board with given entries.
fixBoard(int[][] entries, boolean[][] boardcheck): Marks cells with pre-filled values to prevent modification during gameplay.
Gameplay Methods:

play(int[][] board, boolean[][] boardcheck): Main game loop allowing users to input numbers and interact with the board. It calls validation methods and checks for game completion.
gameWon(int[][] board): Checks if the board is completely and correctly filled.
printBoard(int[][] board): Displays the Sudoku board in a formatted way for better readability.
Validation Methods:

checkValid(int n, int[][] board, int row, int col): Checks if a number can be placed in the specified cell without violating row and column rules.
checkSubGrid(int n, int[][] board, int row, int col): Checks if a number can be placed in the specified cell without violating the 3x3 sub-grid rule.
Usage Instructions:

Run the Program:

Compile and run the program in a Java-supported environment.
Choose a game mode (Single Player or Player vs Player).
Select a Sudoku board from the provided options.
Play the Game:

Follow the prompts to enter row, column, and number to fill in the board.
The program will validate entries and update the board.
Continue filling in the board until it is correctly solved or you decide to stop.
