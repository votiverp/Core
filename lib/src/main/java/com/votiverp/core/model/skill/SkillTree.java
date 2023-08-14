package com.votiverp.core.model.skill;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Set;

@EqualsAndHashCode
public class SkillTree {
    private SkillNode firstSkillNode;

    @EqualsAndHashCode
    public class SkillNode {
        @Getter
        private final SkillTree skillTree = SkillTree.this;
        private final Set<SkillNode> nextSkillNodes;

        public SkillNode(Set<SkillNode> nextSkillNodes) {
            this.nextSkillNodes = Set.of(nextSkillNodes.toArray(SkillNode[]::new));
        }
        public Set<SkillNode> getNext() {
            return nextSkillNodes;
        }
    }
}
