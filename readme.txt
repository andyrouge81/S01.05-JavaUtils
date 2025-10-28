📘 Instructions for Compiling and Running Java Exercises (via Terminal)

==============================================
🛠️ COMPILING JAVA FILES (.java → .class)

To compile a Java file:

- javac path/to/YourClass.java

✅ Example:

- javac src/exercise1/NoGenericMethods.java

If the exercise contains multiple Java files (classes, interfaces, etc.), you can compile them all together:

- javac src/exercise1/*.java

==============================================
▶️ RUNNING A JAVA PROGRAM (.class)

Once compiled, to run a Java program:

- java path.to.YourClass

✅ Example:

- java exercise1.NoGenericMethodsMain

⚠️ Make sure you are in the root directory of the project when executing these commands (where the src/ folder is).

==============================================
📂 PATH DIRECTORY EXAMPLE

TascaS105JavaUtils/
├── pom.xml
├── src/
│ └── main/
│ ├── java/
│ │ └── level2/
│ │ └── exercise1L2/
│ │ ├── main/
│ │ │ └── Main.java ✅
│ │ ├── configLoader/
│ │ │ └── ConfigLoader.java
│ │ └── directoryWriter/
│ │ └── DirectoryWriter.java
│ └── resources/
│ └── config.properties ✅

==============================================
📗 EXERCISES INSTRUCTIONS

LEVEL 1

🔹 Exercise 1 – Sorted Directory Listing
Compile: javac src/exercise1L1/SortedDirectoryList.java
Run: java exercise1L1.SortedDirectoryList /path/to/directory

🔹 Exercise 2 – Recursive Directory Listing
Compile: javac src/exercise1L1/SortedDirectoryRecursive.java
Run: java exercise1L1.SortedDirectoryRecursive /path/to/directory

🔹 Exercise 3 – Recursive Directory Listing to File
Compile: javac src/exercise1L1/RecursiveWriteFile.java
Run: java exercise1L1.RecursiveWriteFile /path/to/directory

🔹 Exercise 4 – Read a .txt File
Compile: javac src/exercise1L1/ReadTxtFile.java
Run: java exercise1L1.ReadTxtFile /path/to/file.txt

🔹 Exercise 5 – Serialize an Object to .ser File
Compile: javac src/exercise1L1/SerializeFile.java
Run: java exercise1L1.SerializeFile /path/to/output.ser

LEVEL 2

🔹 Exercise 1 – Parametrize with config.properties File
Compile:

- javac -d out src/main/java/level2/exercise1L2/**/*.java
Run:

- java -cp out:src/main/resources level2.exercise1L2.main.Main

⚠️ Make sure config.properties is located in src/main/resources.

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