package PacMan.src.PACMAN;

abstract class Instruction {
    public abstract void intruction();
}

class tes extends Instruction{

    @Override
    public void intruction() {
        System.out.println("Instruction: \nYou must first sign in using your username and password. Following a successful login,");
        System.out.println("you will be taken to the menu screen where you should select START GAME. When the PACMAN title screen appears,");
        System.out.println("press SPACE to start the game.Use the arrow keys to guide Pac-Man through the maze while playing the game.");
        System.out.println("While playing, you can also press ESCAPE to return to the title screen and restart the game. When you reach the Game");
        System.out.println("Over screen, press SPACE to restart the game and return to the title screen.");
    }
}


