package com.exam.controller;

import com.exam.entity.Admin;
import com.exam.entity.ApiResult;
import com.exam.service.AdminService;
import com.exam.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/admins")
    public ApiResult findAll() {
        System.out.println("查询全部");
        return ApiResultHandler.success(adminService.findAll());
    }

    @GetMapping("/admin/{adminId}")
    public ApiResult findById(@PathVariable("adminid") Integer adminId) {
        System.out.println("根据ID查找");
        return ApiResultHandler.success(adminService.findById(adminId));
    }

    @DeleteMapping("/admin/{adminId}")
    public ApiResult deleteById(@PathVariable("adminId") Integer adminId) {
        adminService.deleteById(adminId);
        return ApiResultHandler.success();
    }

    @PutMapping("/admin/{adminId}")
    public ApiResult update(@PathVariable("adminId") Integer adminId, Admin admin) {
        return ApiResultHandler.success(adminService.update(admin));
    }

    @PostMapping("/admin")
    public ApiResult add(Admin admin) {
        return ApiResultHandler.success(adminService.add(admin));
    }
}
