
📘 Instructions for Compiling and Running Java Exercises (via Terminal)

Ones you are cloned the repository the directory path goes: 

	- cd src/main/java/level1

Then you can go throw to the 5 different exercises of level1 and one exercise of level2. Enjoy!!


1. To access each exercise: cd exercise(1,2,3,4,5), example: - cd exercise3 

2. To compile and run the exercises you have a 'test' folder inside the resources folder.
	
	- You can access:

	    If you are inside of /S01.05-JavaUtils/...

		cd src/main/resources/test

	- Copy the path with your SO system and proof the exercise in a Terminal
		
		cd src/main/java/level1
		
		Complile: javac SortedDirectoryList.java
		
		Run: java SortedDirectoryList.java pathDirectory(by default: /S01.05-JavaUtils/src/main/resources/test




==============================================
🛠️ COMPILING JAVA FILES (.java → .class)

To compile a Java file:

- javac path/to/YourClass.java

✅ Example:

- javac src/exercise1/NoGenericMethods.java

If the exercise contains multiple Java files (classes, interfaces, etc.), you can compile them all together:

- javac src/exercise1/*.java



==============================================
📂 PATH DIRECTORY EXAMPLE

S01.05-JavaUtils/
├── .idea/
├── .mvn/
├── out/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── level1/
│   │   │   │   ├── exercise1/
│   │   │   │   ├── exercise2/
│   │   │   │   ├── exercise3/
│   │   │   │   ├── exercise4/
│   │   │   │   └── exercise5/
│   │   │   └── level2.exercise1/
│   │   │       ├── configLoader/
│   │   │       ├── directoryWriter/
│   │   │       ├── main/
│   │   │       └── resources/
│   │   └── resources/
│   │       ├── test/
│   │       └── config.properties
│   └── test/
├── target/
├── .gitignore
├── pom.xml
├── README.md
└── readme.txt


==============================================
📗 EXERCISES INSTRUCTIONS

LEVEL 1

* Put inside the directory with this path, copy/paste	

	- cd S01.05-JavaUtils/src/main/java/leve1


🔹 Exercise 1 – Sorted Directory Listing

1.  To access the exercise1 directory:

	- cd S01.05-JavaUtils/src/main/java/level1/exercise1

2. Compile: 

	- javac SortedDirectoryList.java 

3. Run: 

	- java SortedDirectoryList.java /path/to/directory ( by default: /yourPathDirectory/S01.05-JavaUtils/src/main/resources/test)

🔹 Exercise 2 – Recursive Directory Listing

1.  To access the exercise2 directory:

	- cd S01.05-JavaUtils/src/main/java/level1/exercise2

2. Compile: 

	- javac SortedDirectoryRecursive.java

3. Run: java SortedDirectoryRecursive.java /path/to/directory (by default: /yourPathDirectory/S01.05-JavaUtils/src/main/resources/test)


🔹 Exercise 3 – Recursive Directory Listing to File

1. To access the exercise3 directory :

	- cd S01.05-JavaUtils/src/main/java/level1/exercise3

2. Compile: 

	- javac RecursiveWriteFile.java

3 .Run: 

	- java RecursiveWriteFile.java /path/to/directory (by default: /yourPathDirectory/S01.05-JavaUtils/src/main/resources/test)


🔹 Exercise 4 – Read a .txt File

1. To access the exercise4 directory:

	- cd S01.05-JavaUtils/src/main/java/level1/exercise4

2. Compile: 

	- javac ReadTxtFile.java

3. Run: 

	- java ReadTxtFile.java /path/to/file.txt (by default: /yourPathDirectory/S01.05-JavaUtils/src/main/resources/sample3.txt



🔹 Exercise 5 – Serialize an Object to .ser File


1. To access the exercise5 directory:

	- cd S01.05-JavaUtils/src/main/java/level1/exercise5

2. Compile: 

	- javac SerializeFile.java

3. Run: 
	
	- java SerializeFile.java /path/to/output/ (by default: /yourPathDirectory/S01.05-JavaUtils/src/main/resources/test)



LEVEL 2

🔹 Exercise 1 – Parametrize with config.properties File

1. To access the exercise5 directory:

    - In the S01.05-JavaUtils/src/main/resources/config.properties
        edit the file and you should change your directory path, if you want how it works.

	- cd S01.05-JavaUtils/src/main/java/level2/exercise1


2. Compile:


	- javac **/*.java

Run:

	- java  java main/Main.java yourDirectoryPath/S10.05-JavaUtils/src/main/resources/config.properties



==============================================
📝 NOTE

Replace /path/to/... with the actual path on your system.

If using packages, always run Java classes using the fully qualified class name (e.g., packageName.ClassName).

The out/ folder is the output directory for compiled files.

If you’re using Maven or an IDE like IntelliJ, these steps are optional (handled automatically).

==============================================
✅ TIP (macOS)

When saving a .txt file using TextEdit on macOS:
Go to “Format” → “Make Plain Text” before saving.
This will prevent the file from being saved as .rtf (Rich Text Format).