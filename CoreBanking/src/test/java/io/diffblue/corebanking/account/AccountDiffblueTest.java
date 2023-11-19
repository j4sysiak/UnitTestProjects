package io.diffblue.corebanking.account;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.diffblue.corebanking.branch.Branch;
import io.diffblue.corebanking.client.Client;
import org.junit.jupiter.api.Test;

class AccountDiffblueTest {
    /**
     * Method under test: {@link Account#addToBalance(long)}
     */
    @Test
    void testAddToBalance() throws AccountException {

    }

    /**
     * Method under test: {@link Account#addToBalance(long)}
     */
    @Test
    void testAddToBalance2() throws AccountException {
        Client client = new Client("Dr Jane Doe");
        Account account = new Account(1234567890L, client, 10L, new Branch());
        account.addToBalance(10L);
        assertEquals(20L, account.getCurrentBalance());
    }
}
