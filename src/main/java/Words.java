import java.util.Random;

public class Words {
    Random random = new Random();
    public String [] words = {"ELEPHANT", "PIGEON", "TIGER", "BEAR"};
    int index = random.nextInt(words.length);

    public String getWord(){
        return words[index];

    }



}
