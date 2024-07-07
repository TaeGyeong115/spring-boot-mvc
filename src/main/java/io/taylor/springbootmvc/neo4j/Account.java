package io.taylor.springbootmvc.neo4j;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

@Node
@Data
public class Account {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String email;

    @Relationship(type = "has")
    private Set<Role> roles = new HashSet<>();
}
