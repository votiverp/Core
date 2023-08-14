package com.votiverp.core.model.language;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
public class Language {
    @Getter
    private final String name;
    private final Set<Dialect> dialects;

    private final Multimap<Dialect, Dialect> dissimilarDialects = MultimapBuilder.hashKeys().hashSetValues().build();

    @Getter
    public class Dialect {
        private final Language language;
        private final String name;

        public Dialect(String name) {
            this.language = Language.this;
            this.name = name;
        }

        public boolean isSimilarDialect(Dialect dialect) {
            return Language.this.isSimilarDialects(this, dialect);
        }

        public boolean isDissimilarDialect(Dialect dialect) {
            return Language.this.isDissimilarDialects(this, dialect);
        }
    }

    public Set<Dialect> getDialects() {
        return Collections.unmodifiableSet(dialects);
    }

    public boolean isSimilarDialects(Dialect dialect1, Dialect dialect2) {
        return !dissimilarDialects.containsEntry(dialect1, dialect2);
    }

    public boolean isDissimilarDialects(Dialect dialect1, Dialect dialect2) {
        return dissimilarDialects.containsEntry(dialect1, dialect2);
    }

    public Set<Dialect> gelAllSimilarDialects(Dialect dialect) {
        if (dissimilarDialects.containsKey(dialect))
            return dialects.stream()
                    .filter(dialect1 -> dialect1.isSimilarDialect(dialect))
                    .collect(Collectors.toUnmodifiableSet());
        else
            return dialects;

    }

    public Set<Dialect> gelAllDissimilarDialects(Dialect dialect) {
        return dissimilarDialects.get(dialect).stream()
                .collect(Collectors.toUnmodifiableSet());
    }


}
