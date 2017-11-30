package programming.fundamentals;

import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Daryl Lim
 */
public class Quiz {

    public Question[] quests = new Question[17];

    public Quiz() throws IOException {
        ImageIcon pic1 = new ImageIcon(new URL("https://67.media.tumblr.com/c0f2f54e9a7c8e7339c10efeceebab75/tumblr_n8po3bzNEq1ttvpxyo1_500.gif"));
        ImageIcon pic2 = new ImageIcon(new URL("https://upload.wikimedia.org/wikipedia/en/thumb/6/63/Feels_good_man.jpg/200px-Feels_good_man.jpg"));
        ImageIcon pic3 = new ImageIcon(new URL("http://i2.kym-cdn.com/photos/images/newsfeed/000/423/360/32d.gif"));
        ImageIcon pic4 = new ImageIcon(new URL("http://colorvisiontesting.com/images/plate%209%20%20%20%20%2057.jpg"));
        ImageIcon pic5 = new ImageIcon(new URL("https://67.media.tumblr.com/d19ed93583975322f942127d20f2a081/tumblr_o4ay7vnZDA1qa7ud5o1_500.gif"));
        ImageIcon pic6 = new ImageIcon(new URL("http://i.giphy.com/3o7TKQZRVZciCUwrKM.gif"));
        ImageIcon pic7 = new ImageIcon(new URL("http://i.giphy.com/3owyoUS5Du7VbCvYdy.gif"));

        quests[0] = new Question("What comes after 5 in the fibonacci squence?", "8", "13", "21", "34", "1");
        quests[1] = new Question("Which of the following is correct?", "F=mv", "F=ma", "E=mc", "E=1/2mv", "2");
        quests[2] = new Question("What is the first windows operating system?", "Windows 2.x", "Windows 98", "Windows 1.0x", "Windows 1", "3");
        quests[3] = new Question("Which is the worst module?", "ISEC", "PROGS", "DBMS", "GenEd", "4");
        quests[4] = new Question("If you are travelling at a speed of 20km/h and threw a triangle out of the window,\nhow many suns could fit into the sound of a trumpet assuming monkeys like bananas?\n",
                "Purple, because aliens wear hats.", "Music, because water is wet", "Clouds, because they are white", "A straw, because money has a face on it", "1");

        quests[5] = new Question("Who lives in a pineapple under the sea?", "Spongebob");
        quests[6] = new Question("What is the ultimate answer to Life,\nthe Universe and Everything?", "42");
        quests[7] = new Question("What is the maximum warp of Karla Five's\n vessel from Star Trek?", "Warp 36");
        quests[8] = new Question("When there's trouble you know who to call?", "Teen Titans");
        quests[9] = new Question("What is the latest Neptunia game on Steam as of 2016?", "Megadimension Neptunia vii");

        quests[10] = new Question("Which anime are these characters from?", pic1, "Toaru Kagaku no Railgun");
        quests[11] = new Question("Is Pepe feeling good?", pic2, "Yes");
        quests[12] = new Question("What anime are these characters from?", pic3, "Seitokai Yakuindomo");
        quests[13] = new Question("What number was shown?", pic4, "57");
        quests[14] = new Question("What is the character's name?", pic5, "Shinobu");
        
        quests[15] = new Question("You noob", pic6, "Get rekt m8");
        quests[16] = new Question("Not bad", pic7, "Thumbs up man!");

    }

    public Question choices1(int x) {
        return quests[x];
    }

}
