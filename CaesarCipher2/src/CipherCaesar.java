public class CipherCaesar extends Cipher {
    private static final String IN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz";
    private static final String OUT = "DEFGHIJKLMNOPQRSTUVWXYZABC abcdefghijklmnopqrstuvwxyz";

    @Override
    public char encrypt(char ch) {
        for (int i = 0; i < IN.length(); i++) {
            if (IN.charAt(i) == ch) {
                return OUT.charAt(i);
            }
        }
        return ch;
    }

}
