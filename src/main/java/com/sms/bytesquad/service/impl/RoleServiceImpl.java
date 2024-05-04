package com.sms.bytesquad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.bytesquad.entity.Role;
import com.sms.bytesquad.repository.RoleRepository;
import com.sms.bytesquad.service.RoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(String id) {
        return roleRepository.findById(id).orElse(null);
    }
    
    @Override
    public void createRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void updateRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void deleteRole(String id) {
        roleRepository.deleteById(id);
    }
    
    @Override
    public boolean roleExists(String id) {
        return roleRepository.existsById(id);
    }
}

