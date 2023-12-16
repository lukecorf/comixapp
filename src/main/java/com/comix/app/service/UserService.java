package com.comix.app.service;

import com.comix.app.domain.EUser;
import com.comix.app.dto.DUser;
import com.comix.app.exception.RegisterNotFoundException;
import com.comix.app.mapper.UserMapper;
import com.comix.app.repository.UserRepository;
import com.comix.app.repository.specs.UserSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public DUser save(DUser dUser) {
        EUser eUser = repository.save(mapper.toEntity(dUser));
        return mapper.toDto(eUser);
    }

    public DUser findById(Long id) {
        EUser eUser = repository.findById(id).orElseThrow(() -> new RegisterNotFoundException("User"));
        return mapper.toDto(eUser);
    }

    public Page<DUser> list(String name, String nickname, Pageable pageable) {
        Page<EUser> page = repository.findAll(UserSpec.filter(name, nickname),pageable);
        return mapper.toDto(page);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
