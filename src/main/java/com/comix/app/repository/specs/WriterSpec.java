package com.comix.app.repository.specs;

import com.comix.app.domain.EWriter;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.Objects;

public class WriterSpec extends SpecsUtil {

    public static Specification<EWriter> filter(String name) {
        return (root, query, cb) -> {
            Predicate namePredicate = Objects.nonNull(name)? cb.like(root.get("name"),withSuffixAndPrefix(name)) : cb.conjunction();
            return cb.and(namePredicate);
        };
    }
}
