package io.taylor.springbootmvc.neo4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.stereotype.Component;

@Component
public class Neo4jRunner implements ApplicationRunner {

//    @Autowired
//    Neo4jTemplate neo4jTemplate;

    @Autowired
    Neo4jAccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setEmail("taylor@gmail.com");
        account.setUsername("taylor");

        Role role = new Role();
        role.setName("admin");

        account.getRoles().add(role);

//        neo4jTemplate.save(account);
        accountRepository.save(account);

        System.out.println("neo4j finished");
    }
}
