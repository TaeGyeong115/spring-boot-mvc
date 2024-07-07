package io.taylor.springbootmvc;

import io.taylor.springbootmvc.mongo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class SpringBootMVCApplication {

//    @Autowired
//    MongoTemplate mongoTemplate;
//
//    @Autowired
//    AccountMongoRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMVCApplication.class, args);
    }

//    @Bean
//    public ApplicationRunner applicationRunner() {
//        return  args -> {
//            Account account = new Account();
//            account.setEmail("test@gmail.com");
//            account.setUsername("test");
//            accountRepository.insert(account);
//
//            mongoTemplate.insert(account);
//
//            System.out.println("finished");
//
//        };
//    }
}