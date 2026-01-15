package Sdate.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant); //zulu time
        System.out.println(LocalDateTime.now());
    }
}
