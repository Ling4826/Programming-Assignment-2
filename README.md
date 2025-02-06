# Checkwords

## Overview
The `Checkwords` program reads a text file, analyzes its content, and provides various statistics, including:
- Total number of characters
- Number of palindrome words
- Total number of tokens (words)
- Number of emoticons (`:)` and `:D`)
- Total number of lines
- The longest token (word)
- The average token size
- Execution time measurement

## Features
- Reads a text file specified by the user.
- Counts characters, words, and lines.
- Identifies palindromes and emoticons.
- Finds the longest word in the text.
- Calculates the average word length.
- Measures execution time for performance evaluation.

## How to Use
### 1. Run the Program
You can run the program directly using the precompiled `Checkwords.class` file.

#### Using Command Prompt
```sh
java Checkwords
```

#### Using VS Code
1. Open `Checkwords.java` in Visual Studio Code.
2. Use the built-in terminal to navigate to the correct directory.
3. Run the command:
   ```sh
   java Checkwords
   ```

### 2. Enter the File Path
- When prompted, enter the name of the text file located in `D:\InputFile\`.
- Example: If the file is `input1.txt`, enter `input1.txt`.

### 3. Output Example
```
Please enter the file path: input1.txt
Program start:

Total # Character count: 250
Total # Palindrome found: 5
Total Number of tokens: 50
Total Number of emoticon: 3
Total # of new line: 10
The longest token: vaccination
The average token size: 5

Total time to execute this program: 0.02 secs

Program terminated properly!
```

## Requirements
- Java 8 or later
- A valid text file located in `D:\InputFile\`

## Notes
- The program assumes that the input file exists in the specified directory (`D:\InputFile\`).
- It uses `StringTokenizer` for tokenizing words.
- The execution time is measured using `System.nanoTime()`.
- If the file is not found or cannot be read, the program will display an error message.

## Author
Developed by Wasinpat Yanin 672115043

