package com.votiverp.core.model.race;

import lombok.Builder;
import lombok.Singular;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Race {
    private final String name;

    private final String description;

    @Singular
    private final SortedSet<Level> levels;

    @Builder
    public Race(String name, String description, @Singular SortedSet<Level> levels) {
        this.name = name;
        this.description = description;
        this.levels = levels;
    }
}
