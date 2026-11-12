package persistence.entity.repository;

import persistence.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepositoryImpl implements IPlayerRepository{

    private List<Player> playerDatabase = new ArrayList<>(List.of(
            new Player(1L, "Lionel Messi", "Inter Miami", "Delantero"),
            new Player(2L, "Cristiano Ronaldo", "Al Nassr", "Delantero"),
            new Player(3L, "Neymar Jr.", "Paris Saint-Germain", "Delantero"),
            new Player(4L, "Kylian Mbappé", "Paris Saint-Germain", "Delantero"),
            new Player(5L, "Kevin De Bruyne", "Manchester City", "Volante"),
            new Player(6L, "Virgil van Dijk", "Liverpool", "Defensa")
    ));

    @Override
    public List<Player> findAll() {
        System.out.println(" --> Método findAll real!!");
        return this.findAll();
    }

    @Override
    public Player findById(Long id) {
        System.out.println(" --> Método findById real!!");
        return this.playerDatabase.stream()
                .filter(player -> id.equals(player.getId()))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public void save(Player player) {
        System.out.println(" --> Método save real!!");
        this.playerDatabase.add(player);
    }

    @Override
    public void deleteById(Long id) {
        System.out.println(" --> Método deleteById real!!");
        this.playerDatabase = this.playerDatabase.stream()
                .filter( player -> !id.equals(player.getId()))
                .toList();
    }
}
