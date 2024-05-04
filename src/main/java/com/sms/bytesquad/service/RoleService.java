package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.Role;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRoleById(String id);
    
    void createRole(Role role);
    
    void updateRole(Role role);
    
    void deleteRole(String id);
    
    boolean roleExists(String id);
}

