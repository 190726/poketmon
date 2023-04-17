package com.sk.poket.adapter.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.poket.domain.Poketmon;

public interface PoketJpaRepository extends JpaRepository<Poketmon, Long>{

}
