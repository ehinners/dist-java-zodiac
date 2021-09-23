package edu.wctc.distjavazodiac.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.distjavazodiac.entity.Birthday;
import edu.wctc.distjavazodiac.entity.Fortune;
import edu.wctc.distjavazodiac.entity.Horoscope;
import edu.wctc.distjavazodiac.repo.FortuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Service
@Primary
public class SQLRandomHoroscopeService implements HoroscopeService
{
    private FortuneRepository fortuneRepository;
    //private List<Fortune> allFortunes;
    private ZodiacService zodiacService;

    @Autowired
    public SQLRandomHoroscopeService(ZodiacService zodiacService, FortuneRepository fortuneRepository) {
        this.zodiacService = zodiacService;
        this.fortuneRepository = fortuneRepository;
    }

    @Override
    public Horoscope getHoroscope(Birthday birthday)
    {
        List<Fortune> list = new ArrayList<>();
        fortuneRepository.findAll().forEach(list::add);

        String sign;
        if (birthday.getZodiacType().toLowerCase().startsWith("w"))
        {
            sign = zodiacService.getWesternZodiacSign(birthday);
        } else
        {
            sign = zodiacService.getEasternZodiacSign(birthday);
        }

        Horoscope hscope = new Horoscope();
        hscope.setSign(sign);

        //int randomIndex = (int) (Math.random() * allFortunes.size());
        int randomIndex = (int) (Math.random() * list.size());
        hscope.setHoroscope(list.get(randomIndex).getText());
        return hscope;
    }


}
