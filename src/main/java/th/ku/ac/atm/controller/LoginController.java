package th.ku.ac.atm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ku.ac.atm.model.BankAccount;
import th.ku.ac.atm.model.Customer;
import th.ku.ac.atm.service.BankAccountService;
import th.ku.ac.atm.service.CustomerService;

@Controller
@RequestMapping("/login")
public class LoginController {

    private CustomerService customerService;

    private BankAccountService bankAccountService;

    public LoginController(CustomerService customerService, BankAccountService bankAccountService) {
        this.customerService = customerService;
        this.bankAccountService = bankAccountService;
    }

    @GetMapping
    public String getLoginPage(){
        return "login";
    }

    @PostMapping
    public String  login(@ModelAttribute Customer customer, Model model){
        Customer matchingCustomer = customerService.checkPin(customer);
        if (matchingCustomer != null) {
            model.addAttribute("customertitle",matchingCustomer.getName() + " Bank Accounts");
            model.addAttribute("bankaccount", bankAccountService.getCustomerBankAccounts(customer.getId()));
            return "customeraccount";
        }
        else {
            model.addAttribute("greeting","Can't find customer");
        }
        return "home";
    }
}
