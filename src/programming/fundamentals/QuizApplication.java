package programming.fundamentals;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class QuizApplication {

    public static void main(String[] args) throws IOException {

        boolean repeatBack = true;

        while (repeatBack) {

            int loop = 0;
            int score = 0;
            
            ImageIcon begin = new ImageIcon(new URL("https://media.giphy.com/media/12Bxx1HUyx2eas/giphy.gif"));
            pic(begin);

            while (loop < 5) {//Loop sequence

                Quiz returnValue = new Quiz();//Calls values from Quiz

                String question1 = returnValue.choices1(loop).questions();//Calls question, choices and answers from Quiz class
                String answer1 = returnValue.choices1(loop).answers();
                String[] option = new String[4];

                int i = 0;//Calls the MCQ choices
                while (i < 4) {
                    option[i] = returnValue.choices1(loop).choices(i);
                    i++;
                }
                int newInputReturn1 = 1;
                do {//Runs loop at least once first
                    if (newInputReturn1 < 1 || newInputReturn1 > 4) {//Checks if input is valid
                        JOptionPane.showMessageDialog(//Tells user to input valid inputs
                                null,
                                "Please input options from 1 to 4 only!",
                                "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    String inputs1 = JOptionPane.showInputDialog(//Asks questions
                            null,
                            question1 + "\n1. " + option[0] + "\n2. " + option[1] + "\n3. " + option[2] + "\n4. " + option[3],//Calls question and choices from Question class
                            "Question " + (loop + 1),
                            JOptionPane.QUESTION_MESSAGE);

                    String input1 = validate(inputs1);//Ensure that input is valid from method validate
                    int newInput1 = Integer.parseInt(input1);

                    newInputReturn1 = newInput1;//newInputReturn used to check for valid inputs

                } while (newInputReturn1 < 1 || newInputReturn1 > 4);//Checks if input is valid

                int newAnswer1 = Integer.parseInt(answer1);//Parse String to int

                loop++;//Adds one to the loop sequence
                if (newInputReturn1 == newAnswer1) {//Checks if answer is correct
                    System.out.println("Question " + loop + "\tCorrect");
                    score++;
                } else {
                    System.out.println("Question " + loop + "\tWrong");

                    JOptionPane.showMessageDialog(//Shows correct answer
                            null,
                            "The correct answer is: " + answer1,
                            "You wrongs",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            while (loop < 10) {
                Quiz returnValue1 = new Quiz();
                String question1 = returnValue1.choices1(loop).questions();
                String answer1 = returnValue1.choices1(loop).answers();

                String inputs2 = JOptionPane.showInputDialog(
                        null,
                        question1,
                        "Question: " + (loop + 1),
                        JOptionPane.QUESTION_MESSAGE);
                loop++;
                if (searchanswer(inputs2, answer1)) {//Checks for answer in String input
                    score += 1;
                    System.out.println("Question " + loop + "\tCorrect");
                } else {
                    System.out.println("Question " + loop + "\tWrong");

                    JOptionPane.showMessageDialog(
                            null,
                            "The correct answer is: " + answer1,
                            "You wrongs",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

            while (loop < 15) {
                Quiz returnValue1 = new Quiz();
                String question1 = returnValue1.choices1(loop).questions();
                ImageIcon image1 = returnValue1.choices1(loop).image();
                String answer1 = returnValue1.choices1(loop).answers();

                JOptionPane.showMessageDialog(
                        null,
                        "Look at the picture/gif and click ok once you are done",
                        "Question: " + (loop + 1),
                        JOptionPane.INFORMATION_MESSAGE, image1);

                String inputs2 = JOptionPane.showInputDialog(
                        null,
                        question1,
                        "Question: " + (loop + 1),
                        JOptionPane.QUESTION_MESSAGE);

                loop++;

                if (searchanswer(inputs2, answer1)) {
                    score += 1;
                    System.out.println("Question " + loop + "\tCorrect");
                } else {
                    System.out.println("Question " + loop + "\tWrong");

                    JOptionPane.showMessageDialog(
                            null,
                            "The correct answer is: " + answer1,
                            "You wrongs",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            int score2 = score;//Stores score in new variable
            score /= 3;

            String comment;
            loop:
            while (true) {//Grades

                switch (score) {

                    case 0:
                        comment = "F for Find new family";
                        break loop;

                    case 1:
                        comment = "E for Eating your textbooks for dinner";
                        break loop;

                    case 2:
                        comment = "D for Don't come home tonight";
                        break loop;

                    case 3:
                        comment = "C for Can't have dinner";
                        break loop;

                    case 4:
                        comment = "B for Bad";
                        break loop;

                    case 5:
                        comment = "A for average";
                        break loop;
                }
            }

            if (score2 < 15) {
                loop = 15;
            } else {
                loop = 16;
            }

            Quiz returnValue1 = new Quiz();
            String question1 = returnValue1.choices1(loop).questions();
            ImageIcon image1 = returnValue1.choices1(loop).image();
            String answer1 = returnValue1.choices1(loop).answers();

            JOptionPane.showMessageDialog(//Show results
                    null,
                    "You got a score of " + score2 + " out of 15\n\n" + comment,
                    "Results",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Score = " + score2);

            if (loop == 16) {

                JOptionPane.showMessageDialog(
                        null,
                        question1,
                        answer1,
                        JOptionPane.INFORMATION_MESSAGE, image1);
            } else {

                callVid();

                JOptionPane.showMessageDialog(
                        null,
                        question1,
                        answer1,
                        JOptionPane.INFORMATION_MESSAGE, image1);
            }

            if (JOptionPane.showConfirmDialog(
                    null,
                    "You have come to the end of the quiz\nWould you like to try again?",
                    "Repeat?",
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                repeatBack = true;
            } else {
                repeatBack = false;
                System.out.println("Quiz ended");
            }
        }

    }

    public static void importImage(BufferedImage displayImage) throws MalformedURLException, IOException {//Display image
        ImageIcon image = new ImageIcon(displayImage);
        JOptionPane.showMessageDialog(
                null,
                "",
                "Hello",
                JOptionPane.INFORMATION_MESSAGE, image);
    }
    
    public static void pic(ImageIcon image){
        JOptionPane.showMessageDialog(
        null,
                "Let's begin!",
                "Begin!",
                JOptionPane.INFORMATION_MESSAGE, image);
    }

    public static String validate(String x) {//Ensure MCQ input is valid
        if (x.equals("1") || x.equals("2") || x.equals("3") || x.equals("4")) {
        } else {
            x = "0";
        }
        return x;
    }

    public static boolean searchanswer(String Line, String Ans) {//Checks for answer in String input
        boolean b = Line.matches("(?i).*" + Ans + ".*");
        return b;

    }

    public static void callVid() throws IOException {//Creates and runs .bat file
        int Q1 = (int) (Math.random() * 10000000);
        String vid = "src\\programming\\fundamentals\\REKT.mp4";
        System.out.println("Saved as " + Q1 + ".bat");
        try (PrintWriter out = new PrintWriter(Q1 + ".bat")) {
            out.println(vid);

        }
        Runtime.getRuntime().exec("cmd /c start " + Q1 + ".bat");

    }
}
