package com.client.api.Client.API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.api.Client.API.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
}
