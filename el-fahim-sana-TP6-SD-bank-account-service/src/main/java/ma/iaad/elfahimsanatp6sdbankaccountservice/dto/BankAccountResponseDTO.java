package ma.iaad.elfahimsanatp6sdbankaccountservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.iaad.elfahimsanatp6sdbankaccountservice.enums.AccountType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor @Builder

public class BankAccountResponseDTO {
    private String id;
    private Date createdAt;
    private  Double balance;
    private String currency;
    private AccountType type;
}
