package com.demoaop.repository;

import com.demoaop.model.AopModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AopRepository extends JpaRepository<AopModel,Integer> {
}
