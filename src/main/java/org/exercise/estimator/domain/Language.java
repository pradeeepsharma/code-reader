package org.exercise.estimator.domain;

import java.util.Arrays;

public enum Language {
    JAVA("java"), C("c"), TYPESCRIPT("ts"), PYTHON("py");
    private final String value;
    private Language(String value){
        this.value = value;
    }
    public static Language find(String val){
        return Arrays.stream(Language.values())
                .filter(lang -> lang.value.equals(val))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", val)));
    }
}
