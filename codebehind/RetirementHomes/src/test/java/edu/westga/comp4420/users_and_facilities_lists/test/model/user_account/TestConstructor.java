package edu.westga.comp4420.users_and_facilities_lists.test.model.user_account;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import edu.westga.comp4420.users_and_facilities_lists.model.UserAccount;

class TestConstructor {
	
	@ParameterizedTest
	@CsvSource({"bob, ross, bob@ross.com"})
	void testValidInput(String firstName, String lastName, String email) {
		UserAccount testUser = new UserAccount(firstName, lastName, email);
		
		assertEquals(firstName, result.getFirstName(), "checking first name of the account");
		assertEquals(lastName, result.getLastName(), "checking last name of account");
		assertEquals(email, result.getEmail(), "checking the email of the account");
	}
	
	@ParameterizedTest
	@CsvSource({", 1, 1", "'', 1, 1", "bob, 0, 0", "bob, 1, -1"})
	void testInvalidInput(String name, String lastName, String email) {
		assertThrows(IllegalArgumentException.class, ()->{new UserAccount(firstName, lastName, email);});
	}
}
