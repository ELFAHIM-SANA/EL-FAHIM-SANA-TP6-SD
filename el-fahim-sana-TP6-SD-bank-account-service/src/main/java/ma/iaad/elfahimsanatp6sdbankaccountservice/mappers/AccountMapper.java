package ma.iaad.elfahimsanatp6sdbankaccountservice.mappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import ma.iaad.elfahimsanatp6sdbankaccountservice.dto.BankAccountResponseDTO;
import ma.iaad.elfahimsanatp6sdbankaccountservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO=new BankAccountResponseDTO();
        BeanUtils.copyProperties( bankAccount,bankAccountResponseDTO);
        return bankAccountResponseDTO;

    }

}
