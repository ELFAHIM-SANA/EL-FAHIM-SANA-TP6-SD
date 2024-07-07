package ma.iaad.elfahimsanatp6sdbankaccountservice;

import ma.iaad.elfahimsanatp6sdbankaccountservice.entities.BankAccount;
import ma.iaad.elfahimsanatp6sdbankaccountservice.entities.Customer;
import ma.iaad.elfahimsanatp6sdbankaccountservice.enums.AccountType;
import ma.iaad.elfahimsanatp6sdbankaccountservice.repositories.BankAccountRepository;
import ma.iaad.elfahimsanatp6sdbankaccountservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ElFahimSanaTp6SdBankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElFahimSanaTp6SdBankAccountServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository, CustomerRepository customerRepository){
        return  args -> {
            Stream.of("Sanaa","Ayoub","Houda","Khadija").forEach(c->{
                Customer customer =Customer.builder()
                                .name(c)
                                        .build();
                customerRepository.save(customer);
            });
            customerRepository.findAll().forEach(customer -> {
                for (int i = 0 ; i < 10; i++){
                    BankAccount bankAccount = BankAccount.builder()
                            .id(UUID.randomUUID().toString())
                            .type(Math.random()> 0.5? AccountType.Current_ACCOUNT:AccountType.SAVING_ACCOUNT)
                            .balance(Math.random()*90000)
                            .createdAt(new Date())
                            .currency("MAD")
                            .customer(customer)
                            .build();
                    bankAccountRepository.save(bankAccount);
                }
            });

        };
    }

}
