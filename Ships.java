package Use_a_cabeca_Java;
import java.util.ArrayList;
import java.util.Random;

public class Ships{
    private final ArrayList<String> Position = new ArrayList<>();
    private final Random rand = new Random();
    private int index = 0;
    private final String [] Letters = {"A", "B", "C", "D", "E", "F", "G"};
    private final String [] Numbers = {"0", "1", "2", "3", "4", "5", "6"};
    private final int rows = Letters.length;
    private final int columns = Numbers.length;
    private int ID;

    protected void setPositionOfShips(){
        int i;
        int indexNext = 0;
        int indexNextNumber = 0;
        boolean direction = false;
        i = 0;
        while(i < 3){
            if(i == 0){
                Position.add(getFirstPosition());
            }
            else{
                String temporaryPosition;
                int verify;
                if(i == 1){
                    direction = rand.nextBoolean();
                    Position.add(setSecondPosition(direction));
                }
                else{
                    if(direction){
                        verify = verifyDirection(direction);
                        if(verify == 1){
                            indexNext = getIndex(Position.getLast(), Letters);
                            indexNextNumber = 1 + getIndex(Position.getLast(), Numbers);
                        }
                        else if(verify == 0){
                            indexNext = getIndex(Position.getLast(), Letters);
                            indexNextNumber = getIndex(Position.getLast(), Numbers) - 1;
                        }
                    }
                    else{
                        verify = verifyDirection(direction);
                        if(verify == 1){
                            index = getIndex(Position.getLast(), Letters);
                            indexNextNumber = getIndex(Position.getLast(), Numbers);
                            indexNext = 1 + getIndex(Position.getLast(), Letters);
                        }
                        else if(verify == 0){
                            index = getIndex(Position.getLast(), Letters);
                            indexNextNumber = getIndex(Position.getLast(), Numbers);
                            indexNext = getIndex(Position.getLast(), Letters) - 1;
                        }
                    }
                    temporaryPosition= Letters[indexNext];
                    temporaryPosition  += Numbers[indexNextNumber];
                    Position.add(temporaryPosition);
                }
            }
            i++;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int verifyDirection(boolean direction){
        int row0, column0, row1, column1;
        row0 = getIndex(Position.getFirst(), Letters);
        column0 = getIndex(Position.getFirst(), Numbers);
        row1 = getIndex(Position.get(1), Letters);
        column1 = getIndex(Position.get(1), Numbers);
        if(direction){
            if(row0 == row1 && column0 < column1){
                return 1;
            }
            else if(row0 == row1 && column0 > column1){
                return 0;
            }
        }
        else{
            if(row0 < row1 && column0 == column1){
                return 1;
            }
            else if(row0 > row1 && column0 == column1){
                return 0;
            }
        }
        return -1;
    }

    private String setSecondPosition(Boolean direction){
        int indexNext = 0;
        int indexNextNumber = 0;
        int row, column;
        boolean flag = false;
        while(!flag){
            if(direction){
                indexNext = getIndex(Position.getLast(), Letters);
                indexNextNumber = setColumn(columns, indexNext);
                column = getIndex(Position.getLast(), Numbers);
                if(column == 0 || column == 1){
                    if(indexNextNumber == column + 1){
                        flag = true;
                    }
                }
                else if(column == columns -1  || column == columns - 2){
                    if(indexNextNumber == column -1){
                        flag = true;
                    }
                }
                else if(indexNextNumber == column + 1 || indexNextNumber == column - 1){
                    flag = true;
                }
            }
            else{
                index = getIndex(Position.getLast(), Letters);
                indexNextNumber = getIndex(Position.getLast(), Numbers);
                indexNext = setRow(rows);
                row = getIndex(Position.getLast(), Letters);
                if(row == 0 || row == 1){
                    if(indexNext == row + 1){
                        flag = true;
                    }
                }
                else if(row == rows -1 || row == rows -2){
                    if(indexNext == row - 1){
                        flag = true;
                    }
                }
                else if(indexNext == row + 1 || indexNext == row - 1){
                    flag = true;
                }
            }

        }
        return buildPosition(Letters[indexNext], Numbers[indexNextNumber]);
    }

    protected ArrayList<String> getPositions(){
        return Position;
    }

    private String getFirstPosition() {
        int index2 = randomIndex(rows, rand);
        int indexNumber2 = setColumn(columns, index2);

        return buildPosition(Letters[index2], Numbers[indexNumber2]);
    }

    private String buildPosition(String letter, String number){
        return letter + number;
    }

    private int randomIndex(int limit, Random rand) {
        return rand.nextInt(limit);
    }

    private int setColumn(int limit, int index2) {
        int aux;
        if (index2 == limit - 1) {
            aux = rand.nextInt(limit - 3, index2);
        }
        else if (index2 == 0) {
            aux = rand.nextInt(index2 + 3);
        }
        else {
            aux = rand.nextInt(index2 - 1, index2 + 2);
        }
        return aux;
    }

    private int setRow(int limit){
        int aux;
        if (index == limit - 1) {
            aux = rand.nextInt(limit - 3, index);
        }
        else if (index == 0) {
            aux = rand.nextInt(index + 3);
        }
        else {
            aux = rand.nextInt(index - 1, index + 2);
        }
        return aux;
    }
    private int getIndex(String position, String [] library){
        int j = 0;
        if(library[0].equals("A")){
            while(j < library.length){
                if(library[j].equals(position.substring(0,1))){
                    return j;
                }
                j++;
            }
        }
        else{
            while(j < library.length){
                if(library[j].equals(position.substring(1,2))){
                    return j;
                }
                j++;
            }
        }
        return -1;
    }

    public void removePosition(String position){
        Position.removeIf(pos -> pos.equals(position));
    }
}