package org.exercise.estimator.readers;

import org.exercise.estimator.domain.JavaCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class JavaCodeReaderTest {
    private JavaCodeReader codeReader;

    @BeforeEach
    public void setup(){
        codeReader = new JavaCodeReader();
    }

    @Test
    public void can_read_java_code() throws IOException, URISyntaxException {
        URL resource = getClass().getClassLoader().getResource("Test.java");
        JavaCode javaCode = codeReader.read(Files.lines(Paths.get(resource.toURI())));
        assertEquals(3, javaCode.getBlanks());
        assertEquals(3,javaCode.getComments());
        assertEquals(6, javaCode.getLinesOfCode());
        assertEquals(12, javaCode.getTotalLines());
    }
}