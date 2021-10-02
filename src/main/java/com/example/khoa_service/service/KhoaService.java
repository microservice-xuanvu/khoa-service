package com.example.khoa_service.service;

import com.example.khoa_service.entity.Khoa;

public interface KhoaService {
    Khoa saveKhoa(Khoa khoa);
    Khoa findKhoaById(long id);
}
