package Use_a_cabeca_Java;

public class Main{
    public static void main (String[] args){
        int choise = 0;
        String[] exercices= {"Charpter 1", "Charpter 2", "Charpter 3", "Charpter 4", "Charpter 5", "Exit"};
        int i;
        Charpters c1 = new Charpter1();
        Charpters c2 = new Charpter2();
        Charpters c3 = new Charpter3();
        Charpters c4 = new Charpter4();
        Charpters c5 = new Charpter5();
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
            while (choise <= 0 || choise > exercices.length) {
                choise = VerifyInt.verify(Br.getReader());
            }
            switch (choise) {
                case 1 -> {
                    c1.showMenu();
                    c1.execute();
                }
                case 2 -> {
                    c2.showMenu();
                    c2.execute();
                }
                case 3 -> {
                    c3.showMenu();
                    c3.execute();
                }
                case 4 -> {
                    c4.showMenu();
                    c4.execute();
                }
                case 5 -> {
                    c5.showMenu();
                    c5.execute();
                 }
                default -> System.out.println("Invalid choise.");
            }
            if(choise != exercices.length && choise != 0){
                System.out.println("Enter any key to go back to the menu");
                InputUtils.waitEnter();
            }
        }
    }
}
