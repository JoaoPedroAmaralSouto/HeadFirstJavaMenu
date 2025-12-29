package Use_a_cabeca_Java;
import java.util.Random;
import java.util.ArrayList;

public class Board {
    protected ArrayList<Ships> ships = new ArrayList();
    protected final String [] Letters = {"A", "B", "C", "D", "E", "F", "G"};
    protected final String [] Numbers = {"0", "1", "2", "3", "4", "5", "6"};
    public void setShips(){
        Random rand = new Random();
        int limit = rand.nextInt(4) + 1;
        while(ships.size() < limit){
            Ships ship = new Ships();
            ship.setPosition();
            if(canPlaceShip(ship))
                ships.add(ship);
        }
    }

    public boolean canPlaceShip(Ship newShip) {
        for (Ship existing : ships) {
            if (collides(existing, newShip)) {
                return false;
            }
        }
        return true;
    }

    private boolean collides(Ship a, Ship b) {
        for (String posA : a.getPositions()) {
            for (String posB : b.getPositions()) {
                if (posA.equals(posB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void viewShips(){
        int flag;
        for(int i = Letters.length() - 1; i >= 0; i--){
            for(int j = 0; j < Numbers.length(); j++){
                flag = 0;
                if(j == 0){
                    System.out.println();
                }
                for(ArrayList<Ships> ship : ships){
                    if(ship.getPositions() == Letters[i] + Numbers[j]){
                        System.out.print("X");
                        flag = 1;
                    }
                }
                if(flag == 0){
                    System.out.print("*");
                }
            }
        }
    }
}