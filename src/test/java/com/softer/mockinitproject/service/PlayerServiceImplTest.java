package com.softer.mockinitproject.service;

import com.softer.mockinitproject.DataProvider;
import com.softer.mockinitproject.entity.Player;
import com.softer.mockinitproject.entity.repository.PlayerRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerServiceImplTest {

    @Test
    public void testFindAll(){
        PlayerRepositoryImpl playerRepository = Mockito.mock(PlayerRepositoryImpl.class);
        PlayerServiceImpl playerService = new PlayerServiceImpl(playerRepository);


        Mockito.when(playerRepository.findAll()).thenReturn(DataProvider.playerListMock());
        List<Player> result = playerService.findAll();

        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals("Lionel Messi", result.get(0).getName());
        assertEquals("Inter Miami", result.get(0).getTeam());
        assertEquals("Delantero", result.get(0).getPosition());
    }
}
