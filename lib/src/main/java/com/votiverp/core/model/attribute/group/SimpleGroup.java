package com.votiverp.core.model.attribute.group;

import com.votiverp.core.model.attribute.VotiveAttribute;
import lombok.Builder;
import lombok.Singular;

import java.util.Set;
import java.util.function.Predicate;

public class SimpleGroup extends VotiveGroupAttribute {
    private static final Predicate<Character> CHARACTER_PREDICATE = (character) -> true;

    @Builder
    public SimpleGroup(String name, @Singular Set<VotiveAttribute> attributes, @Singular Set<VotiveGroupAttribute> groupAttributeSet) {
        super(name, attributes, groupAttributeSet);
    }


    @Override
    public Predicate<Character> getPredicateGiveAttribute() {
        return CHARACTER_PREDICATE;
    }
}
