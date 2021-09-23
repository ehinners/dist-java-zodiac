package edu.wctc.distjavazodiac.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.distjavazodiac.entity.Month;
import edu.wctc.distjavazodiac.repo.FortuneRepository;
import edu.wctc.distjavazodiac.repo.MonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Primary
public class SQLMonthListService  implements MonthListService
{

    //private List<Month> monthList;
    private MonthRepository monthRepository;

    @Autowired
    public SQLMonthListService (MonthRepository mr)
    {
        this.monthRepository = mr;
    }

    @Override
    public List<Month> getMonths()
    {
        List<Month> list = new ArrayList<>();
        monthRepository.findAll().forEach(list::add);
        return list;
    }




}
