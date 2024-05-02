package edu.iu.jamundy.C322Final.controllers;


import edu.iu.jamundy.C322Final.model.Flower;
import edu.iu.jamundy.C322Final.service.FlowerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FlowerController {
    FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/allFlowers")
    public List<Flower> getAllFlowers() {
        try {
            return flowerService.getAllFlowers();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers(@RequestParam String username) {
        try {
            return flowerService.getFlowersByUsername(username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/flowers")
    public void addFlower(@RequestBody List<Flower> flowers) {
        try {
            System.out.println(flowers);
            for (Flower flower : flowers) {
                if (flower.getAptOrSuite() == null) {
                    flowerService.addFlower(flower.getUsername(), flower.getFlowerName(), flower.getFlowerPicNum(), flower.getFirstName(), flower.getLastName(),
                            flower.getRelationship(), flower.getAddress(), flower.getCity(), flower.getState(), flower.getZip(), flower.getDate(), flower.getCost());
                } else {
                    flowerService.addFlower(flower.getUsername(), flower.getFlowerName(), flower.getFlowerPicNum(), flower.getFirstName(), flower.getLastName(), flower.getRelationship(),
                            flower.getAddress(), flower.getCity(), flower.getState(), flower.getZip(), flower.getDate(), flower.getAptOrSuite(), flower.getCost());
                }
            }
        } catch (Exception e) {
            System.out.println(flowers);
            throw new RuntimeException(e);
        }
    }
}
