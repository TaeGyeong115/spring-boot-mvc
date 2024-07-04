package io.taylor.springbootmvc.redis;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("accounts")
public class Account {
    @Id
    private String id;
    private String username;
    private String email;
}
