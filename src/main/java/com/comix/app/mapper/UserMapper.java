package com.comix.app.mapper;

import com.comix.app.domain.EUser;
import com.comix.app.dto.DUser;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface UserMapper {

    DUser toDto(EUser eUser);
    List<DUser> toDto(List<EUser> eUser);
    EUser toEntity(DUser eUser);
    List<EUser> toEntity(List<DUser> eUser);
    default Page<DUser> toDto(Page<EUser> eUsers) {
        return eUsers.map(this::toDto);
    }

}
