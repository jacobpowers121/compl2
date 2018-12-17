import java.util.Scanner;

public class Main {

    private static CrypStick cryp = new CrypStick();

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String type;
        String key;
        String message;

        System.out.print("E)ncrypt or D)ecrypt: ");
        type = console.next();
        System.out.println();
        System.out.print("Key: ");
        key = console.nextLine();
        System.out.println();
        System.out.print("Message: ");
        message = console.nextLine();
        System.out.println();
        cryp.setEncryptionStrategy(findEnc(type));
        cryp.setMessage(message);
    }

    private static Encrypter findEnc(String type){
        Encrypter encrypter = null;
        if(type.equalsIgnoreCase("rev")){
            encrypter = new ReverseEncrypter();
        }else if(type.equalsIgnoreCase("shift")){
            encrypter = new ShiftEncrypter();
        }else if(type.equalsIgnoreCase("xor")){
            encrypter = new XOREncrypter();
        }
        return encrypter;
    }
}
