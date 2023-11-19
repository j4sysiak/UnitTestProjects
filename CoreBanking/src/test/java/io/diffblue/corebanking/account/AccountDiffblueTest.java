package io.diffblue.corebanking.account;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.diffblue.corebanking.client.Client;
import org.junit.jupiter.api.Test;

class AccountDiffblueTest {
    /**
     * Method under test: {@link Account#addToBalance(long)}
     */
    @Test
    void testAddToBalance() throws AccountException {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        account.addToBalance(10L);
        assertEquals(20L, account.getCurrentBalance());
    }
}
