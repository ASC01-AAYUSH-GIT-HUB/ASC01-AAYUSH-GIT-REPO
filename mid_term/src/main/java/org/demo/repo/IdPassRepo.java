package org.demo.repo;

import org.demo.entity.IdPassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdPassRepo extends JpaRepository<IdPassEntity,String> {
}
