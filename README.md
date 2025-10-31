# S1.05 - Java Utils 🗂️

## 🧾 Task Objectives

- Practice file and directory management using Java.
- Understand recursive directory listing and sorting.
- Learn how to read and write `.txt` files in Java.
- Perform object serialization and deserialization using `.ser` files.
- Work with Java Properties files to parametrize execution.

---

## 📚 Documentation

- [Java I/O Tutorial – Oracle](https://docs.oracle.com/javase/tutorial/essential/io/)
- [Serialization in Java](https://docs.oracle.com/javase/8/docs/platform/serialization/spec/serialTOC.html)
- [Java Properties File](https://www.baeldung.com/java-properties)

---

## 🧪 Exercises

### 🔹 Level 1

<details>
  
### Exercise 1 

Create a class that receives a directory as a parameter and prints all its content in **alphabetical order** (by name).


### Exercise 2 

Extend the previous class to list the **entire directory tree recursively**.

- Print each file/directory in alphabetical order per level.
- Prefix each line with `D:` for directory or `F:` for file.
- Also show the **last modified date** of each item.

### Exercise 3 

Instead of printing the recursive directory structure to console, write it into a `.txt` file.

### Exercise 4 

Add functionality to **read any `.txt` file** and print its contents to the console.


### Exercise 5 

Serialize a Java object to a `.ser` file, then **deserialize it** to reconstruct the object.

</details>

---

### 🔹 Level 2

<details>
  
### Exercise 1

Modify **Exercise 3 from Level 1** so that it uses a `.properties` file for configuration.

You should parametrize:
- The directory to be read
- The name and path of the output `.txt` file

✅ Use either the native `java.util.Properties` class or the Apache Commons Configuration library.

</details>

---

## 💻 Technologies Used

- Java 17
- IntelliJ IDEA / Eclipse / VSCode
- Git & GitHub
- Optional: Maven for managing dependencies (e.g., Apache Commons)



## 📋 Requirements

- Java SDK 17 or higher installed
- Terminal or IDE with Java support
- Git installed for version control
- If using Maven, ensure it's installed and configured



## 🛠️ Installation

1. Clone the repository:

    ```bash
      git clone https://github.com/andyrouge81/S1.05-JavaUtils.git

2. Navigate into the project directory:

   ```bash
   cd S01.05-JavaUtils/src

3. Open the project with your favorite IDE (IntelliJ, Eclipse, etc.)


## ▶️ Execution

You can run the Java classes directly from the terminal:
    
     javac src/exercise1/*.java
     java exercise1.ClassName args...


For example:

    javac src/exercise1/SortedDirectoryList.java
    java exercise1.SortedDirectoryList /your/path/here


For parametric execution (Level 2):
  
      javac -d out src/main/java/level2/exercise1L2/**/*.java
      java -cp out:src/main/resources level2.exercise1.main.Main

Ensure that `config.properties` is inside the `resources` folder.


## 🌐 Deployment

This project is for educational purposes. You can export it as a `.jar` file via your IDE if needed.

## 📄 File Structure Example
```csharp

S1.05-JavaUtils/
│
├── src/
│   ├── exercise1/              # Level 1 Java classes
│   └── level2/
│       └── exercise1L2/        # Level 2 classes
│           ├── configLoader/  # Reads .properties file
│           ├── directoryWriter/
│           └── main/
├── resources/
│   └── config.properties       # Configuration file
├── out/                        # Compiled files
├── README.md
└── readme.txt                  # Execution commands (CLI)
```
🤝 Contributions

1. Fork the repository.
2. Create a new branch:
   ```bash
    git checkout -b feature/new-feature

3. Commit and push your changes:
    ```bash
    git commit -m "feat: added new feature"
    git push origin feature/new-feature

4. Open a pull request.

### 💌 Contact

For issues, suggestions or contributions, feel free to open an Issue or contact me via [GitHub profile](https://github.com/andyrouge81/S1.05-JavaUtils.git)

