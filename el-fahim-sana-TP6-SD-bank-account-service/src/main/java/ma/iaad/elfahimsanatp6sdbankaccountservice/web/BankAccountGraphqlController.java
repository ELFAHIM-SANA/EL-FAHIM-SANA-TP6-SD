package ma.iaad.elfahimsanatp6sdbankaccountservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.iaad.elfahimsanatp6sdbankaccountservice.Service.AccountService;
import ma.iaad.elfahimsanatp6sdbankaccountservice.dto.BankAccountRequestDTO;
import ma.iaad.elfahimsanatp6sdbankaccountservice.dto.BankAccountResponseDTO;
import ma.iaad.elfahimsanatp6sdbankaccountservice.entities.BankAccount;
import ma.iaad.elfahimsanatp6sdbankaccountservice.entities.Customer;
import ma.iaad.elfahimsanatp6sdbankaccountservice.repositories.BankAccountRepository;
import ma.iaad.elfahimsanatp6sdbankaccountservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountGraphqlController {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountService accountService;
    @Autowired
    private CustomerRepository customerRepository;
    @QueryMapping
    public List<BankAccount> accountsList(){
        return bankAccountRepository.findAll();

    }

    @QueryMapping
    public BankAccount bankAccountById(@Argument String id){
        return bankAccountRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Account %s not found", id)));

    }
    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount){
        return accountService.addAccount(bankAccount);
    }

    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id, @Argument BankAccountRequestDTO bankAccount){
        return accountService.updateAccount(id,bankAccount);
    }
    @MutationMapping
    public void deleteAccount(@Argument String id) {
        bankAccountRepository.deleteById(id);
    }
    //Méthode pour récupérer une liste de customers
    @QueryMapping
    public List<Customer> customers(){
        return customerRepository.findAll();
    }


}

