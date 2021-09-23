package edu.wctc.distjavazodiac;

import edu.wctc.distjavazodiac.repo.FortuneRepository;
import edu.wctc.distjavazodiac.repo.MonthRepository;
import edu.wctc.distjavazodiac.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan("edu.wctc.distjavazodiac")
public class AppConfig
{



    @Bean
    public HoroscopeService horoscopeService()
    {
        return new SQLRandomHoroscopeService(zodiacService(), /*FortuneRepositoryHere*/);
        //return new RandomHoroscopeService();
    }

    @Bean
    public MonthListService monthListService()
    {
        return new SQLMonthListService(/*MonthRepositoryHere*/);
        //return new BasicMonthListService();
    }

    @Bean
    public ZodiacService zodiacService()
    {
        return new SimpleZodiacService();
    }
}