package io.taylor.springbootmvc.mongo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataMongoTest
public class AccountMongoRepositoryTest {

    @Autowired
    AccountMongoRepository accountMongoRepository;

    @Test
    public void findByEmail() {
        Account account = new Account();
        account.setUsername("taylor");
        account.setEmail("taylor@gmail.com");

        accountMongoRepository.save(account);

        Optional<Account> byId = accountMongoRepository.findById(account.getId());
        assertThat(byId).isNotEmpty();

        Optional<Account> byEmail = accountMongoRepository.findByEmail(account.getEmail());
        assertThat(byEmail).isNotEmpty();
        assertThat(byEmail.get().getUsername()).isEqualTo("taylor");
    }

}