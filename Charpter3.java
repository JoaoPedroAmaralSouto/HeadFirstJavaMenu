package Use_a_cabeca_Java;

public class Charpter3 extends Charpters{
    public Charpter3(){
        charpter = new String[] {"TestArrays", "Triangle"};
        i = 0;
        choiseExercices = 0;
    }

    @Override
    protected void execute(){
        while(choiseExercices <= 0 || choiseExercices > charpter.length){
            choiseExercices = VerifyInt.verify(Br.getReader());
        }
        switch (choiseExercices){
            case 1 -> TestArrays.test();
            case 2 -> Triangle.showTriangles();
            default -> System.out.println("Invalid choice");
        }
    }
}