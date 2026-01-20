package Use_a_cabeca_Java;

public abstract class Charpters {
    protected int choiseExercices;
    protected String[] charpter;
    public void showMenu(){
        InputUtils.clearTerminal();
        for(int i = 0; i < charpter.length; i++){
            System.out.println(i + 1 + "-" + charpter[i]);
        }
        System.out.println("Select a exercice above");
    }
    protected abstract void execute();
}