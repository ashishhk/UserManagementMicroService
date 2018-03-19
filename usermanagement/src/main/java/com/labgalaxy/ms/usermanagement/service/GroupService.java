package com.labgalaxy.ms.usermanagement.service;

import java.util.Collection;

import com.labgalaxy.ms.usermanagement.model.business.BusinessGroup;
import com.labgalaxy.ms.usermanagement.model.user.User;
import com.labgalaxy.ms.usermanagement.model.user.UserType;

public interface GroupService extends AbstractDomainObjectService<BusinessGroup> {

	public BusinessGroup getGroupByName(String name);

	public BusinessGroup save(BusinessGroup group);

	public void remove(BusinessGroup group);

	public Collection<BusinessGroup> getGroupByAdminUser(User user);

	public Collection<BusinessGroup> getGroupByMemberUser(User user);

	public void addUserToGroup(User user, BusinessGroup group, UserType memberShipType);

	public void removeUserFromGroup(User user, BusinessGroup group, UserType memberShipType);

	public void removeUserFromGroup(User user, BusinessGroup group);

	public Collection<BusinessGroup> findAll();

	public BusinessGroup updateComplete(BusinessGroup group, Long groupId);

	public void removeById(Long userId);

}
