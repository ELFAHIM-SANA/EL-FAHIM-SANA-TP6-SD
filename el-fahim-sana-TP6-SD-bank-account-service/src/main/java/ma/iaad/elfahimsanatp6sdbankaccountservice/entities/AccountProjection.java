package ma.iaad.elfahimsanatp6sdbankaccountservice.entities;

import ma.iaad.elfahimsanatp6sdbankaccountservice.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {
    public  String getId();
    public AccountType getType();
    public Double getBalance();

}
