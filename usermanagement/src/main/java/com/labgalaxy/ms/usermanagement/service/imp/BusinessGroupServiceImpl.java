package com.labgalaxy.ms.usermanagement.service.imp;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labgalaxy.ms.usermanagement.model.business.BusinessGroup;
import com.labgalaxy.ms.usermanagement.repository.BusinessGroupRepository;
import com.labgalaxy.ms.usermanagement.service.BusinessGroupService;

@Service
public class BusinessGroupServiceImpl implements BusinessGroupService {

	@Autowired
	BusinessGroupRepository businessGroupRepo;
	
	@Override
	public BusinessGroup save(BusinessGroup businessGroup) {
		businessGroupRepo.save(businessGroup);
		return null;
	}

	@Override
	public void remove(BusinessGroup object) {
		// TODO Auto-generated method stub

	}

	@Override
	public BusinessGroup findById(Long id) {
		return businessGroupRepo.findOne(id);
	}

	@Override
	public Collection<BusinessGroup> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BusinessGroup updateComplete(BusinessGroup group, Long groupId) {
		// TODO Auto-generated method stub
		return null;
	}

}
