package PacMan.src.PACMAN;

/*
OOP Aspects
1. Casting/Conversion -> if(score>Integer.parseInt((highScore.split(":")[1]))){
2. Constructor -> all class
3. Overloading -> Game Description and Game Difficulty
4. Overriding -> control keys
5. Encapsulation -> get n set (emilia id)
6. Inheritance -> in abstract class (Instruction)
7. Polymorphism -> Polymorph
8. ArrayList -> id for Kayla
9. Exception Handling -> Try n Catch (getHighScoreValue & checkScore)
10. GUI -> game
11. Interface -> Highscore
12. Abstract Class -> Instruction
13. Generics -> ID and Passwords
14. Collection -> Hashmap
15. Input Output -> New Highscore
 */

public class Main {

    public static void main(String[] args) {

        IDandPasswords iDandPasswords = new IDandPasswords();
        LoginPage loginPage = new LoginPage(iDandPasswords.getLoginInfo());

        Polymorph mypolymorph = new Polymorph();
        Polymorph mydescription = new GameDescription();
        Polymorph mygamedescription = new GameDifficulty();
        tes myTes = new tes();

        System.out.println("---------------");
        myTes.intruction();
        System.out.println("---------------");
        mypolymorph.GameDescriptionAndDifficulty();
        mydescription.GameDescriptionAndDifficulty();
        mygamedescription.GameDescriptionAndDifficulty();
        System.out.println("---------------");
        Highscore.highscore myHighscore = new Highscore.highscore();
        myHighscore.test();
    }
}
