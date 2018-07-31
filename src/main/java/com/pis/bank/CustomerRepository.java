package com.pis.bank;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CustomerRepository extends CassandraRepository<Customer, String> {
}
