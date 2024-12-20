import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";
        int keyLength = 32;
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder(keyLength);
        for (int i = 0; i < keyLength; i++) {
            sb.append(allowedChars.charAt(secureRandom.nextInt(allowedChars.length())));
        }
        String key = sb.toString();
        System.out.println(key);
    }
}