package com.crud_produtos.api.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }

}
