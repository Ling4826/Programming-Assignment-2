
# CovidVaccine

## Overview
The `CovidVaccine` program reads a text file, analyzes its content, and provides various statistics such as:
- Total number of characters
- Number of palindrome words
- Number of tokens (words)
- Number of emoticons (`:)` and `:D`)
- Number of lines
- Longest token (word)
- Average token size

## Features
- Reads a text file specified by the user.
- Counts characters, words, and lines.
- Identifies palindromes and emoticons.
- Finds the longest word in the text.
- Calculates the average word length.
- Measures execution time.

## How to Use
1. **Compile and Run the Program**
   ```sh
   javac CovidVaccine.java
   java ADT.work.CovidVaccine
   ```
2. **Enter the File Path**
   - When prompted, enter the name of the text file located in `D:\InputFile\`.
   - Example: If the file is `input1.txt`, enter `input1.txt`.

3. **Output**
   - The program will display the analyzed results along with execution time.

## Example Output
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
- It measures execution time to evaluate performance.

## Author 
Developed by Wasinpat yanin 672115043
