package com.votiverp.core.model.attribute.group;

import com.votiverp.core.model.attribute.VotiveAttribute;
import lombok.Builder;
import lombok.Singular;

import java.util.Set;
import java.util.function.Predicate;

public class ConditionGroup extends VotiveGroupAttribute {
    private final Predicate<Character> characterPredicate;

    @Builder
    protected ConditionGroup(String name, @Singular Set<VotiveAttribute> attributes,@Singular Set<VotiveGroupAttribute> groupAttributeSet, Predicate<Character> characterPredicate) {
        super(name, attributes, groupAttributeSet);
        this.characterPredicate = characterPredicate;
    }

    @Override
    public Predicate<Character> getPredicateGiveAttribute() {
        return characterPredicate;
    }
}
