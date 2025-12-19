package Use_a_cabeca_Java;

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
            while (choise <= 0 || choise > exercices.length) {
                choise = VerifyInt.verify(Br.getReader());
            }
            switch (choise) {
                case 1 -> Charpter1.showCharpter1();
                case 2 -> Charpter2.showCharpter2();
                case 3 -> Charpter3.showCharpter3();
                case 4 -> { }
                default -> System.out.println("Invalid choise.");
            }
            if(choise != exercices.length && choise != 0){
                System.out.println("Enter any key to go back to the menu");
                InputUtils.waitEnter();
            }
        }
    }
}
