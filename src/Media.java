public class Media {

    private byte[] bytes;

    public byte[] get(){

    }

    public void set(byte[] setMedia){

    }

    public void setString(String setString){

    }

    public String toString(){
        String output = "";
        for(byte letter : bytes){
            output += letter + " ";
        }
        return output;
    }
}
