import java.security.Provider;
import java.security.Security;

/**
 * @author Bagya
 *
 */
public class GetProviderInfo {
	public static void main(String[] args) {
		Provider[] providers = Security.getProviders();
		for (int i = 0; i < providers.length; i++) {
			System.out.println("Name " + providers[i].getName() + "\n" + "Info " + providers[i].getInfo() + "\n"
					+ "Version " + providers[i].getVersion());
			System.out.println(
					"-------------------------------------------------------------------------------------------");
		}

	}
}
