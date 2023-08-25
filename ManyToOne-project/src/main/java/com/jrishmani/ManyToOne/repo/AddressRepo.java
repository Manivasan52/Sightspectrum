package com.jrishmani.ManyToOne.repo;

import com.jrishmani.ManyToOne.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AddressRepo extends JpaRepository<Address,Integer> {
}
