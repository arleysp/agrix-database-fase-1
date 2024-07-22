package com.betrybe.agrix.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * The type Crop.
 */
@Entity
@Table(name = "crop")
public class Crop {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Double planted_area;

  private Crop() {
  }

  /**
   * Instantiates a new Crop.
   *
   * @param name         the name
   * @param planted_area the planted area
   */
  public Crop(String name, Double planted_area) {
    this.name = name;
    this.planted_area = planted_area;
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets planted area.
   *
   * @return the planted area
   */
  public Double getPlanted_area() {
    return planted_area;
  }

  /**
   * Sets planted area.
   *
   * @param planted_area the planted area
   */
  public void setPlanted_area(Double planted_area) {
    this.planted_area = planted_area;
  }
}
