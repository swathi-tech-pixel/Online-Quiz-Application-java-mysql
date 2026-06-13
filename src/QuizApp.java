import java.sql.*;
import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        Login login = new Login();

        if (!login.login()) {
            System.out.println("Exit...");
            return;
        }

        int score = 0;
        int correct = 0;
        int wrong = 0;

        String[] questionList = new String[10];
        String[] userAnswers = new String[10];
        String[] correctAnswers = new String[10];
        String[] resultList = new String[10];

        int i = 0;

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM questions");

            Scanner sc = new Scanner(System.in);

            while (rs.next()) {

                System.out.println("\nQ: " + rs.getString("question"));
                System.out.println("1. " + rs.getString("option1"));
                System.out.println("2. " + rs.getString("option2"));
                System.out.println("3. " + rs.getString("option3"));
                System.out.println("4. " + rs.getString("option4"));

                System.out.print("Your answer (1-4): ");
                int ans = sc.nextInt();

                int correctOption = rs.getInt("answer");

                String userAnswerText = "";
                String correctAnswerText = "";

                switch (ans) {
                    case 1:
                        userAnswerText = rs.getString("option1");
                        break;
                    case 2:
                        userAnswerText = rs.getString("option2");
                        break;
                    case 3:
                        userAnswerText = rs.getString("option3");
                        break;
                    case 4:
                        userAnswerText = rs.getString("option4");
                        break;
                    default:
                        userAnswerText = "Invalid Option";
                }

                switch (correctOption) {
                    case 1:
                        correctAnswerText = rs.getString("option1");
                        break;
                    case 2:
                        correctAnswerText = rs.getString("option2");
                        break;
                    case 3:
                        correctAnswerText = rs.getString("option3");
                        break;
                    case 4:
                        correctAnswerText = rs.getString("option4");
                        break;
                }

                questionList[i] = rs.getString("question");
                userAnswers[i] = userAnswerText;
                correctAnswers[i] = correctAnswerText;

                if (ans == correctOption) {
                    score++;
                    correct++;
                    resultList[i] = "Correct";
                } else {
                    score--;
                    wrong++;
                    resultList[i] = "Wrong";
                }

                i++;
            }

            System.out.println("\n========== QUIZ RESULT ==========");

            for (int j = 0; j < i; j++) {
                System.out.println("\nQ" + (j + 1) + ": " + questionList[j]);
                System.out.println("Your Answer    : " + userAnswers[j]);
                System.out.println("Correct Answer : " + correctAnswers[j]);
                System.out.println("Result         : " + resultList[j]);
            }

            System.out.println("\n=================================");
            System.out.println("Correct Answers : " + correct);
            System.out.println("Wrong Answers   : " + wrong);
            System.out.println("Final Score     : " + score);
            System.out.println("=================================");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}








