package com.votiverp.core.model.attribute;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class VotiveAttribute {
    private final String name;
    private final String value;
}
