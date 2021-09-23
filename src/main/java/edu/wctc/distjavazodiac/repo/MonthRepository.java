package edu.wctc.distjavazodiac.repo;

import edu.wctc.distjavazodiac.entity.Month;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MonthRepository extends CrudRepository<Month, Integer>
{

}
