package pl.devfoundry.testing;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class AccountDiffblueTest {
    /**
     * Method under test: {@link Account#activate()}
     */
    @Test
    void testActivate() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     Account.active

        (new Account()).activate();
    }

    /**
     * Method under test: {@link Account#isActive()}
     */
    @Test
    void testIsActive() {
        assertFalse((new Account()).isActive());
    }
}
