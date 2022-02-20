package org.exercise.estimator.readers;

import org.exercise.estimator.domain.JavaCode;

import java.util.stream.Stream;

public class JavaCodeReader implements CodeReader {
    @Override
    public JavaCode read(Stream<String> lines) {
        JavaCode code = new JavaCode();
        lines.forEach(line -> {
            if (line.trim().length() < 1)
                code.incrementBlanks();
            else if (line.startsWith("//"))
                code.incrementComments();
            else
                code.incrementLinesOfCode();
            code.incrementTotalLines();
        });
        return code;
    }
}
