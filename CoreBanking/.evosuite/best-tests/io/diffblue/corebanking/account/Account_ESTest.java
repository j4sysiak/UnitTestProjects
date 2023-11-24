/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 20:48:10 GMT 2023
 */

package io.diffblue.corebanking.account;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.diffblue.corebanking.account.Account;
import io.diffblue.corebanking.branch.Branch;
import io.diffblue.corebanking.client.Client;
import io.diffblue.corebanking.transaction.BankTransaction;
import io.diffblue.corebanking.transaction.CashTransaction;
import io.diffblue.corebanking.transaction.Transaction;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Account_ESTest extends Account_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Client client0 = new Client("");
      Branch branch0 = new Branch();
      Account account0 = new Account(81L, client0, 81L, branch0);
      BankTransaction bankTransaction0 = new BankTransaction((-2979L), (Date) null, account0, account0);
      account0.addTransaction(bankTransaction0);
      account0.addTransaction(bankTransaction0);
      // Undeclared exception!
      try { 
        account0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Client client0 = new Client("Account: | ");
      Branch branch0 = new Branch();
      Account account0 = new Account((-3870L), client0, 0L, branch0);
      Account account1 = new Account(0L, client0, 1551L, branch0);
      boolean boolean0 = account0.equals(account1);
      assertEquals(1551L, account1.getCurrentBalance());
      assertFalse(account1.equals((Object)account0));
      assertEquals((-3870L), account0.getAccountNumber());
      assertEquals("Current", account1.getAccountName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Client client0 = new Client("+&(ac+3'L$Nv");
      Branch branch0 = new Branch();
      Account account0 = new Account(0L, client0, 0L, branch0);
      account0.takeFromBalance((-2619L));
      assertEquals(2619L, account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Account account0 = new Account(1L, (Client) null, 1L, (Branch) null);
      account0.addToBalance((-1L));
      assertEquals(0L, account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Client client0 = new Client((String) null);
      Branch branch0 = new Branch();
      Account account0 = new Account(0L, client0, 0L, branch0);
      account0.getCurrentBalance();
      assertEquals("Current", account0.getAccountName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Branch branch0 = new Branch();
      Account account0 = new Account(631L, (Client) null, 631L, branch0);
      long long0 = account0.getCurrentBalance();
      assertEquals(631L, long0);
      assertEquals("Current", account0.getAccountName());
      assertEquals(631L, account0.getAccountNumber());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Branch branch0 = new Branch();
      Account account0 = new Account(4126L, (Client) null, 0L, branch0);
      account0.getClient();
      assertEquals(4126L, account0.getAccountNumber());
      assertEquals("Current", account0.getAccountName());
      assertEquals(0L, account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Branch branch0 = new Branch();
      Account account0 = new Account(0L, (Client) null, 0L, branch0);
      account0.getAccountNumber();
      assertEquals("Current", account0.getAccountName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Client client0 = new Client("Trying to take ");
      Branch branch0 = new Branch();
      Account account0 = new Account(1L, client0, 167L, branch0);
      long long0 = account0.getAccountNumber();
      assertEquals("Current", account0.getAccountName());
      assertEquals(167L, account0.getCurrentBalance());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Client client0 = new Client((String) null);
      Branch branch0 = new Branch();
      Account account0 = new Account(1L, client0, 1L, branch0);
      assertEquals("Current", account0.getAccountName());
      
      account0.setAccountName((String) null);
      account0.getAccountName();
      assertEquals(1L, account0.getAccountNumber());
      assertEquals(1L, account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Branch branch0 = new Branch();
      Account account0 = new Account((-896L), (Client) null, (-896L), branch0);
      Account.AccountStatement account_AccountStatement0 = account0.new AccountStatement();
      String string0 = account_AccountStatement0.toString();
      assertEquals("Account statement empty.", string0);
      assertEquals("Current", account0.getAccountName());
      assertEquals((-896L), account0.getAccountNumber());
      assertEquals((-896L), account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Client client0 = new Client("");
      Account account0 = new Account(0L, client0, (-2006L), (Branch) null);
      Account.AccountStatement account_AccountStatement0 = account0.getAccountStatement();
      MockDate mockDate0 = new MockDate(1827, 1827, (-729));
      CashTransaction cashTransaction0 = new CashTransaction(4, mockDate0, account0);
      account0.addTransaction(cashTransaction0);
      String string0 = account_AccountStatement0.toString();
      assertEquals("Current", account0.getAccountName());
      assertEquals("Transaction: | 77.04.01\t| Source: CASH\t| Target: 0\t| Amount: 4\t| Balance: 0\t| Transaction state: NOT_EXECUTED_YET\t|\n", string0);
      assertEquals((-2006L), account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Branch branch0 = new Branch();
      Account account0 = new Account((-896L), (Client) null, (-896L), branch0);
      long long0 = account0.getAccountNumber();
      assertEquals((-896L), account0.getCurrentBalance());
      assertEquals("Current", account0.getAccountName());
      assertEquals((-896L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Branch branch0 = new Branch();
      Account account0 = new Account((-896L), (Client) null, (-896L), branch0);
      long long0 = account0.getCurrentBalance();
      assertEquals("Current", account0.getAccountName());
      assertEquals((-896L), account0.getAccountNumber());
      assertEquals((-896L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Branch branch0 = new Branch();
      Account account0 = new Account((-896L), (Client) null, (-896L), branch0);
      account0.getAccountState();
      assertEquals("Current", account0.getAccountName());
      assertEquals((-896L), account0.getAccountNumber());
      assertEquals((-896L), account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Client client0 = new Client((String) null);
      Branch branch0 = new Branch();
      Account account0 = new Account(1L, client0, 1L, branch0);
      String string0 = account0.getAccountName();
      assertEquals("Current", string0);
      assertEquals(1L, account0.getAccountNumber());
      assertEquals(1L, account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Client client0 = new Client("vu'P");
      Branch branch0 = new Branch();
      Account account0 = new Account(1L, client0, 1L, branch0);
      account0.getClient();
      assertEquals("Current", account0.getAccountName());
      assertEquals(1L, account0.getAccountNumber());
      assertEquals(1L, account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Client client0 = new Client("*I33{aN1q");
      Branch branch0 = new Branch();
      Account account0 = new Account((-4403L), client0, (-4403L), branch0);
      MockDate mockDate0 = new MockDate((-4403L));
      CashTransaction cashTransaction0 = new CashTransaction(4, mockDate0, account0);
      account0.addTransaction(cashTransaction0);
      String string0 = account0.toString();
      assertEquals("Account: | Acc #: -4403\t | Acc name: Current\t | Acc holder: *I33{aN1q\t | Acc balance: -4403\t | Acc state: OPEN\t |\nTransaction: | 69.12.31\t| Source: CASH\t| Target: -4403\t| Amount: 4\t| Balance: 0\t| Transaction state: NOT_EXECUTED_YET\t|\n", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Client client0 = new Client("Trying to take ");
      Branch branch0 = new Branch();
      Account account0 = new Account(1L, client0, 167L, branch0);
      Account account1 = new Account((-1L), client0, 3612L, branch0);
      boolean boolean0 = account0.equals(account1);
      assertFalse(boolean0);
      assertEquals(3612L, account1.getCurrentBalance());
      assertFalse(account1.equals((Object)account0));
      assertEquals((-1L), account1.getAccountNumber());
      assertEquals("Current", account1.getAccountName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Client client0 = new Client("mtW>'|");
      Branch branch0 = new Branch();
      Account account0 = new Account((-2281L), client0, (-2281L), branch0);
      boolean boolean0 = account0.equals(branch0);
      assertFalse(boolean0);
      assertEquals((-2281L), account0.getAccountNumber());
      assertEquals("Current", account0.getAccountName());
      assertEquals((-2281L), account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Client client0 = new Client((String) null);
      Branch branch0 = new Branch();
      Account account0 = new Account(2240L, client0, 2240L, branch0);
      Account account1 = new Account(2240L, client0, 2240L, branch0);
      boolean boolean0 = account0.equals(account1);
      assertEquals(2240L, account1.getCurrentBalance());
      assertEquals("Current", account1.getAccountName());
      assertTrue(boolean0);
      assertEquals(2240L, account1.getAccountNumber());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Client client0 = new Client((String) null);
      Branch branch0 = new Branch();
      Account account0 = new Account(2240L, client0, 2240L, branch0);
      boolean boolean0 = account0.equals(account0);
      assertTrue(boolean0);
      assertEquals("Current", account0.getAccountName());
      assertEquals(2240L, account0.getCurrentBalance());
      assertEquals(2240L, account0.getAccountNumber());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Client client0 = new Client((String) null);
      Branch branch0 = new Branch();
      Account account0 = new Account(1L, client0, 1L, branch0);
      boolean boolean0 = account0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(1L, account0.getAccountNumber());
      assertEquals(1L, account0.getCurrentBalance());
      assertEquals("Current", account0.getAccountName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Client client0 = new Client("#iiQag\"$,<j@$ IO");
      Branch branch0 = new Branch();
      Account account0 = new Account(1888L, client0, 1888L, branch0);
      account0.closeAccount();
      try { 
        account0.addTransaction((Transaction) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The account is closed, you cannot add a transaction.
         //
         verifyException("io.diffblue.corebanking.account.Account", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Client client0 = new Client((String) null);
      Branch branch0 = new Branch();
      Account account0 = new Account(0L, client0, 0L, branch0);
      account0.closeAccount();
      try { 
        account0.closeAccount();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Account is already closed.
         //
         verifyException("io.diffblue.corebanking.account.Account", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Client client0 = new Client("T&lO");
      Branch branch0 = new Branch();
      Account account0 = new Account(233L, client0, 233L, branch0);
      account0.closeAccount();
      try { 
        account0.setAccountName("T&lO");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot change account name, account is closed.
         //
         verifyException("io.diffblue.corebanking.account.Account", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Client client0 = new Client("");
      Branch branch0 = new Branch();
      Account account0 = new Account(4115L, client0, 2176L, branch0);
      assertEquals("Current", account0.getAccountName());
      
      account0.setAccountName("");
      account0.getAccountName();
      assertEquals(4115L, account0.getAccountNumber());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Client client0 = new Client("*I33{aN1q");
      Branch branch0 = new Branch();
      Account account0 = new Account((-4403L), client0, (-4403L), branch0);
      try { 
        account0.takeFromBalance(4);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Trying to take 4 from the existing balance of -4403. Not enough funds.
         //
         verifyException("io.diffblue.corebanking.account.Account", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Client client0 = new Client("");
      Branch branch0 = new Branch();
      Account account0 = new Account((-3697), client0, (-2407L), branch0);
      account0.closeAccount();
      try { 
        account0.takeFromBalance(706L);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot take from balance, account is closed.
         //
         verifyException("io.diffblue.corebanking.account.Account", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Branch branch0 = new Branch();
      Account account0 = new Account((-61L), (Client) null, (-61L), branch0);
      account0.takeFromBalance((-61L));
      assertEquals(0L, account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Client client0 = new Client((String) null);
      Branch branch0 = new Branch();
      Account account0 = new Account(0L, client0, 0L, branch0);
      account0.addToBalance(0L);
      assertEquals("Current", account0.getAccountName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Client client0 = new Client("#iiQag\"$,<j@$ IO");
      Branch branch0 = new Branch();
      Account account0 = new Account(1888L, client0, 1888L, branch0);
      Account.AccountStatement account_AccountStatement0 = account0.new AccountStatement();
      account_AccountStatement0.getTransactions();
      assertEquals(1888L, account0.getAccountNumber());
      assertEquals("Current", account0.getAccountName());
      assertEquals(1888L, account0.getCurrentBalance());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Branch branch0 = new Branch();
      Account account0 = new Account((-61L), (Client) null, (-61L), branch0);
      account0.closeAccount();
      try { 
        account0.addToBalance((-61L));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot add to balance, account is closed.
         //
         verifyException("io.diffblue.corebanking.account.Account", e);
      }
  }
}
