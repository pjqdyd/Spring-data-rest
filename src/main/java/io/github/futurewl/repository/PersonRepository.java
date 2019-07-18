package io.github.futurewl.repository;

import io.github.futurewl.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    @RestResource
    Person findByName(String name);

}
