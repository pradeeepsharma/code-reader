package org.exercise.estimator.engine;

import org.exercise.estimator.domain.Code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CodeProcessor {
    private CodeReaderFactory factory = new CodeReaderFactory();

    public Code readCode(String filePath) {
        Stream<String> lines = null;
        Code code = null;
        try {
            lines = Files.lines(Paths.get(filePath)).sequential();
            code = factory.getCodeReader(filePath).read(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Code has following parameters :" + code);
        return code;
    }
}
