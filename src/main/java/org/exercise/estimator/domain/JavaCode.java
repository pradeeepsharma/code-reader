package org.exercise.estimator.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
public class JavaCode extends Code{
    private int imports;
    private List<Variable> variables;

    @Override
    public String toString() {
        return "JavaCode{" +
                "imports=" + imports +
                ", variables=" + variables +
                ", Code="+super.toString()+
                '}';
    }
}
