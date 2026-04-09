# 📝 Java Console Todo App

A simple and clean **Todo Application built in Core Java** using a console interface.
This project is designed for learning **clean code structure, file handling, and basic OOP concepts**.

---

## 🚀 Features

* ✅ Add new tasks
* 📋 View all tasks
* ✔️ Mark tasks as completed
* 🗑️ Delete tasks
* ✏️ Update task title
* 💾 Save tasks to file
* 📂 Load tasks from file on startup

---

## 🧱 Project Structure

```text
TodoApp/
├── Main.java            # Entry point (handles user input & menu)
├── Todo.java            # Model class (represents a task)
├── TodoController.java  # Handles all task operations
├── FileManager.java     # Handles file read/write
└── AppMessages.java     # Stores all user-facing messages
```

---

## 🧠 Concepts Used

* Object-Oriented Programming (OOP)
* Encapsulation
* Lists (`ArrayList`)
* File Handling (`BufferedReader`, `BufferedWriter`)
* Exception Handling
* Clean Code Practices (separation of concerns)

---

## 💻 How to Run

### 1. Compile the project

```bash
javac Main.java Todo.java TodoController.java FileManager.java AppMessages.java
```

### 2. Run the application

```bash
java Main
```

---

## 📁 Data Storage

Tasks are stored in a file:

```text
tasks.txt
```

Example format:

```text
1,Learn Java,false
2,Build Todo App,true
```

---

## 🎯 Learning Goal

This project helps you understand:

* How to structure a Java project cleanly
* How to separate logic, UI, and data handling
* How to build a real working CLI application

---

## 🔧 Future Improvements

* 🔍 Filter tasks (completed / pending)
* 📅 Add due dates
* 🧾 Better validation messages
* 🌐 Convert into REST API (Spring Boot)
* 💽 Use database instead of file

---

## 🙌 Author

Built for learning and practicing clean Java development.

