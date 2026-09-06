# 🎯 Simple Number Guessing Game

A simple and interactive **Number Guessing Game built using Java**. The
computer randomly selects a number between **1 and 100**, and the player
tries to guess it within a limited number of attempts.

The game provides hints such as **Too High** and **Too Low** after each
incorrect guess and also includes a simple scoring system and a replay
option.

------------------------------------------------------------------------

## 📌 Project Overview

The **Simple Number Guessing Game** is a beginner-friendly Java console
application created to practice fundamental Java programming concepts.

The program generates a random number between 1 and 100. The player gets
a maximum of **7 valid attempts** to guess the correct number. After
every guess, the program tells the player whether the guess is too high
or too low.

If the player guesses the number correctly, the game displays the number
of attempts used and the player's score. If all attempts are used, the
correct number is displayed.

------------------------------------------------------------------------

## ✨ Features

-   🎲 Random number generation between 1 and 100
-   🎯 Maximum 7 attempts per game
-   🔼 **Too High** hint
-   🔽 **Too Low** hint
-   ✅ Correct guess message
-   ⚠️ Invalid input handling
-   🔢 Range validation
-   🏆 Simple score calculation
-   🔄 Play Again option
-   💻 Console-based and easy to use

------------------------------------------------------------------------

## 🛠️ Technologies Used

-   **Java**
-   `Random` class
-   `Scanner` class
-   `while` loop
-   `if-else` conditions
-   Boolean variables
-   Basic input validation
-   Comparison operators

------------------------------------------------------------------------

## 🎮 How to Play

1.  Run the Java program.
2.  The computer generates a secret number between **1 and 100**.
3.  Enter your guess when prompted.
4.  The game gives you a hint:
    -   **Too Low!** --- your guess is smaller than the secret number.
    -   **Too High!** --- your guess is greater than the secret number.
    -   **Correct!** --- you guessed the secret number.
5.  You have a maximum of **7 valid attempts**.
6.  If you win, your attempts and score are displayed.
7.  Choose `yes` to start another game or `no` to exit.

------------------------------------------------------------------------

## 🖥️ Sample Output

``` text
================================
       NUMBER GUESSING GAME
================================
Guess a number between 1 and 100
You have 7 attempts.

Enter your guess: 50
Too High! Try again.
Attempts left: 6

Enter your guess: 25
Too Low! Try again.
Attempts left: 5

Enter your guess: 40
Too Low! Try again.
Attempts left: 4

Enter your guess: 45
Correct! You won!
Attempts used: 4
Your score: 40

Do you want to play again? (yes/no): no

Thanks for playing!
```

------------------------------------------------------------------------

## 📊 Scoring System

The score depends on how quickly the player guesses the correct number.

    Attempts Used   Score
  --------------- -------
                1      70
                2      60
                3      50
                4      40
                5      30
                6      20
                7      10

**Note:** The current scoring formula rewards fewer attempts.

------------------------------------------------------------------------

## 🧠 Program Logic

The basic logic of the game is:

``` text
Start
  ↓
Generate Random Number
  ↓
Set Maximum Attempts = 7
  ↓
Ask User for Guess
  ↓
Validate Input
  ↓
Compare Guess with Secret Number
  ↓
 ┌──────────────┬──────────────┐
 ↓              ↓              ↓
Too Low       Too High       Correct
 ↓              ↓              ↓
Try Again     Try Again       Win
       \          |          /
        \         |         /
          Attempts Finished?
              ↓
       Game Over / Play Again
```

------------------------------------------------------------------------

## 📚 Java Concepts Practiced

This project helped in understanding and practicing:

-   Java program structure
-   Classes and methods
-   Variables and data types
-   `Scanner` for taking user input
-   `Random` for generating random numbers
-   `while` loops
-   `if-else` conditions
-   Boolean variables
-   Comparison operators
-   Input validation
-   Basic game logic
-   Console output

------------------------------------------------------------------------

## ▶️ How to Run

### Prerequisites

Make sure Java is installed on your computer.

Check your Java installation using:

``` bash
java -version
```

You should also have the Java compiler:

``` bash
javac -version
```

### 1. Clone the Repository

``` bash
git clone https://github.com/your-username/Simple-Number-Guessing-Game.git
```

Replace `your-username` with your GitHub username.

### 2. Open the Project

Open the project folder in any Java-supported IDE, such as:

-   IntelliJ IDEA
-   Eclipse
-   NetBeans
-   Visual Studio Code

You can also run it directly from the terminal.

### 3. Compile the Program

``` bash
javac SimpleNumberGuessingGame.java
```

### 4. Run the Program

``` bash
java SimpleNumberGuessingGame
```

------------------------------------------------------------------------

## 📁 Project Structure

``` text
Simple-Number-Guessing-Game/
│
├── SimpleNumberGuessingGame.java
└── README.md
```

------------------------------------------------------------------------

## 🔧 Input Validation

The program checks the user's input before processing the guess.

For example:

``` text
Enter your guess: hello
Please enter a number only.
```

It also checks whether the number is within the allowed range:

``` text
Enter your guess: 150
Enter a number between 1 and 100.
```

Invalid input does not count as an attempt.

------------------------------------------------------------------------

## 🚀 Future Improvements

The project can be improved in the future by adding:

-   🎚️ Easy, Medium, and Hard difficulty levels
-   🏆 High-score system
-   👤 Player name
-   📈 Score history
-   🖼️ Java Swing GUI
-   ⏱️ Time-based challenge
-   🔊 Sound effects
-   📊 Statistics such as total games and win rate

------------------------------------------------------------------------

## 🎓 Learning Objective

The main purpose of this project is to understand how basic Java
programming concepts can be combined to create a small interactive
application.

The project focuses on:

> **Random Number Generation + User Input + Loops + Conditions + Input
> Validation**

------------------------------------------------------------------------

## 👨‍💻 Author

**Wasif Masood**

This project was created as part of my **Java programming practice and
learning projects**.

------------------------------------------------------------------------

## ⭐ Support

If you find this project useful or interesting, consider giving the
repository a **⭐ Star** on GitHub.

------------------------------------------------------------------------

## 📄 License

This project is created for **educational and learning purposes**.
