package com.javaproject.beans;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class BoardGame {

    private Long id;
    private String name;
    private int level;
    private int minPlayers;
    private String maxPlayers;
    private String gameType;

    private List<Review> reviews;

    

}
