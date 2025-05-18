package com.kwizera.equipmentmanagement.services;

import com.kwizera.equipmentmanagement.entities.Requests;
import com.kwizera.equipmentmanagement.repository.RequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RequestServices {
    private final RequestRepository requestRepository;

    public Requests createRequest(Requests requests) {
        return requestRepository.save(requests);
    }

    public void deleteRequest(Long id) {
        requestRepository.deleteById(id);
    }

    public Optional<Requests> getRequestById(Long id) {
        return requestRepository.findById(id);
    }

    public List<Requests> getAllRequests() {
        return requestRepository.findAll();
    }
}
