package edu.iu.jamundy.C322Final.service;

import edu.iu.jamundy.C322Final.model.Flower;
import edu.iu.jamundy.C322Final.repository.FlowerRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class FlowerService {
    FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public void addFlower(String username, String flowerName, int flowerPicNum, String firstName, String lastName, String relationship, String address, String city, String state, String zip, String date, String aptOrSuite, int cost) {
        flowerRepository.save(new Flower(username,flowerName, flowerPicNum, firstName, lastName, relationship, address, city, state, zip, date, aptOrSuite, cost));
    }

    public void addFlower(String username,  String flowerName, int flowerPicNum, String firstName, String lastName, String relationship, String address, String city, String state, String zip, String date, int cost) {
        flowerRepository.save(new Flower(username,flowerName,flowerPicNum,firstName, lastName, relationship, address, city, state, zip, date, cost));
    }

    public List<Flower> getFlowersByUsername(String username) {
        return flowerRepository.findByUsername(username);
    }

    public void deleteFlower(Long id) {
        flowerRepository.deleteById(id);
    }

    public List<Flower> getAllFlowers() {
        return (List<Flower>) flowerRepository.findAll();
    }
}
