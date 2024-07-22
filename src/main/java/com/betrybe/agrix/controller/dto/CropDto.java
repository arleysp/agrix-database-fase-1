package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.entity.Crop;

public record CropDto(Long id, String name, Double plantedArea, Long farmId) {

  public static CropDto fromEntity(Crop crop) {
    return new CropDto(
        crop.getId(),
        crop.getName(),
        crop.getPlantedArea(),
        crop.getFarm().getId()
    );
  }
}
