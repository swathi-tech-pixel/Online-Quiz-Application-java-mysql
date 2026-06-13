CREATE DATABASE quizdb3;
USE quizdb3;

-- Users table
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50)
);

-- Questions table
CREATE TABLE questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT,
    option1 VARCHAR(100),
    option2 VARCHAR(100),
    option3 VARCHAR(100),
    option4 VARCHAR(100),
    answer INT
);

-- Sample user for login
INSERT INTO users (username, password)
VALUES ('admin', 'admin123');

-- Sample quiz questions
INSERT INTO questions (question, option1, option2, option3, option4, answer)
VALUES
('Capital of India?', 'Mumbai', 'Delhi', 'Chennai', 'Kolkata', 2),

('2 + 2 = ?', '3', '4', '5', '6', 2),

('Which language is used for Java programs?', 'Python', 'C', 'Java', 'HTML', 3),

('Who developed Java?', 'Microsoft', 'Sun Microsystems', 'Google', 'Apple', 2),

('What is the national animal of India?', 'Lion', 'Elephant', 'Tiger', 'Leopard', 3);