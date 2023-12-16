package com.comix.app.repository.specs;

import com.comix.app.domain.EGnere;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.Objects;

public class GnereSpec extends SpecsUtil {

    public static Specification<EGnere> filter(String description) {
        return (root, query, cb) -> {
            Predicate descriptionPredicate = Objects.nonNull(description)? cb.like(root.get("description"),withSuffixAndPrefix(description)) : cb.conjunction();
            return cb.and(descriptionPredicate);
        };
    }
}
