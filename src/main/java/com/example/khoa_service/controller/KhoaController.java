package com.example.khoa_service.controller;

import com.example.khoa_service.entity.Khoa;
import com.example.khoa_service.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/khoas")
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    @PostMapping("/")
    public Khoa saveKhoa(@RequestBody  Khoa khoa) {
        Khoa khoa1 = khoaService.saveKhoa(khoa);
        return khoa1;
    }

    @GetMapping("/{id}")
    public Khoa findKhoaById(@PathVariable long id) {
        return khoaService.findKhoaById(id);
    }

    @Value("${welcome}")
    private String welcome;

    @GetMapping("/")
    public String helloWorld(){return welcome;}
}
