package edu.icet.ecom.repository;
import edu.icet.ecom.entity.Product_entity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Product_repository extends JpaRepository<Product_entity, Integer> {
}
