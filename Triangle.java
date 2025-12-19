package Use_a_cabeca_Java;

public class Triangle{
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