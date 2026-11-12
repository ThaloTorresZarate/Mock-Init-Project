package com.softer.mockinitproject.entity.repository;

import com.softer.mockinitproject.entity.Player;

import java.util.List;

public interface IPlayerRepository {
    List<Player> findAll();
    Player findById(Long id);
    void save(Player player);
    void deleteById(Long id);
}
