public class ShiftEncrypter implements Encrypter {

    private int amount = 1;

    @Override
    public byte[] decrypt(byte[] msg) {
        byte[] decrypted = new byte[msg.length];

        for(int i = 0; i < msg.length; i++){
            decrypted[i] = (byte)(msg[i] - amount);
            if(decrypted[i] < 0){
                decrypted[i] = (byte)255;
            }
        }

        return decrypted;
    }

    @Override
    public byte[] encrypt(byte[] msg) {

        byte[] encrypted = new byte[msg.length];

        for(int i = 0; i < msg.length; i++){
            encrypted[i] = (byte)(msg[i] + amount);
            if(encrypted[i] > 255){
                encrypted[i] = (byte)0;
            }
        }

        return encrypted;
    }
}
