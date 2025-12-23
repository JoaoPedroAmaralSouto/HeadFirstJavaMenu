package Use_a_cabeca_Java;
import java.util.Random;
import java.util.ArrayList;

public class Board {
    protected ArrayList<Ships> ships = new ArrayList();
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

    }
}