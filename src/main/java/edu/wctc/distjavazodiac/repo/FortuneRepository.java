package edu.wctc.distjavazodiac.repo;

import edu.wctc.distjavazodiac.entity.Fortune;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface FortuneRepository extends CrudRepository<Fortune, Integer>
{
}
