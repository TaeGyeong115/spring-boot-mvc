package io.taylor.springbootmvc.mongo;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "accounts")
public class Account {
    @Id
    private String id;

    private String username;

    private String email;
}
