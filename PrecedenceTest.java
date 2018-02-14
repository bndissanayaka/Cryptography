import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/**
 * @author Bhagya 
 * Gets the first provider in precedence list for the required implementation
 */

public class PrecedenceTest {
	public static void main(String[] args) {
		try {
			Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
			System.out.println("Provider " + cipher.getProvider());
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			throw new IllegalStateException("Could not retrieve AES cipher", e);
		}
	}
}
