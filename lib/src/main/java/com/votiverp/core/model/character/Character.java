package com.votiverp.core.model.character;

import com.votiverp.core.model.attribute.group.VotiveGroupAttribute;
import com.votiverp.core.model.language.Language;
import com.votiverp.core.model.race.Race;
import com.votiverp.core.model.religion.Religion;
import com.votiverp.core.model.skill.Skill;
import com.votiverp.core.world.FlorianCalendar;
import com.votiverp.core.world.FlorianDate;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Set;

@Builder
public class Character {
    @Getter
    private final OfflinePlayer offlinePlayer;
    @Getter
    private final FlorianDate birthDay;
    @Getter
    private final String name;
    @Getter
    @Builder.Default
    private final String biography = "";
    @Getter
    @Builder.Default
    private final String decstiption = "";
    @Singular
    private final Set<Skill> skills;
    @Getter
    private final Race race;
    @Getter
    private Religion religion;
    private VotiveGroupAttribute mainAttributes;
    @Getter
    private final Language mainLanguage;
    @Singular
    private final Set<Language> additionalLanguages;

    public boolean isOnline() {
        return offlinePlayer.isOnline();
    }

    @Nullable
    public Player getPlayer() {
        return offlinePlayer.getPlayer();
    }

    public int getYearAge() {
        return FlorianCalendar.getCurrentDate().getYear() - birthDay.getYear();
    }

    public Set<Skill> getSkills() {
        return Collections.unmodifiableSet(skills);
    }

    public Set<Language> getAdditionalLanguages() {
        return Collections.unmodifiableSet(additionalLanguages);
    }


}
