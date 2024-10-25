A Java-based project for comparing text files within two folders using semantic analysis techniques. This tool leverages Natural Language Processing (NLP) to tokenize and vectorize text, and then measures similarity between files using cosine similarity.

Features
Compares files in two directories and calculates semantic similarity between each file pair.
Uses Stanford CoreNLP for tokenization and preprocessing.
Implements cosine similarity to calculate and output a similarity score.
Provides a modular design with classes for file handling, tokenization, vectorization, and similarity calculation.

Technologies Used
Language: Java
NLP Library: Stanford CoreNLP for text tokenization and preprocessing.
Java I/O and NIO Packages: Efficient file handling and directory traversal.
Data Structures: Java Collections (List, Map, Set).

Prerequisites
Java Development Kit (JDK) 8 or higher
Maven for dependency management (recommended)
Stanford CoreNLP library: Download here or add as a Maven dependency.

Usage
Modify folderPath1 and folderPath2 in App.java to specify the directories containing text files to compare.
Run the application using your preferred IDE or from the command line as shown above.
The program outputs similarity scores for each file pair from the two directories.
