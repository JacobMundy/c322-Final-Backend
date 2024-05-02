package edu.iu.jamundy.C322Final.model;


import jakarta.persistence.*;

@Entity
@Table(schema = "customers")
public final class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String username;
    private String flowerName;
    private int flowerPicNum;
    private String firstName;
    private String lastName;
    private String relationship;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String date;
    private String aptOrSuite;
    int cost;

    public Flower() {
    }

    public Flower(String username) {
        this.username = username;
    }

    public Flower(String username, String flowerName, int flowerPicNum, String firstName, String lastName, String relationship, String address, String city, String state, String zip, String date,String aptOrSuite, int cost) {
        this.username = username;
        this.flowerName = flowerName;
        this.flowerPicNum = flowerPicNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationship = relationship;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.date = date;
        this.aptOrSuite = aptOrSuite;
        this.cost = cost;
    }

    public Flower(String username, String flowerName, int flowerPicNum, String firstName, String lastName, String relationship, String address, String city, String state, String zip, String date, int cost) {
        this.username = username;
        this.flowerName = flowerName;
        this.flowerPicNum = flowerPicNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationship = relationship;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.date = date;
        this.aptOrSuite = "";
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getFlowerPicNum() {
        return flowerPicNum;
    }

    public void setFlowerPicNum(int flowerPicNum) {
        this.flowerPicNum = flowerPicNum;
    }

    public Flower (String username, String flowerName, String firstName, String lastName, String relationship, String address, String city, String state, String zip, String date, String aptOrSuite) {
        this.username = username;
        this.flowerName = flowerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationship = relationship;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.date = date;
        this.aptOrSuite = aptOrSuite;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAptOrSuite() {
        return aptOrSuite;
    }

    public void setAptOrSuite(String aptOrSuite) {
        this.aptOrSuite = aptOrSuite;
    }
}
