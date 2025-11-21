 .import java.util.Scanner;

public class GKQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Where was Maulana Bhashani's Kagmari Conference held?",
            "Which movement was Maulana Bhashani a leader of?",
            "Who was the first martyr of the July 36 Movement?",
            "What was the name of the Dhaka phase?",
            "Which is the largest district in Bangladesh?"
        };

        String[][] options = {
            {"1. Santosh, Tangail", "2. Bikrampur, Dhaka", "3. Belkochi, Sirajganj", "4. Kalurghat, Chittagong"},
            {"1. Peasant Movement", "2. Student Movement", "3. Workers' Movement", "4. Liberation War"},
            {"1. Mir Mugdha", "2. Mahedi Hasan", "3. Abu Sayed", "4. Pradip Kumar"},
            {"1. Bikrampur", "2. Sonargaon", "3. Lakkhipur", "4. Jahangirnagar"},
            {"1. Cox's Bazar", "2. Rangamati", "3. Chittagong", "4. Sylhet"}
        };

        int[] correct = {1, 1, 3, 4, 2};

        int score = 0;

        System.out.println("===== HIGH SCHOOL GENERAL KNOWLEDGE QUIZ =====\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Your answer (1-4): ");
            int ans = sc.nextInt();

            if (ans == correct[i]) {
                System.out.println("✔ Correct!\n");
                score++;
            } else {
                System.out.println("✘ Wrong!\n");
            }
        }

        System.out.println("===== QUIZ FINISHED =====");
        System.out.println("Your Score: " + score + " / " + questions.length);

        sc.close();
    }
}
