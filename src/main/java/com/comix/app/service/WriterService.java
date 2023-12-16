package com.comix.app.service;

import com.comix.app.domain.EWriter;
import com.comix.app.dto.DWriter;
import com.comix.app.exception.RegisterNotFoundException;
import com.comix.app.mapper.WriterMapper;
import com.comix.app.repository.WriterRepository;
import com.comix.app.repository.specs.WriterSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WriterService {

    private final WriterRepository repository;
    private final WriterMapper mapper;

    public DWriter save(DWriter dWriter) {
        EWriter eWriter = repository.save(mapper.toEntity(dWriter));
        return mapper.toDto(eWriter);
    }

    public DWriter findById(Long id) {
        EWriter eWriter = repository.findById(id).orElseThrow(() -> new RegisterNotFoundException("User"));
        return mapper.toDto(eWriter);
    }

    public Page<DWriter> list(String name, Pageable pageable) {
        Page<EWriter> page = repository.findAll(WriterSpec.filter(name),pageable);
        return mapper.toDto(page);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
