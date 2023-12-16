package com.comix.app.service;

import com.comix.app.domain.EPublisher;
import com.comix.app.dto.DPublisher;
import com.comix.app.exception.RegisterNotFoundException;
import com.comix.app.mapper.PublisherMapper;
import com.comix.app.repository.PublisherRepository;
import com.comix.app.repository.specs.PublisherSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublisherService {

    private final PublisherRepository repository;
    private final PublisherMapper mapper;

    public DPublisher save(DPublisher dPublisher) {
        EPublisher ePublisher = repository.save(mapper.toEntity(dPublisher));
        return mapper.toDto(ePublisher);
    }

    public DPublisher findById(Long id) {
        EPublisher ePublisher = repository.findById(id).orElseThrow(() -> new RegisterNotFoundException("User"));
        return mapper.toDto(ePublisher);
    }

    public Page<DPublisher> list(String name, Pageable pageable) {
        Page<EPublisher> page = repository.findAll(PublisherSpec.filter(name),pageable);
        return mapper.toDto(page);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
