package com.exam.serviceimpl;

import com.exam.entity.Admin;
import com.exam.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminService adminService;

    @Override
    public List<Admin> findAll() {
        return adminService.findAll();
    }

    @Override
    public Admin findById(Integer adminId) {
        return adminService.findById(adminId);
    }

    @Override
    public int deleteById(int adminId) {
        return adminService.deleteById(adminId);
    }

    @Override
    public int update(Admin admin) {
        return adminService.update(admin);
    }

    @Override
    public int add(Admin admin) {
        return adminService.add(admin);
    }
}
