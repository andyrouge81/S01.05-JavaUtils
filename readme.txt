{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf0 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 \uc0\u55357 \u56536  Instructions for Compiling and Running Java Exercises (via Terminal)\
\
==============================================\
\uc0\u55357 \u57056 \u65039   COMPILING JAVA FILES (.java \u8594  .class)\
==============================================\
\
To compile a Java file:\
\
    javac path/to/YourClass.java\
\
\uc0\u9989  Example:\
\
    javac src/exercise1/NoGenericMethods.java\
\
If the exercise contains multiple Java files (classes, interfaces, etc.), you can compile them all together:\
\
    javac src/exercise1/*.java\
\
\
==============================================\
\uc0\u9654 \u65039  RUNNING A JAVA PROGRAM (.class)\
==============================================\
\
Once compiled, to run a Java program:\
\
    java path.to.YourClass\
\
\uc0\u9989  Example:\
\
    java exercise1.NoGenericMethodsMain\
\
\uc0\u9888 \u65039  Make sure you are in the **root directory** of the project when executing these commands (where the `src/` folder is).\
\
=============================================\
\uc0\u55358 \u56830 PATH DIRECTORY EXAMPLE\
=============================================\
\
TascaS105JavaUtils/\
\uc0\u9500 \u9472 \u9472  pom.xml\
\uc0\u9500 \u9472 \u9472  src/\
\uc0\u9474    \u9492 \u9472 \u9472  main/\
\uc0\u9474        \u9500 \u9472 \u9472  java/\
\uc0\u9474        \u9474    \u9492 \u9472 \u9472  level2/\
\uc0\u9474        \u9474        \u9492 \u9472 \u9472  exercise1L2/\
\uc0\u9474        \u9474            \u9500 \u9472 \u9472  main/\
\uc0\u9474        \u9474            \u9474    \u9492 \u9472 \u9472  Main.java \u9989 \
\uc0\u9474        \u9474            \u9500 \u9472 \u9472  configLoader/\
\uc0\u9474        \u9474            \u9474    \u9492 \u9472 \u9472  ConfigLoader.java\
\uc0\u9474        \u9474            \u9492 \u9472 \u9472  directoryWriter/\
\uc0\u9474        \u9474                \u9492 \u9472 \u9472  DirectoryWriter.java\
\uc0\u9474        \u9492 \u9472 \u9472  resources/\
  |\uc0\u9472 \u9472  config.properties \u9989 \
\
\
==============================================\
\uc0\u55357 \u56516  EXERCISES INSTRUCTIONS\
==============================================\
\
\uc0\u9679  LEVEL 1\
\
\uc0\u55357 \u56633  Exercise 1 \'96 Sorted Directory Listing\
    Compile: javac src/exercise1L1/SortedDirectoryList.java  \
    Run:     java exercise1L1.SortedDirectoryList /path/to/directory\
\
\uc0\u55357 \u56633  Exercise 2 \'96 Recursive Directory Listing\
    Compile: javac src/exercise1L1/SortedDirectoryRecursive.java  \
    Run:     java exercise1L1.SortedDirectoryRecursive /path/to/directory\
\
\uc0\u55357 \u56633  Exercise 3 \'96 Recursive Directory Listing to File\
    Compile: javac src/exercise1L1/RecursiveWriteFile.java  \
    Run:     java exercise1L1.RecursiveWriteFile /path/to/directory\
\
\uc0\u55357 \u56633  Exercise 4 \'96 Read a .txt File\
    Compile: javac src/exercise1L1/ReadTxtFile.java  \
    Run:     java exercise1L1.ReadTxtFile /path/to/file.txt\
\
\uc0\u55357 \u56633  Exercise 5 \'96 Serialize an Object to .ser File\
    Compile: javac src/exercise1L1/SerializeFile.java  \
    Run:     java exercise1L1.SerializeFile /path/to/output.ser\
\
\
\uc0\u9679  LEVEL 2\
\
\uc0\u55357 \u56633  Exercise 1 \'96 Parametrize with config.properties File\
\
    Compile:\
        javac -d out src/main/java/level2/exercise1L2/**/*.java\
\
    Run:\
        java -cp out:src/main/resources level2.exercise1L2.main.Main\
\
    \uc0\u9888 \u65039  Make sure `config.properties` is located in `src/main/resources`.\
\
\
==============================================\
\uc0\u55357 \u56550  NOTE\
- Replace `/path/to/...` with the actual path on your system.\
- If using packages, always run Java classes using the **fully qualified class name** (e.g., `packageName.ClassName`).\
- The `out/` folder is the output directory for compiled files.\
- If you\'92re using Maven or an IDE like IntelliJ, these steps are optional (handled automatically).\
}