package com.ApacheKafkaProducer.Model;

public class Player{

    private Integer id;
    private String name;
    private Team team;

    public Player(Integer id, String name, Team team) {
        this.id = id;
        this.name = name;
        this.team = team;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
