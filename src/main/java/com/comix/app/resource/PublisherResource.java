package com.comix.app.resource;

import com.comix.app.dto.DPublisher;
import com.comix.app.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publisher")
@RequiredArgsConstructor
public class PublisherResource {

    private final PublisherService service;

    @GetMapping("/{id}")
    public DPublisher findById(@PathVariable Long id) {
        return service.findById(id);
    }


    @GetMapping
    public Page<DPublisher> list(@RequestParam(value = "name", required = false) String name,
                                 @PageableDefault(size = 10, sort = {"id"},direction = Sort.Direction.DESC) Pageable pageable) {
        return service.list(name, pageable);
    }

    @PostMapping
    public DPublisher save(@RequestBody DPublisher dPublisher) {
        return service.save(dPublisher);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
