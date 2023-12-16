package com.comix.app.resource;

import com.comix.app.dto.DWriter;
import com.comix.app.service.WriterService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/writer")
@RequiredArgsConstructor
public class WriterResource {

    private final WriterService service;

    @GetMapping("/{id}")
    public DWriter findById(@PathVariable Long id) {
        return service.findById(id);
    }


    @GetMapping
    public Page<DWriter> list(@RequestParam(value = "name", required = false) String name,
                              @PageableDefault(size = 10, sort = {"id"},direction = Sort.Direction.DESC) Pageable pageable) {
        return service.list(name, pageable);
    }

    @PostMapping
    public DWriter save(@RequestBody DWriter dWriter) {
        return service.save(dWriter);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
