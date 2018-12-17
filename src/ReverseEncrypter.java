public class ReverseEncrypter implements Encrypter {
    @Override
    public byte[] decrypt(byte[] msg) {
        return encrypt(msg);
    }

    @Override
    public byte[] encrypt(byte[] msg) {
        byte[] encrypted = new byte[msg.length];
        for(int i = 1; i <= msg.length; i++){
            encrypted[i - 1] = msg[msg.length - i];
        }
        return encrypted;
    }
}
