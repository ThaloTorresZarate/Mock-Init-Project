package persistence.entity.service;

import persistence.entity.Player;
import persistence.entity.repository.PlayerRepositoryImpl;

import java.util.List;

public class PlayerServiceImpl implements IPlayerService{

    private PlayerRepositoryImpl playerRepository;

    public PlayerServiceImpl(PlayerRepositoryImpl playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> findAll() {
        return List.of();
    }

    @Override
    public Player findById(Long id) {
        return null;
    }

    @Override
    public void save(Player player) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
