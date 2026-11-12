package com.softer.mockinitproject;

import com.softer.mockinitproject.entity.repository.PlayerRepositoryImpl;
import com.softer.mockinitproject.service.PlayerServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MockInitProjectApplication {

    public static void main(String[] args) {
        /*PlayerRepositoryImpl playerRepository = new PlayerRepositoryImpl();
        PlayerServiceImpl playerService = new PlayerServiceImpl(playerRepository);

        System.out.println(playerService.findAll());+/
        //System.out.println(playerService.findById(1L));
        /*playerService.deleteById(1L);
        System.out.println(playerService.findAll());*/

       /*Player player = new Player(7L, "Luis Díaz", "Bayern Munich", "Delantero");
       playerService.save(player);
       System.out.println(playerService.findAll());*/


    }

}
