public class CaesarCipher {
    private static char conv1[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static char conv2[] = "defghijklmnopqrstuvwxyzabc".toCharArray();
    private String text;

    public CaesarCipher(String input){
        text = input;
    }

    public String encryptedCypher() {
        char orig[] = text.toCharArray();
        char encrypt[] = new char[orig.length];


        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < conv1.length; j++) {
                if (orig[i] == conv1[j]) {
                    encrypt[1] = conv2[j];
                }
            }
        }
        String ans = String.valueOf(encrypt);
        return ans;
    }

    public String getOriginal() {
        return text;
    }

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher("hello");
        System.out.println("Original: " + cc.getOriginal());
        System.out.println("Encrypted: " + cc.encryptedCypher());

        CaesarCipher cc2 = new CaesarCipher("goodday");
        System.out.println("Original : "+cc2.getOriginal());
        System.out.println("Encrypted: "+cc2.encryptedCypher());

    }
}