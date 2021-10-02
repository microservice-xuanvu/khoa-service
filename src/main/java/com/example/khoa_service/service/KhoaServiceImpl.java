package com.example.khoa_service.service;

import com.example.khoa_service.entity.Khoa;
import com.example.khoa_service.repository.KhoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhoaServiceImpl implements KhoaService {
    @Autowired
    private KhoaRepository khoaRepository;

    @Override
    public Khoa saveKhoa(Khoa khoa) {
        return khoaRepository.save(khoa);
    }

    @Override
    public Khoa findKhoaById(long id) {
        return khoaRepository.findById(id).get();
    }
}
