package com.ApacheKafkaProducer.Service;

import com.ApacheKafkaProducer.Model.Player;
import com.ApacheKafkaProducer.Model.Team;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PlayerService {

    private List<Player> players = new ArrayList<>();

    AtomicInteger id = new AtomicInteger(0);

    public List<Player> findAll() {
        return players;
    }

    public Optional<Player> findOne(Integer id) {
        return players.stream().filter(player -> player.getId().equals(id)).findFirst();
    }

    public Player create(String name, Team team) {
        Player player = new Player(id.incrementAndGet(), name, team);
        players.add(player);
        return player;
    }

    public Player deletePlayer(Integer id) {
        Player player = players.stream().filter(c -> c.getId().equals(id)).findFirst().orElseThrow(IllegalArgumentException::new);
        players.remove(player);
        return player;
    }

    public Player updatePlayer(Integer id, String name, Team team) {

        Player updatedPlayer = new Player(id, name, team);
        Optional<Player> player = players.stream().filter(player1 -> player1.getId().equals(id)).findFirst();
        if (player.isPresent()) {
            Player pl = player.get();
            int index = players.indexOf(pl);
            players.set(index, updatedPlayer);
         ;

        } else {
            throw new IllegalArgumentException("Invalid Player");
        }
        return updatedPlayer;
    }

    public List<String> playerNames(){
        List<String> result = new ArrayList<>();
        players.forEach(player -> result.add(player.getName()));
        return result;
    }

    @PostConstruct
    private void init(){

        players.add(new Player(id.incrementAndGet(),"Dhoni", Team.CSK));
        players.add(new Player(id.incrementAndGet(),"Rohiy", Team.MI));
        players.add(new Player(id.incrementAndGet(),"Virat", Team.DC));
        players.add(new Player(id.incrementAndGet(),"Sachin", Team.MI));
        players.add(new Player(id.incrementAndGet(),"Suresh", Team.DC));

    }


}
