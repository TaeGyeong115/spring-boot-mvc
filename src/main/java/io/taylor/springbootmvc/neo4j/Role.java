package io.taylor.springbootmvc.neo4j;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@Node
public class Role {
    @Id @GeneratedValue
    private Long id;

    private String name;
}
