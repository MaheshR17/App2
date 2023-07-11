package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Id;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IdRepository extends JpaRepository<Id, Long> {
}
