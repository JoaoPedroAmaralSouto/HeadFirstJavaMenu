package Use_a_cabeca_Java;
import java.util.Random;
import java.util.ArrayList;

public class Board {
    protected ArrayList<Ships> ships = new ArrayList<>();
    protected final String [] Letters = {"A", "B", "C", "D", "E", "F", "G"};
    protected final String [] Numbers = {"0", "1", "2", "3", "4", "5", "6"};
    public void setShips(){
        Random rand = new Random();
        //int limit = rand.nextInt(4) + 1;
        int limit = 4;
        while(ships.size() < limit){
            Ships ship = new Ships();
            ship.setPositionOfShips();
            if(canPlaceShip(ship))
                ships.add(ship);
        }
    }

    private boolean canPlaceShip(Ships newShip) {
        for (Ships existing : ships) {
            if (collides(existing, newShip)) {
                return false;
            }
        }
        return true;
    }

    private boolean collides(Ships a, Ships b) {
        for (String posA : a.getPositions()) {
            for (String posB : b.getPositions()) {
                if (posA.equals(posB)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected void viewShips(){
        int cont = 0;
        for(int i = Letters.length - 1; i >= 0; i--){
            for(int j = 0; j < Numbers.length; j++){
                if(j == 0){
                    System.out.println();
                }
                System.out.print("*");
            }
        }
        System.out.println();
    }
}