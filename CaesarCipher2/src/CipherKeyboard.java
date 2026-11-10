public class CipherKeyboard {
    private static final String IN = "QWERTYUIOP ASDFGHJKL ZXCVBNM qwertyuiop asdfghjkl zxcvbnm";
    private static final String OUT = "WERTYUIOPQ SDFGHJKLA XCVBMNZ wertyuiop asdfghjkl zxcvbnm";

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
