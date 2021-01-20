package com.insannity.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insannity.client.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	
}
