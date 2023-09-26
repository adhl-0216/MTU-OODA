package Week2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ExerciseQuiz {
    private static class Question {
        private String text;
        private String answer;

        public Question(String text, String answer) {
            setText(text);
            setAnswer(answer);
        }

        public void display(){
            System.out.println(text);
        }

        public boolean checkAnswer(String answer){
            return (answer.replaceAll(" ","").equalsIgnoreCase(getAnswer()));
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
    }

    private static class MCQ extends Question {
        private ArrayList<String> choices;

        public MCQ(String text, String answer) {

            super(text, answer);
            choices = new ArrayList<>();
        }

        @Override
        public void display() {
            super.display();
            for (int i = 0; i < choices.size(); i++) {
                System.out.printf("%d. %s%n", i+1, choices.get(i));
            }
        }

        public void addChoice(String choice, boolean isAnswer){
            this.choices.add(choice);
//            if (isAnswer) setAnswer(String.valueOf(this.choices.indexOf(choice)+1));
            if (isAnswer) setAnswer(String.valueOf(this.choices.size()));
        }


        public ArrayList<String> getChoices() {
            return choices;
        }

        public void setChoices(ArrayList<String> choices) {
            this.choices = choices;
        }
    }

    private static class Quiz {
        private ArrayList<Question> questions;
        private int score = 0;

        public Quiz() {
        }

        public void startQuiz() {
            Scanner scanner = new Scanner(System.in);
            for (Question q :
                    questions) {
                q.display();
                String input = scanner.nextLine();
                if (q.checkAnswer(input)){
                    System.out.println("Correct!");
                    score++;
                }else {
                    System.out.println("Incorrect!");
                }
            }

            System.out.printf("Score: %s\n", score);
        }

        public ArrayList<Question> getQuestions() {
            return questions;
        }

        public void setQuestions(ArrayList<Question> questions) {
            this.questions = questions;
        }
    }



    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        ArrayList<Question> questions = new ArrayList<>();
//        questions.add(new Question("Capital of Ireland? ", "Dublin"));
//        questions.add(new Question("Capital of Malaysia? ", "Kuala Lumpur"));
//        questions.add(new Question("Capital of Canada? ", "Toronto"));
//        questions.add(new Question("Capital of USA? ", "Washington D.C."));
//        questions.add(new Question("Capital of UK? ", "London"));

        MCQ mcq1 = new MCQ("Capital of Ireland? ", null);
        mcq1.addChoice("Cork", false);
        mcq1.addChoice("Tralee", false);
        mcq1.addChoice("Dublin", true);
        mcq1.addChoice("Galway", false);
        questions.add(mcq1);

        MCQ mcq2= new MCQ("Capital of Malaysia? ", null);
        mcq2.addChoice("Selangor", false);
        mcq2.addChoice("Kuala Lumpur", true);
        mcq2.addChoice("Sabah", false);
        mcq2.addChoice("Sarawak", false);
        questions.add(mcq2);
        quiz.setQuestions(questions);


        quiz.startQuiz();


    }
}
