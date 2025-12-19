package Use_a_cabeca_Java;

public class Echo{
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