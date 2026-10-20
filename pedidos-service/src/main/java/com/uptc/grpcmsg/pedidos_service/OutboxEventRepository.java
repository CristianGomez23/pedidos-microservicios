package com.uptc.grpcmsg.pedidos_service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OutboxEventRepository extends JpaRepository<OutboxEvent, Long> {

    List<OutboxEvent> findByPublicadoFalseOrderByIdAsc();

}
