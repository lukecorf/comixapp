package com.comix.app.resource;

import com.comix.app.dto.DGnere;
import com.comix.app.service.GnereService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gnere")
@RequiredArgsConstructor
public class GnereResource {

    private final GnereService service;

    @GetMapping("/{id}")
    public DGnere findById(@PathVariable Long id) {
        return service.findById(id);
    }


    @GetMapping
    public Page<DGnere> list(@RequestParam(value = "description", required = false) String description,
                             @PageableDefault(size = 10, sort = {"id"},direction = Sort.Direction.DESC) Pageable pageable) {
        return service.list(description, pageable);
    }

    @PostMapping
    public DGnere save(@RequestBody DGnere dGnere) {
        return service.save(dGnere);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
