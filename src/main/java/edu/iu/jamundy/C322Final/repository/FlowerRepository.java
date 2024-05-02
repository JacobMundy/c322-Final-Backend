package edu.iu.jamundy.C322Final.repository;

import edu.iu.jamundy.C322Final.model.Flower;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlowerRepository extends CrudRepository<Flower, Long> {
    Flower findByFirstName(String firstName);
    Flower findByLastName(String lastName);
    Flower findByRelationship(String relationship);
    Flower findByAddress(String Address);
    Flower findByCity(String city);
    Flower findByState(String state);
    Flower findByZip(String zip);
    List<Flower> findByUsername(String username);

    Object findAll(Example<Flower> example);
}
