package ir.maktab.data.entity.BuildingFacilities;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
public class SubBuildingFacilities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double price;
    private String name;
    private String comment;
    @ManyToOne
    @JoinColumn(name="building_facilities", nullable=false)
    private BuildingFacilities buildingFacilities;

    public SubBuildingFacilities() {
    }

    public SubBuildingFacilities( String name,  Double price, String comment) {
        this.price = price;
        this.name = name;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public SubBuildingFacilities setId(Integer id) {
        this.id = id;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public SubBuildingFacilities setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getName() {
        return name;
    }

    public SubBuildingFacilities setName(String name) {
        this.name = name;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public SubBuildingFacilities setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public BuildingFacilities getBuildingFacilities() {
        return buildingFacilities;
    }

    public SubBuildingFacilities setBuildingFacilities(BuildingFacilities buildingFacilities) {
        this.buildingFacilities = buildingFacilities;
        return this;
    }
}
