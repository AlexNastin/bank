package com.pis.bank;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("customers")
@Data
public class Customer {

    @PrimaryKey
    private String name;

    private String value;

}
