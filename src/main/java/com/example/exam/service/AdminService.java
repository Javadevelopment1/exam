package com.example.exam.service;

import com.example.exam.entity.Admin;

import java.util.List;

public interface AdminService {

    public List<Admin> findAll();

    public Admin findById(Integer adminId);

    public int deleteById(int adminId);

    public int update(Admin admin);

    public int add(Admin admin);
}
