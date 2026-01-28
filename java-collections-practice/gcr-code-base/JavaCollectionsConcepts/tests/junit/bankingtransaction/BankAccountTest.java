package junit.bankingtransaction;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.bankingtransaction.BankAccount;

class BankAccountTest {

	// BankAccount object for testing
	private BankAccount account;

	// Creates a fresh account before each test
	@BeforeEach
	void setUp() {
		account = new BankAccount();
	}

	// Tests deposit operation
	@Test
	void testDeposit() {
		account.deposit(1000);
		assertEquals(1000, account.getBalance());
	}

	// Tests successful withdrawal
	@Test
	void testWithdrawSuccess() {
		account.deposit(1000);
		account.withdraw(400);

		assertEquals(600, account.getBalance());
	}

	// Tests withdrawal failure due to insufficient funds
	@Test
	void testWithdrawInsufficientFunds() {
		account.deposit(500);

		assertThrows(IllegalStateException.class, () -> {
			account.withdraw(800);
		});
	}

	// Tests multiple transactions
	@Test
	void testMultipleTransactions() {
		account.deposit(1000);
		account.deposit(500);
		account.withdraw(300);

		assertEquals(1200, account.getBalance());
	}
}
