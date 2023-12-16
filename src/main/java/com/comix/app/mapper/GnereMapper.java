package com.comix.app.mapper;

import com.comix.app.domain.EGnere;
import com.comix.app.dto.DGnere;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface GnereMapper {

    DGnere toDto(EGnere eGnere);
    List<DGnere> toDto(List<EGnere> eGnere);
    EGnere toEntity(DGnere dGnere);
    List<EGnere> toEntity(List<DGnere> dGnere);
    default Page<DGnere> toDto(Page<EGnere> eGneres) {
        return eGneres.map(this::toDto);
    }

}
