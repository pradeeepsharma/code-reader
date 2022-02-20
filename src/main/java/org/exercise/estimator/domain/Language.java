package org.exercise.estimator.domain;

import java.util.Arrays;

public enum Language {
    JAVA("java"), C("c"), TYPESCRIPT("ts"), PYTHON("py");
    private final String value;
    private Language(String value){
        this.value = value;
    }
    public static Language find(String val){
        System.out.println("Value to compare :"+val);
        return Arrays.stream(Language.values())
                .filter(lang -> {
                    System.out.println("Language :"+lang+" Value :"+lang.value);
                    System.out.println("Match :"+lang.value.equals(val));
                    return lang.value.equals(val);
                })
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", val)));
    }
}
