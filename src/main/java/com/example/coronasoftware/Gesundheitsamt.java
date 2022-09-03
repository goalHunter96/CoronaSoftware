package com.example.coronasoftware;

import java.time.LocalDateTime;
import java.util.Date;

public class Gesundheitsamt {
    private Testperson testperson;
    private int probenID;
    private Buergertest resultate;
    private LocalDateTime zeitStempel;

    public int getProbenID() {
        return probenID;
    }

    public Buergertest getResultate() {
        return resultate;
    }


}
