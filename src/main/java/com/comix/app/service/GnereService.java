package com.comix.app.service;

import com.comix.app.domain.EGnere;
import com.comix.app.dto.DGnere;
import com.comix.app.exception.RegisterNotFoundException;
import com.comix.app.mapper.GnereMapper;
import com.comix.app.repository.GnereRepository;
import com.comix.app.repository.specs.GnereSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GnereService {

    private final GnereRepository repository;
    private final GnereMapper mapper;

    public DGnere save(DGnere dGnere) {
        EGnere eGnere = repository.save(mapper.toEntity(dGnere));
        return mapper.toDto(eGnere);
    }

    public DGnere findById(Long id) {
        EGnere eGnere = repository.findById(id).orElseThrow(() -> new RegisterNotFoundException("User"));
        return mapper.toDto(eGnere);
    }

    public Page<DGnere> list(String description, Pageable pageable) {
        Page<EGnere> page = repository.findAll(GnereSpec.filter(description),pageable);
        return mapper.toDto(page);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }


}
