package ma.iaad.elfahimsanatp6sdbankaccountservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.iaad.elfahimsanatp6sdbankaccountservice.enums.AccountType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BankAccount {

        @Id
        private String id;
        private Date createdAt;
        private  Double balance;
        private String currency;
        @Enumerated(EnumType.STRING)
        private AccountType type;
        @ManyToOne
        private  Customer customer;
    }


