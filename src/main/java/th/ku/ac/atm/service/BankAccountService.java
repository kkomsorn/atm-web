package th.ku.ac.atm.service;

import th.ku.ac.atm.model.BankAccount;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class BankAccountService {

    private RestTemplate restTemplate;

    public BankAccountService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public List<BankAccount> getCustomerBankAccounts(int customerId) {
        String url = "http://localhost:8091/api/bankaccount/customer/" + customerId;
        ResponseEntity<BankAccount[]> response = restTemplate.getForEntity(url, BankAccount[].class);
        BankAccount[] accounts = response.getBody();
        return Arrays.asList(accounts);
    }
}

