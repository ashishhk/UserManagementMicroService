package com.labgalaxy.ms.usermanagement.service;

import com.labgalaxy.ms.usermanagement.model.business.BusinessGroup;

public interface BusinessGroupService extends AbstractDomainObjectService<BusinessGroup>{

	public BusinessGroup updateComplete(BusinessGroup group, Long groupId);

}
