package com.Juliy666.web;

import com.Juliy666.domain.Permission;
import com.Juliy666.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/permissionList")
    @ResponseBody
    public List<Permission> getPermissionList(){
        List<Permission> permissions = permissionService.getPermission();
        return permissions;
    }
    
	/* 根据角色查询对应的权限 */
    @RequestMapping("/getPermissionByRid")
    @ResponseBody
    public List<Permission> getPermissionByRid(Long rid) {
    	List<Permission> permissions = permissionService.getPermission(rid);
    	System.out.println(permissions);
    	return permissions;
    }
}
