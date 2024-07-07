package ma.iaad.elfahimsanatp6sdbankaccountservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@NoArgsConstructor  @AllArgsConstructor @Builder @Data
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    @OneToMany(mappedBy = "customer")
    @JsonProperty(access =JsonProperty.Access.WRITE_ONLY)
    private List<BankAccount> bankAccounts;

}
