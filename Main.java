import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class Main{
    public static void main (String[] args){
        int choise = 0;
        int choiseExercices = 0;
        String[] exercices= {"Charpter 1", "Charpter 2", "Charpter 3", "Exit"};
        int i;
        while(choise != exercices.length) {
            InputUtils.clearTerminal();
            System.out.println("Head first exercices");
            i = 0;
            while (i < exercices.length) {
                System.out.println(i + 1 + "-" + exercices[i]);
                i += 1;
            }
            System.out.println("Select a number to stop or continue the loop");
            choise = 0;
            while (choise == 0) {
                choise = VerifyInt.verify(Br.getReader());
            }
            if(choise == 1){
                InputUtils.clearTerminal();
                String[] charpter1 = {"DooBee", "Phrase-o-matic", "Shuffle1"};
                System.out.println("Charpter 1");
                i = 0;
                while(i < charpter1.length){
                    System.out.println(i + 1 + "-" + charpter1[i]);
                    i += 1;
                }
                System.out.println("Select a exercice above");
                choiseExercices = 0;
                while(choiseExercices == 0){
                    choiseExercices = VerifyInt.verify(Br.getReader());
                }
                if(choiseExercices == 1){
                    DooBee.dooBee();
                }
                else if(choiseExercices == 2){
                    PhraseOMatic.createPhrase();
                }
                else if(choiseExercices == 3){
                    Shuffle1.createPhrase();
                }
            }
            else if(choise == 2){
                InputUtils.clearTerminal();
                String[] charpter2 = {"GuessGame", "DrumKitTestDrive", "EchoTestDrive"};
                System.out.println("Charpter 2");
                i = 0;
                while(i < charpter2.length){
                    System.out.println(i + 1 + "-" + charpter2[i]);
                    i += 1;
                }
                System.out.println("Select a exercice above");
                choiseExercices = 0;
                while(choiseExercices == 0){
                    choiseExercices = VerifyInt.verify(Br.getReader());
                }
                if(choiseExercices == 1){
                    GameLauncher.start();
                }
                else if(choiseExercices == 2){
                    DrumKitTestDrive.playDrums();
                }
                else if(choiseExercices == 3){
                    EchoTestDrive.playEchoTestDrive();
                }
            }
            else if(choise == 3){
                InputUtils.clearTerminal();
                String[] charpter3 = {"TestArrays", "Triangle"};
                System.out.println("Charpter 3");
                i = 0;
                while(i < charpter3.length){
                    System.out.println(i + 1 + "-" + charpter3[i]);
                    i += 1;
                }
                System.out.println("Select a exercice above");
                choiseExercices = 0;
                while(choiseExercices == 0){
                    choiseExercices = VerifyInt.verify(Br.getReader());
                }
                if(choiseExercices == 1){
                    InputUtils.clearTerminal();
                    System.out.println(charpter3[0]);
                    TestArrays.test();
                }
                if(choiseExercices == 2){
                    InputUtils.clearTerminal();
                    System.out.println(charpter3[1]);
                    Triangle.showTriangles();
                }
            }
            /*else if(choise == 4){
                InputUtils.clearTerminal();
                System.out.println(exercices[choise - 1]);
                String[] charpter4 = {};
                i = 0;
            }*/
            if(choise != exercices.length && choise != 0){
                System.out.println("Enter any key to go back to the menu");
                InputUtils.waitEnter();
            }
        }
    }
}

