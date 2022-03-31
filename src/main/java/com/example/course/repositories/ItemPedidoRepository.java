package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
