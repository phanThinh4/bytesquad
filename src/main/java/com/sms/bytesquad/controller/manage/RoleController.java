package com.sms.bytesquad.controller.manage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.bytesquad.entity.Role;
import com.sms.bytesquad.service.RoleService;

@RestController
@RequestMapping("rest/roles")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping
    public ResponseEntity<List<Role>> getALL() {
        return ResponseEntity.ok(roleService.getAllRoles());
    }

    @GetMapping("{roleId}")
    public ResponseEntity<Role> getOne(@PathVariable String roleId) {
        if (!roleService.roleExists(roleId)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(roleService.getRoleById(roleId));
    }

    @PostMapping
    public ResponseEntity<Role> post(@RequestBody Role role) {
        if (roleService.roleExists(role.getName())) {
        return ResponseEntity.badRequest().build();
        }

        // if (roleService.roleExists(role.getName()))
        //     throw new RuntimeException("role existed");

        roleService.createRole(role);
        return ResponseEntity.ok(role);
    }

    @PutMapping("{roleId}")
    public ResponseEntity<Role> put(@PathVariable String roleId, @RequestBody Role role) {
        if (!roleService.roleExists(roleId)) {
            return ResponseEntity.notFound().build();
        }
        roleService.updateRole(role);
        return ResponseEntity.ok(role);
    }

    @DeleteMapping("{roleId}")
    public ResponseEntity<Void> delete(@PathVariable String roleId) {
        if (!roleService.roleExists(roleId)) {
            return ResponseEntity.notFound().build();
        }
        roleService.deleteRole(roleId);
        return ResponseEntity.ok().build();
    }

}
