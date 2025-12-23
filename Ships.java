package Use_a_cabeca_Java;
import java.util.Random;

public class Ships{
    protected String[] Position;
    protected void setPosition(){
        Random rand = new Random();
        Position = new String[3];
        GetIndex getIndex = new GetIndex();
        int index = 0;
        int indexNext = 0;
        int indexNextNumber = 0;
        String [] Letters = {"A", "B", "C", "D", "E", "F", "G"};
        String [] Numbers = {"0", "1", "2", "3", "4", "5", "6"};
        int i = 0;
        int flag = 0;
        int j = 0;
        ValidateShips validation = new ValidateShips();
        while(i < 3){
            if(i == 0){
                Position[i] = validation.getFirtPosition(Position, i, index, Letters, Numbers, rand);
            }
            else{
                index = getIndex.index(Position[i], Letters);
                indexNext = validation.getPositionY(index, Letters.length, rand);
                indexNextNumber = validation.getPositionX(indexNext, Numbers.length, rand);
                j = 0;
                while(j < i){
                    flag = 1;
                    if(Letters[indexNext].equals(Position[j].substring(0,1)) && Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                        while(flag == 1){
                            indexNextNumber = validation.getPositionX(indexNext, Numbers.length, rand);
                            if(!Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                flag = 0;
                        }
                        else if(!Letters[indexNext].equals(Position[j].substring(0,1)) && !Numbers[indexNextNumber].equals(Position[j].substring(1,2))){
                            while(flag == 1){
                                indexNextNumber = validation.getPositionX(indexNext, Numbers.length, rand);
                                if(Numbers[indexNextNumber].equals(Position[j].substring(1,2)))
                                    flag = 0;
                            }
                        }
                    }
                    j++;
                }
                Position[i] = Letters[indexNext];
                Position[i] += Numbers[indexNextNumber];
            }
            i++;
        }
    }
}