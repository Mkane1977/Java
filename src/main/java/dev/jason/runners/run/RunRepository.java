package dev.jason.runners.run;

import java.time.LocalDateTime;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;



@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    private void init(){
            runs.add(new Run(1, "Morning Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 4, Location.OUTDOOR));
            runs.add(new Run(2, "Evening Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 4, Location.OUTDOOR));
            runs.add(new Run(3, "Afternoon Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 4, Location.OUTDOOR));
        }



    }


