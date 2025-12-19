package Use_a_cabeca_Java;

public class EchoTestDrive{
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