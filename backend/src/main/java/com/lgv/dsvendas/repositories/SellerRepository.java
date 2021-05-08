package com.lgv.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgv.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
