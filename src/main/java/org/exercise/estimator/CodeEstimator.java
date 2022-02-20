package org.exercise.estimator;

import org.exercise.estimator.domain.Code;
import org.exercise.estimator.engine.CodeProcessor;

import java.util.Scanner;

public class CodeEstimator {
    public static void main(String[] args) {
        CodeProcessor processor = new CodeProcessor();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter File path :");
        if (in.hasNext()) {
            var filePath = in.next();
            Code code = processor.readCode(filePath);

        } else {
            System.out.println("No File mentioned.");
        }
    }
}
