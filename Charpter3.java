package Use_a_cabeca_Java;

public class Charpter3 extends Charpters{
    public static void showCharpter3(){
        InputUtils.clearTerminal();
        charpter = new String[] {"TestArrays", "Triangle"};
        System.out.println("Charpter 3");
        i = 0;
        while(i < charpter.length){
            System.out.println(i + 1 + "-" + charpter[i]);
            i += 1;
        }
        System.out.println("Select a exercice above");
        choiseExercices = 0;
        while(choiseExercices == 0){
            choiseExercices = VerifyInt.verify(Br.getReader());
        }
        switch (choiseExercices){
            case 1 -> TestArrays.test();
            case 2 -> Triangle.showTriangles();
            default -> System.out.println("Invalid choice");
        }
    }
}