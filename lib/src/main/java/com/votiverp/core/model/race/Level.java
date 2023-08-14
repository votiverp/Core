package com.votiverp.core.model.race;

import com.votiverp.core.model.attribute.VotiveAttribute;
import com.votiverp.core.model.attribute.group.VotiveGroupAttribute;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Level {
    String name;
    VotiveGroupAttribute groupAttribute;
}
