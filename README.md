# Java Journey

Welcome to my **Java Journey** repository! This project contains a collection of Java programs that showcase various core and advanced concepts in object-oriented programming (OOP), as well as practical examples and problem-solving exercises. The goal of this repository is to document my learning process and to create a clean, well-structured reference for future Java developers.

## Project Structure

The project is organized into a clean and understandable folder structure to ensure ease of navigation. Each folder represents a major concept or topic in Java programming.

### Folder Structure

```plaintext
JavaJourney/
│
├── src/
│   ├── BasicPrograms/       # Simple introductory programs for beginners
│   ├── OOPConcepts/         # Core Object-Oriented Programming concepts (e.g., Inheritance, Polymorphism)
│   ├── ProblemSolving/      # Problem-solving examples (Recursion, Series, String manipulations)
│   ├── AdvancedConcepts/    # Advanced Java topics (e.g., Exception Handling, Multithreading)
│   ├── RealLifeExamples/    # Real-life examples and case studies
│   └── Games/               # Fun projects and games coded in Java
│
├── libs/                    # Contains external libraries used in the project (e.g., JAR files)
│
├── docs/                    # Documentation, including detailed notes on Java topics
│   └── Java_Complete_Notes.pdf
│
└── README.md                # This file, explaining the project structure and purpose
```
## Key Directories

### src/BasicPrograms/
Contains simple, foundational Java programs for beginners, such as basic input/output, loops, and conditionals.

### src/OOPConcepts/
Core OOP topics, including **Abstract Classes**, **Interfaces**, **Method Overloading**, and **Dynamic Method Dispatch**.

### src/ProblemSolving/
A collection of programs focused on solving common algorithmic problems, such as recursion, series calculations, and string manipulations.

### src/AdvancedConcepts/
Advanced Java topics, such as **Exception Handling**, **Multithreading**, and **Coupling**, providing deeper insights into more complex features of the Java language.

### src/RealLifeExamples/
This folder includes Java programs that tackle real-world problems and demonstrate how Java can be used in practical applications.

### src/Games/
Fun, game-related Java projects that demonstrate how object-oriented programming can be used for interactive and creative tasks.

### libs/
External libraries, such as **JAR files** required for some programs, are stored here for easy management.

### docs/
Additional documentation, including PDF notes that provide detailed explanations of various Java concepts.

## Running the Programs

To run any of the programs in the `src` directory:

1. Ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed.
2. Navigate to the directory of the program you want to run.
3. Compile the Java file using the following command:
   ```bash
   javac ProgramName.java
   ```
4. Run the compiled program:
   ```bash
   java ProgramName
   ```
# External Libraries

Some programs use external libraries, which are located in the `libs/` folder. Make sure to include them in your classpath when running programs that depend on them. You can do this using the following command:

```bash
java -cp .:libs/jarfilename ProgramName
```
# Contributing

Feel free to fork this repository, open issues, or create pull requests. I welcome contributions and feedback from fellow Java enthusiasts!
# License
This project is open-source under the MIT License. You are free to use, modify, and distribute the code as per the terms of the license.
