public class useBall {
    public static void main(String[] args) {
        String[] ballMsgs = {"Yes", "No", "Sort of", "Maybe", "Definitely No", "Definitely Yes"};
        MagicBall ball1 = new MagicBall(ballMsgs, "Red", 0);
        MagicBall ball2 = new MagicBall(ballMsgs, "Blue");
        MagicBall ball3 = new MagicBall(ballMsgs);


        for (int i = 0; i <= 5 ; i++) {
            ball3.shake();
            System.out.println(ball3);
            // System.out.println(ball.getCurrentSide());

        }
        RgbColor transparentRed = new RgbColor(255, 0, 0, 0.5);
        RgbColor gray = new RgbColor(122, 122, 122);

        System.out.println(transparentRed);
        System.out.println(gray);
    }
}
