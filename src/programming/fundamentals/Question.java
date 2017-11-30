package programming.fundamentals;

import javax.swing.ImageIcon;

/**
 *
 * @author Daryl Lim
 */
public class Question {

    private String questions;
    private String[] choices = new String[4];
    private String answers;
    private ImageIcon images;

    public String questions() {
        return questions;
    }

    public Question(String question, String A, String B, String C, String D, String answer) {
        choices[0] = A;
        choices[1] = B;
        choices[2] = C;
        choices[3] = D;

        questions = question;
        answers = answer;
    }

    public Question(String question, String answer) {
        questions = question;
        answers = answer;
    }

    public Question(String question, ImageIcon image, String answer) {
        questions = question;
        images = image;
        answers = answer;
    }

    public String choices(int x) {
        return choices[x];
    }

    public String answers() {
        return answers;
    }

    public ImageIcon image() {
        return images;
    }
}
