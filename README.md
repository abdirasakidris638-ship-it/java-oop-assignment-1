# Assignment 01: Java OOP & Git Fundamentals

Welcome to your first Java assignment! This project is designed to help you practice **Encapsulation** in Java while mastering the **Git Workflow** used in professional software development.

---

## 🎯 Objectives
1. **Java OOP:** Implement a class with private fields, constructors, and methods.
2. **Git Mastery:** Demonstrate the ability to Stage, Commit, and Push code from your local machine.

---

## 🛠 Local Setup (VS Code)

Before starting, ensure you have the **JDK 21+** and **Visual Studio Code** installed.

1. **Accept the Assignment:** Click the GitHub Classroom link provided in class.
2. **Clone the Repo:** * Open VS Code.
   * Press `Ctrl + Shift + P` and type `Git: Clone`.
   * Paste your repository URL and select a folder on your computer.
3. **Install Extensions:** When prompted, install the **"Extension Pack for Java"**.

---

## 📝 The Java Task: The `Student` Class

Create a new file in the `src` folder named `Student.java`. 

1. **Encapsulation:** Create `private` fields for `name` (String) and `studentId` (int).
2. **Constructor:** Create a constructor that initializes these two fields.
3. **Methods:** Create `public` Getter and Setter methods for both fields.
4. **Main Execution:** In `Main.java`, instantiate at least two `Student` objects and print their names to the console.

---

## 🚀 Git Fundamentals (Submission Steps)

To receive full credit, you must show a **history of progress**. Do not upload your files directly to the GitHub website. Use the VS Code terminal or the Source Control tab.

### 1. Check your status
See which files you have modified:
```bash
git status

### 2. Stage your changes
Tell Git which files you want to include in your next "snapshot":

```bash
git add src/Student.java src/Main.java

###3. Commit with a message
Create a snapshot of your work.
**Requirement:** You must have at least **3 separate commits** (e.g., "Initial class setup," "Added getters/setters," "Completed Main logic").

```Bash
git commit -m "Your descriptive message here"

### 4. Push to GitHub
Upload your local commits to the cloud:

```Bash
git push origin main

## ⚠️ Important Rules
**Manual Grading:** Your instructor will review your Commit History to verify your involvement.
**Meaningful Messages:** Avoid generic messages like "update" or "fixed." Be descriptive!
**No Late Pushes:** Only commits pushed before the deadline will be reviewed.
