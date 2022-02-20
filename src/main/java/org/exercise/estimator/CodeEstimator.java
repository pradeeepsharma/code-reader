package org.exercise.estimator;

import org.exercise.estimator.domain.Code;
import org.exercise.estimator.engine.CodeReaderFactory;
import org.exercise.estimator.readers.CodeReader;
import org.exercise.estimator.readers.JavaCodeReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class CodeEstimator {
    public static void main(String[] args) {
        CodeReaderFactory factory = new CodeReaderFactory();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter File path :");
        if (in.hasNext()) {
            try {
                var filePath = in.next();
                Stream<String> lines = Files.lines(Paths.get(filePath)).sequential();
                Code code = factory.getCodeReader(filePath).read(lines);
                System.out.println("Code has following parameters :"+code);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("No File mentioned.");
        }
    }
}
