package th.ku.ac.atm.service;

import org.springframework.stereotype.Service;
import th.ku.ac.atm.model.BankAccount;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {

    private List<BankAccount> bankAccountsList;

    @PostConstruct
    public void postConstruct() {
        this.bankAccountsList = new ArrayList<>();
    }

    public void createBankAccount(BankAccount bankAccount) {
        bankAccountsList.add(bankAccount);
    }

    public List<BankAccount> getAccount() {
        return new ArrayList<>(this.bankAccountsList);
    }
}

