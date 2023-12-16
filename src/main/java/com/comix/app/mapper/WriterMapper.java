package com.comix.app.mapper;

import com.comix.app.domain.EWriter;
import com.comix.app.dto.DWriter;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface WriterMapper {

    DWriter toDto(EWriter eWriter);
    List<DWriter> toDto(List<EWriter> eWriter);
    EWriter toEntity(DWriter dWriter);
    List<EWriter> toEntity(List<DWriter> dWriter);
    default Page<DWriter> toDto(Page<EWriter> eWriters) {
        return eWriters.map(this::toDto);
    }
    
}
