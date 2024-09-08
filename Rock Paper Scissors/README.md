Rock-Paper-Scissors Game
Overview: 
The Rock-Paper-Scissors game is a classic hand game played between two people. Each player simultaneously forms one of three shapes (rock, paper, or scissors) with their hand. The winner is determined by the rules:

Rock crushes Scissors
Scissors cuts Paper
Paper covers Rock
The game can be played between two players or between a player and the computer.

Features of the Implementation:

Mode Selection:

The user is prompted to choose between two modes:
Single Player: The player competes against the computer.
Player vs Player: Two players compete against each other.
Single Player Mode:

The player inputs their choice (Rock, Paper, or Scissors).
The computer randomly selects its move.
The winner of each round is determined based on the standard rules.
The game continues until either the player or the computer wins 3 rounds.
Scores are displayed after each round, and the winner is announced when a player reaches 3 wins.
Player vs Player Mode:

Both players input their choices (Rock, Paper, or Scissors).
The winner of each round is determined based on the standard rules.
The game continues until either player wins 3 rounds.
Scores are displayed after each round, and the winner is announced when a player reaches 3 wins.
Input Validation:

The game checks if the player's input is valid (Rock, Paper, or Scissors). If not, it prompts the player to enter a valid choice.
Invalid input is handled gracefully by displaying an error message and asking for the input again.
Scoring System:

Scores are tracked for both players in the two-player mode and for the player and the computer in the single-player mode.
Scores are updated and displayed after each round to keep the players informed of the current standings.
Code Breakdown:

Main Method:

Provides the user with mode options.
Calls the appropriate method based on the user's choice.
rps2Players() Method:

Manages the Player vs Player mode.
Handles user input, determines the round winner, and updates scores.
Ends the game when a player wins 3 rounds.
rpsWithComputer() Method:

Manages the Single Player mode.
Handles user input and randomly generates the computer's move.
Determines the round winner and updates scores.
Ends the game when either the player or the computer wins 3 rounds.
isValidMove(String move) Method:

Validates the input to ensure it is one of the allowed moves (Rock, Paper, or Scissors).
isWinner(String player1, String player2) Method:

Determines if the first player wins against the second player based on the game rules.
Usage:

To play the game, compile and run the Java program.
Choose the game mode (1 for Single Player, 2 for Player vs Player) and follow the prompts to enter your choices.
The game will continue until a player wins 3 rounds, with scores and game outcomes displayed throughout.
