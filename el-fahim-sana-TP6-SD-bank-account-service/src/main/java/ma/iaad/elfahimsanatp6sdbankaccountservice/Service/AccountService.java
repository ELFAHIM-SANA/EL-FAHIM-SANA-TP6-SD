package ma.iaad.elfahimsanatp6sdbankaccountservice.Service;

import ma.iaad.elfahimsanatp6sdbankaccountservice.dto.BankAccountRequestDTO;
import ma.iaad.elfahimsanatp6sdbankaccountservice.dto.BankAccountResponseDTO;
import ma.iaad.elfahimsanatp6sdbankaccountservice.entities.BankAccount;
import ma.iaad.elfahimsanatp6sdbankaccountservice.enums.AccountType;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);


    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
