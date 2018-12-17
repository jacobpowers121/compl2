public class XOREncrypter implements Encrypter {

    private byte[] key;


    @Override
    public byte[] decrypt(byte[] msg) {
        return encrypt(msg);
    }

    @Override
    public byte[] encrypt(byte[] msg) {
        keyPopulator(msg.length);
        byte[] encrypted = new byte[msg.length];

        for(int i = 0; i < msg.length; i++){
            encrypted[i] = (byte)(msg[i] ^ key[i]);
        }
        return encrypted;
    }

    private void keyPopulator(int length){
        byte[] letter = {'a', 'b', 'c', 'd'};
        key = new byte[length];
        int counter = 1;
        for(int i = 0; i < length; i++){
            if(counter == 4){
                key[i] = letter[3];
                counter = 0;
            }else if(counter == 3){
                key[i] = letter[2];
            }else if(counter == 2){
                key[i] = letter[1];
            }else if(counter == 1){
                key[i] = letter[0];
            }
            counter++;
        }
    }
}
