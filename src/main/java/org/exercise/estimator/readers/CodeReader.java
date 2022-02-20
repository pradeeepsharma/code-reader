package org.exercise.estimator.readers;

import org.exercise.estimator.domain.Code;

import java.util.stream.Stream;

public interface CodeReader {
    Code read(Stream<String> lines);
}
