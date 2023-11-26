package pl.devfoundry.testing.account;

import java.util.List;
import java.util.stream.Collectors;

class AccountService {

    private IAccountRepository iaccountRepository;

    AccountService(IAccountRepository iaccountRepository) {
        this.iaccountRepository = iaccountRepository;
    }

    List<Account> getAllActiveAccounts() {
        return iaccountRepository.getAllAccounts().stream()
                .filter(Account::isActive)
                .collect(Collectors.toList());
    }

}
