package th.ku.ac.atm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import th.ku.ac.atm.model.BankAccount;
import th.ku.ac.atm.service.BankAccountService;

@Controller
public class BankAccountController {

    private BankAccountService bankAccountService;

    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("/bankaccount")
    public String getBankAccountPage(Model model) {
        model.addAttribute("allBankaccount", bankAccountService.getAccount());
        return "bankaccount";
    }

    @PostMapping("/bankaccount")
    public String registerCustomer(@ModelAttribute BankAccount bankAccount, Model model) {
        bankAccountService.createBankAccount(bankAccount);
        model.addAttribute("allBankaccount", bankAccountService.getAccount());
        return "redirect:bankaccount";
    }
}
