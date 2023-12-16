package com.comix.app.repository.specs;

import com.comix.app.domain.EUser;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.Objects;

public class UserSpec extends SpecsUtil {

    public static Specification<EUser> filter(String name, String nickname) {
        return (root, query, cb) -> {
            Predicate namePredicate = Objects.nonNull(name)? cb.like(root.get("name"),withSuffixAndPrefix(name)) : cb.conjunction();
            Predicate nicknamePredicate = Objects.nonNull(nickname)? cb.like(root.get("nickname"),withSuffixAndPrefix(nickname)) : cb.conjunction();
            return cb.and(namePredicate, nicknamePredicate);
        };
    }
}
