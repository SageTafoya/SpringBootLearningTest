package dev.tafoya.springtest.run;

import java.time.LocalDateTime;

//run record where we can create different instances of
public record Run
(
    Integer id,
    String title,
    LocalDateTime startedOn,
    LocalDateTime completedOn,
    Integer miles,
    Location location
){}

//public class Run
//{
//
//}
