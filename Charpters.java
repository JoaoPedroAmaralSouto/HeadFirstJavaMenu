package Use_a_cabeca_Java;

public abstract class Charpters {
    protected int i;
    protected int choiseExercices;
    protected String[] charpter;
    public void showMenu(){
        InputUtils.clearTerminal();
        i = 0;
        while(i < charpter.length){
            System.out.println(i + 1 + "-" + charpter[i]);
            i += 1;
        }
        System.out.println("Select a exercice above");
    }
    protected abstract void execute();
}