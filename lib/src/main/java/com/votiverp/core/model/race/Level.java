package com.votiverp.core.model.race;

import com.votiverp.core.model.attribute.VotiveAttribute;
import com.votiverp.core.model.attribute.group.VotiveGroupAttribute;
import com.votiverp.core.model.skill.Skill;
import lombok.*;

import java.util.Collections;
import java.util.Set;

@Builder
@AllArgsConstructor
@EqualsAndHashCode
public class Level {
    @Getter
    private final String name;
    @Getter
    private final VotiveGroupAttribute groupAttribute;
    @Singular
    private final Set<Skill> skills;

    public Set<Skill> getSkills() {
        return Collections.unmodifiableSet(skills);
    }
}
