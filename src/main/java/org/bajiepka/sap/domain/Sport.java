package org.bajiepka.sap.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Sport {

    BASKETBALL("Basketball"),
    FOOTBALL("Football");

    @Getter
    private final String desctiption;

}
