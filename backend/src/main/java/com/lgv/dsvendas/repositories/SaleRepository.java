package com.lgv.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgv.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
