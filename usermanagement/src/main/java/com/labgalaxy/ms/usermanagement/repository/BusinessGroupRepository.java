package com.labgalaxy.ms.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.labgalaxy.ms.usermanagement.model.business.BusinessGroup;

@Repository
public interface BusinessGroupRepository extends JpaRepository<BusinessGroup, Long> {

}