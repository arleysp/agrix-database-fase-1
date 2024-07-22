package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.entity.Crop;

public record CropCreationDto(String name, Double plantedArea) {

  public Crop toEntity() {
    return new Crop(name, plantedArea);
  }
}
