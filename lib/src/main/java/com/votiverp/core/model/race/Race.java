package com.votiverp.core.model.race;

import com.votiverp.core.model.attribute.group.VotiveGroupAttribute;
import com.votiverp.core.model.skill.Skill;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Singular;

import java.util.*;

@Builder
@EqualsAndHashCode
public class Race {
    private final String name;

    private final String description;

    @Singular
    private final List<Level> levels;

    private final VotiveGroupAttribute groupAttribute;
    @Singular
    private final Set<Skill> skills;

    public List<Level> getLevels() {
        return Collections.unmodifiableList(levels);
    }

    public Set<Skill> getSkills() {
        return Collections.unmodifiableSet(skills);
    }
}
