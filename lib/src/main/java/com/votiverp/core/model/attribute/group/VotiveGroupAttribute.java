package com.votiverp.core.model.attribute.group;

import com.votiverp.core.model.attribute.VotiveAttribute;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.bukkit.entity.Player;

import java.util.Set;
import java.util.function.Predicate;

@Getter
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class VotiveGroupAttribute {
    protected final String name;
    protected final Set<VotiveAttribute> attributes;
    protected final Set<VotiveGroupAttribute> groupAttributeSet;

    public abstract Predicate<Character> getPredicateGiveAttribute();

}
