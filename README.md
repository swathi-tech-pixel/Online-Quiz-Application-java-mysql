# 🧠 Online Quiz Application

This is a console-based Online Quiz Application developed using Java and MySQL. It allows users to log in, attempt multiple-choice questions, and view their final score.

---

## 👩‍💻 Project Description

The Online Quiz Application is designed to conduct quizzes in an automated way. It handles user authentication, question management, and score calculation using Java programming and MySQL database connectivity.

---

## 🚀 Features

- User Login System
- Multiple Choice Questions (MCQs)
- Score Calculation
- MySQL Database Integration
- Simple and Interactive Console Interface

---

## 🛠️ Technologies Used

- Java
- MySQL
- JDBC (Java Database Connectivity)

---

## 📂 Project Structure

Online-Quiz-Application/
│
├── src/
│ ├── Login.java
│ ├── QuizApp.java
│ └── DBConnection.java
│
├── quizdb.sql
└── README.md


---

## 🗄️ Database

- MySQL is used to store user data and quiz questions.
- Import `quizdb.sql` into your MySQL server before running the project.

---

## ▶️ How to Run

1. Install Java and MySQL
2. Import database (`quizdb.sql`)
3. Configure DB connection in `DBConnection.java`
4. Compile Java files:
   ```bash id="k3v8lm"
   javac *.java