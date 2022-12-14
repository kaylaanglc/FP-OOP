package PacMan.src.PACMAN;

public interface Highscore {
    public void test();

    class highscore implements Highscore {


        public void test() {
            System.out.println("How to get Highscore: \n");
            System.out.println("Get as many points as possible. If you have achieved a new high score while playing,");
            System.out.println("you will be asked to enter your name at the Game Over screen in order for your score to be saved as a new highscore.\n");
            System.out.println("Highscores:");
        }



    }
}
