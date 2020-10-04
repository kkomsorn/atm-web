package th.ku.ac.atm.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ku.ac.atm.model.Customer;
import th.ku.ac.atm.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {
    private CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    public List<Customer> getAll(){
        return customerService.getCustomer();
    }
    @GetMapping("/{id}")
    public Customer getOne(@PathVariable int id){
        return customerService.findCustomer(id);
    }
}
