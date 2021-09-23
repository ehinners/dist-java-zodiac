package edu.wctc.distjavazodiac;

import edu.wctc.distjavazodiac.repo.FortuneRepository;
import edu.wctc.distjavazodiac.repo.MonthRepository;
import edu.wctc.distjavazodiac.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configuration
@EnableJpaRepositories
@ComponentScan("edu.wctc.distjavazodiac")
public class AppConfig
{

    // This isn't needed because both SQLMonthListService and SQLRandomHoroscopeService both are labeled as @Primary
    // If they weren't then some form of config is needed, although what's been commented out below doesn't work
    /*@Bean
    public HoroscopeService horoscopeService()
    {
        return new SQLRandomHoroscopeService(zodiacService(), *//*FortuneRepositoryHere*//*);
        //return new RandomHoroscopeService();
    }

    @Bean
    public MonthListService monthListService()
    {

        return new SQLMonthListService(*//*MonthRepositoryHere*//*);
        //return new BasicMonthListService();
    }

    @Bean
    public ZodiacService zodiacService()
    {
        return new SimpleZodiacService();
    }*/
}