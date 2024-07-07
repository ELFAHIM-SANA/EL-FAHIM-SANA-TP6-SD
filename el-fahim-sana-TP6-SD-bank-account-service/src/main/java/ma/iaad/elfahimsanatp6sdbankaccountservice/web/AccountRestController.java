package ma.iaad.elfahimsanatp6sdbankaccountservice.web;

import ma.iaad.elfahimsanatp6sdbankaccountservice.Service.AccountService;
import ma.iaad.elfahimsanatp6sdbankaccountservice.dto.BankAccountRequestDTO;
import ma.iaad.elfahimsanatp6sdbankaccountservice.dto.BankAccountResponseDTO;
import ma.iaad.elfahimsanatp6sdbankaccountservice.entities.BankAccount;
import ma.iaad.elfahimsanatp6sdbankaccountservice.mappers.AccountMapper;
import ma.iaad.elfahimsanatp6sdbankaccountservice.repositories.BankAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class AccountRestController {
    private BankAccountRepository bankAccountRepository;
    private AccountService accountService;
    private AccountMapper accountMapper;

    public AccountRestController(BankAccountRepository bankAccountRepository, AccountMapper accountMapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.accountMapper = accountMapper;
    }
    //Consulter une liste de compte
    @GetMapping("/bankAccounts")
    public List<BankAccount> bankAccounts(){
        return bankAccountRepository.findAll();
    }

    //Consulter un compte
    @GetMapping("/bankAccounts/{id}")
    public BankAccount bankAccount(@PathVariable String id){
        return bankAccountRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Acount %s not found", id)));
    }
//Enregistrer un objet bankAccount
    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO save(@RequestBody BankAccountRequestDTO requestDTO){
        return accountService.addAccount(requestDTO);
    }

    //Faire le Update
    @PutMapping("/bankAccounts/{id}")
    public BankAccount update(@PathVariable String  id,@RequestBody BankAccount bankAccount){
        BankAccount account=bankAccountRepository.findById(id).orElseThrow();
        if (bankAccount.getBalance()!=null) account.setBalance(bankAccount.getBalance());
        if (bankAccount.getCreatedAt()!=null) account.setCreatedAt(bankAccount.getCreatedAt());
        if (bankAccount.getType()!=null) account.setType(bankAccount.getType());
        if (bankAccount.getCurrency()!=null) account.setCurrency(bankAccount.getCurrency());
        return bankAccountRepository.save(account);
    }

    //Supprimer un compte
    @DeleteMapping("/bankAccounts/{id}")
    public void deleteAccount(@PathVariable String id){
         bankAccountRepository.deleteById(id);
    }
}
