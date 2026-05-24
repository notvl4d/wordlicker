# Wordlicker

Wordlicker is a simple Java command-line utility that reads a text file, prints its contents, and calculates basic text metrics.

## Project Overview

This project demonstrates a lightweight Java application with a modular package structure. The application asks the user for a file path, loads the file line by line, displays the file content, and reports:

- Total number of characters
- Total number of words

## Features

- Prompt for a file name using standard input
- Read text files line by line
- Print the file contents to the console
- Count and display total characters
- Count and display total words
- Simple Java module layout with clean package organization

## Installation

1. Install the Java Development Kit (JDK) 11 or newer.
2. Clone the repository if you have not already:

```bash
git clone https://github.com/notvl4d/wordlicker.git
```

3. Change into the Java project folder:

```bash
cd wordlicker/wordlicker
```

## Usage

### Compile

From the `wordlicker/wordlicker` directory, compile the source files:

```bash
javac -d out src/module-info.java src/com/myapp/Main.java src/com/myapp/io/ReadFile.java src/com/myapp/io/ReadUserInput.java
```

### Run

Run the application from the compiled module output:

```bash
java --module-path out --module wordlicker/com.myapp.Main
```

### Example

If you have a text file named `filename.txt` in the project folder, the app will prompt:

```text
Enter file name:
```

Enter `filename.txt` and the program will display the file contents and the counts for characters and words.

## Configuration

This project does not require any external configuration files. Input is provided interactively at runtime by entering the path of the text file to analyze.

## Development Setup

1. Make sure JDK 11+ is installed and `java`/`javac` are available in your PATH.
2. Use any Java-aware IDE or editor. The project already includes Eclipse metadata files (`.project`, `.classpath`, `.settings`).
3. To rebuild the project after changes, rerun the compile command shown in the Usage section.

## Testing Instructions

There is no automated test suite included in this repository yet. To verify the application manually:

1. Compile the application.
2. Run the program.
3. Enter a sample text file name, such as `filename.txt`.
4. Confirm the file content prints correctly and the displayed character/word counts match expectations.