class Triangle{
    private double area = 0;
    private int height = 0;
    private int length = 0;
    public static void showTriangles(){
        Triangle[] ta = new Triangle[4];
        int x = 0;
        while(x < 4){
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("Triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x += 1;
        }
    }
    private void setArea(){
        area = (height * length) / 2.0;
    }
}

class TestArrays{
    public static void test(){
        int y = 0;
        String[] islands = new String[4];
        int[] index = new int[4];
        int ref;
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        while(y < 4){
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y += 1;
        }
    }
}

class EchoTestDrive{
    public static void playEchoTestDrive(){
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while(x < 4){
            e1.hello();
            e1.setCount(1);
            if(x == 3){
                e2.setCount(1);
            }
            if(x > 0){
                e2.setCount(e1.getCount());
            }
            x += 1;
        }
        System.out.println(e2.getCount());
    }
}

class Echo{
    private int count = 0;
    public void hello(){
        System.out.println("Helloooo...");
    }
    public void setCount(int x){
        if(x > 0){
            count += x;
        }
    }
    public int getCount(){
        return count;
    }
}

class DrumKitTestDrive{
    public static void playDrums(){
        InputUtils.clearTerminal();
        DrumKit d = new DrumKit();
        d.playShare();
        d.setShare(false);;
        if(d.getShare() == true){
            d.playShare();
        }
        d.playTopHat();
    }
}

class DrumKit{
    private boolean topHat = true;
    private boolean share = true;
    public void playShare(){
        System.out.println("bang bang ba-bang");
    }
    public void playTopHat(){
        System.out.println("ding ding da-ding");
    }
    public void setTopHat(boolean b){
        topHat = b;
    }
    public boolean getTopHat(){
        return topHat;
    }
    public void setShare(boolean b){
        share = b;
    }
    public boolean getShare(){
        return share;
    }
}


class InputUtils{
    public static void waitEnter(){
        try{
            Br.getReader().readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    protected static void clearTerminal(){
        ClearTerminal.clear();
    }
}
class Br{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedReader getReader(){
        return br;
    }
}

class GameLauncher{
    private static GuessGame game = new GuessGame();
    public static void start(){
        game.startGame();
    }
}

class GuessGame{
    public void startGame(){
        int secret = (int) (Math.random() * 10);
        int tryAgain = 1;
        int choice = 0;
        Player p1 = new Player();
        InputUtils.clearTerminal();
        System.out.println("Guess a number between 0 and 9");
        while(tryAgain == 1){
            choice = p1.chosenNumber();
            if (choice < 0 || choice > 9) {;
                System.out.println("Invalid guess, try again");
                tryAgain = 1;
            }
            else if(choice == secret){
                System.out.println("Correct guess, congratulations!");
                tryAgain = 0;
                p1.setAttempts(1);
                System.out.println("Number of attemps: " + p1.getAttempts());
            }
            else if(choice != secret){
                System.out.println("Wrong guess, try again");
                p1.setAttempts(1);
                tryAgain = 1;
            }
        }
    }
}

class Player{
    private static int attempts = 0;
    private static int lastNumberChosen = 0;
    public static int chosenNumber(){
        lastNumberChosen = VerifyInt.verify(Br.getReader());
        return lastNumberChosen;
    }
    public void setAttempts(int x){
        if(x > 0){
            attempts += x;
        }
    }
    public int getAttempts() {
        return attempts;
    }
}

class PoolPuzzleOne{
    public static void createPhrase(){
        int x = 0;
        InputUtils.clearTerminal();
        while(x < 4){
            System.out.print("a");
            if(x < 1){
                System.out.print(" ");
            }
            System.out.print("n");
            if(x > 1){
                System.out.print(" oyster");
                x += 2;
            }
            if(x == 1){
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println();
            x += 1;
        }
    }
}
class Shuffle1{
    public static void createPhrase(){
        int x = 3;
        InputUtils.clearTerminal();
        while (x > 0){
            if(x > 2){
                System.out.print("a");
            }
            x -= 1;
            System.out.print("-");
            if(x == 2){
                System.out.print("b c");
            }
            if(x == 1){
                System.out.println("d");
                x -= 1;
            }
        }
    }
}
class PhraseOMatic{
    public static void createPhrase(){
        InputUtils.clearTerminal();
        String[] wordListOne = {
            "agnostic", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "Strongly typed"
        };
        String[] wordListTwo = {
            "loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "native", "service oriented", "containerized", "serverless", "microwaves", "distributed ledger"
        };
        String[] wordListThree = {
            "framework", "library", "DSL", "REST API", "repository", "pipeline", "serice mesh", "architecture", "perspective", "design", "orientetation"
        };
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        java.util.Random randowGenerator = new java.util.Random();
        int rand1 = randowGenerator.nextInt(oneLength);
        int rand2 = randowGenerator.nextInt(twoLength);
        int rand3 = randowGenerator.nextInt(threeLength);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}
class DooBee{
    public static void dooBee(){
        int x = 0;
        InputUtils.clearTerminal();
        while(x < 2){
            System.out.print("Doo");
            System.out.print("Bee");
            x += 1;
        }
        if(x == 2){
            System.out.println("Do");
        }
    }
}
class VerifyInt{
    public static int verify(BufferedReader br){
        try {
            return Integer.parseInt(br.readLine());
        }
        catch (Exception e){
            System.out.println("You have entered an invalid input, please, try enter a number");
            return 0;
        }
    }
}

class ClearTerminal{
    public static void clear(){
        try {
            String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder pb;
            if(os.contains("win")){
                pb = new ProcessBuilder("cmd", "/c", "cls");
            }
            else{
                pb = new ProcessBuilder("clear");
            }
            pb.inheritIO().start().waitFor();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}