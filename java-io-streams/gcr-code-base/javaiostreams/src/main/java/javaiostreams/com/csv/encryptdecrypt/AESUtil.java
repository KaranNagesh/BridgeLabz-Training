package javaiostreams.com.csv.encryptdecrypt;

import javax.crypto.Cipher; // Performs encryption/decryption
import javax.crypto.spec.SecretKeySpec; // Secret key specification
import java.util.Base64; // Base64 encoding

public class AESUtil {

	private static final String ALGORITHM = "AES";

	// 16-byte secret key
	private static final String SECRET_KEY = "MySecretKey12345";

	// Encrypt plain text
	public static String encrypt(String data) throws Exception {

		Cipher cipher = Cipher.getInstance(ALGORITHM);
		SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);

		cipher.init(Cipher.ENCRYPT_MODE, key);

		byte[] encryptedBytes = cipher.doFinal(data.getBytes());

		return Base64.getEncoder().encodeToString(encryptedBytes);
	}

	// Decrypt encrypted text
	public static String decrypt(String encryptedData) throws Exception {

		Cipher cipher = Cipher.getInstance(ALGORITHM);
		SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);

		cipher.init(Cipher.DECRYPT_MODE, key);

		byte[] decodedBytes = Base64.getDecoder().decode(encryptedData);

		return new String(cipher.doFinal(decodedBytes));
	}
}