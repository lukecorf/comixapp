package com.comix.app.mapper;

import com.comix.app.domain.EPublisher;
import com.comix.app.dto.DPublisher;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface PublisherMapper {

    DPublisher toDto(EPublisher ePublisher);
    List<DPublisher> toDto(List<EPublisher> ePublisher);
    EPublisher toEntity(DPublisher dPublisher);
    List<EPublisher> toEntity(List<DPublisher> dPublisher);
    default Page<DPublisher> toDto(Page<EPublisher> ePublishers) {
        return ePublishers.map(this::toDto);
    }

}
