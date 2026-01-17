package Use_a_cabeca_Java;
import java.util.Random;
import java.util.ArrayList;

public class Board {
    private ArrayList<Ships> ships = new ArrayList<>();
    private final String [] Letters = {"A", "B", "C", "D", "E", "F", "G"};
    private final String [] Numbers = {"0", "1", "2", "3", "4", "5", "6"};
    private ArrayList<String> attempts = new ArrayList<>();
    private int contChoises = 0;

    public void setContChoises() {
        this.contChoises++;
    }

    public int getContChoises() {
        return contChoises;
    }

    public void setShips(){
        Random rand = new Random();
        int limit = rand.nextInt(4) + 1;
        while(ships.size() < limit){
            Ships ship = new Ships();
            ship.setPositionOfShips();
            if(canPlaceShip(ship)) {
                ship.setID(ships.size());
                ships.add(ship);
            }
        }
    }
    public ArrayList<Ships> getShips(){
        return ships;
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

    private boolean verifyHitedShip(String hit) {
        for (String existing : attempts) {
            if (existing.equals(hit)) {
                return true;
            }
        }
        return false;
    }

    private void removeShip(Ships ship){
        ships.remove(ship);
    }

    protected boolean verifyHit(String hit){
        for (Ships ship : ships) {
            for(String posA : ship.getPositions()){
                if(hit.equals(posA)){
                    ship.removePosition(posA);
                    if(ship.getPositions().isEmpty()){
                        removeShip(ship);
                    }
                    if(!hit.equals("cheat") && !hit.equals("exit")){
                        setContChoises();
                    }
                    return true;
                }
            }
        }
        if(!hit.equals("cheat") && !hit.equals("exit")){
            setContChoises();
        }
        attempts.add(hit);
        return false;
    }

    protected void viewShips(){
        String position;
        boolean hit;
        for(int i = Letters.length - 1; i >= 0; i--){
            System.out.print(Letters[i]);
            for(int j = 0; j < Numbers.length; j++){
                position = Letters[i] + Numbers[j];
                hit = false;
                for(String attempt : attempts){
                    if(position.equals(attempt)){
                        System.out.print("X");
                        hit = true;
                        break;
                    }
                }
                if(!hit){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.print(" ");
        for (String number : Numbers) {
            System.out.print(number);
        }
        System.out.println();
        System.out.println("set exit to end game");
    }

    protected void cheatedViewShips(){
        String position;
        boolean hit;
        for(int i = Letters.length - 1; i >= 0; i--){
            System.out.print(Letters[i]);
            for(int j = 0; j < Numbers.length; j++){
                position = Letters[i] + Numbers[j];
                hit = false;
                for(String attempt : attempts){
                    if(position.equals(attempt)){
                        System.out.print("X");
                        hit = true;
                        break;
                    }
                }
                for(Ships ship : ships){
                    for(String posA : ship.getPositions()){
                        if(position.equals(posA) && !hit){
                            System.out.print(ship.getID());
                            hit = true;
                            break;
                        }
                    }
                }
                if(!hit){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.print(" ");
        for (String number : Numbers) {
            System.out.print(number);
        }
        System.out.println();
        System.out.println("set exit to end game");
    }
}