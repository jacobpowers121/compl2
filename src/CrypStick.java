public class CrypStick {

    private String message;
    private Media media;
    private Encrypter encrypter;

    protected Media getMedia(){
        return media;
    }

    public String getMessage(){

    }

    public void setEncryptionStrategy(Encrypter encrypter){
        this.encrypter = encrypter;
    }

    public void setMessage(String message){
        media.setString(message);
    }
}