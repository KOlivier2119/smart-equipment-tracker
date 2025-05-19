package com.kwizera.equipmentmanagement.services;

import com.kwizera.equipmentmanagement.entities.Returns;
import com.kwizera.equipmentmanagement.repository.ReturnsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReturnsServices {
    private final ReturnsRepository returnsRepository;

    public List<Returns> getAllReturns() {
        return returnsRepository.findAll();
    }

    public Returns createReturns(Returns returns) {
        return returnsRepository.save(returns);
    }

    public void deleteById(Long id) {
          returnsRepository.deleteById(id);
    }
}
