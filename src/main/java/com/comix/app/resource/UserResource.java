package com.comix.app.resource;

import com.comix.app.dto.DUser;
import com.comix.app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserResource {

    private final UserService service;

    @GetMapping("/{id}")
    public DUser findById(@PathVariable Long id) {
        return service.findById(id);
    }


    @GetMapping
    public Page<DUser> findById(@RequestParam(value = "name", required = false) String name,
                                @RequestParam(value = "nickname", required = false) String nickname,
                                @PageableDefault(size = 10, sort = {"id"},direction = Sort.Direction.DESC) Pageable pageable) {
        return service.list(name, nickname, pageable);
    }

    @PostMapping
    public DUser save(@RequestBody DUser dUser) {
        return service.save(dUser);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}

