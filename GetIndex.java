package Use_a_cabeca_Java;

public class GetIndex {
    public int index(String position, String [] library){
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
    }
    return -1;
}