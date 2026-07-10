import java.util.Random;
import java.util.Stack;

public class MagicBall {
    private String[] msgs;
    private String color;
    private int currentSide;

    // the constructors bellow are "overloaded"
    public MagicBall(String[] msgs, String color, int currentSide) {
        this.msgs = msgs;
        this.color = color;
        this.currentSide = currentSide;
    }

    public MagicBall(String[] msgs, String color) {
        // this is construcor chaining and calling the constructor above
        this(msgs, color, 0);
    }

    public MagicBall(String[] msgs) {
        // this is constructor chaining and calling the constructor above
        this(msgs, "Black", 0);
    }


    public String getColor() {
        return color;
    }

    public int getCurrentSide() {
        return currentSide;
    }

    public void shake() {
        Random random = new Random();
        currentSide = random.nextInt(msgs.length);
    }

    public String currentMessage() {
        return msgs[currentSide];
    }

    @Override
    public String toString() {
        return "A " + color + " magic 8-ball says '" + currentMessage() +"'";
    }
}
