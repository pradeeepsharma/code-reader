package org.exercise.estimator.engine;

import org.exercise.estimator.readers.CodeReader;
import org.exercise.estimator.readers.JavaCodeReader;
import org.exercise.estimator.readers.PythonCodeReader;
import org.exercise.estimator.readers.TypeScriptCodeReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CodeReaderFactoryTest {
    private CodeReaderFactory factory;
    private static final String JAVA_FILE= "D:\\java_workspace\\login-service\\src\\main\\java\\com\\learning\\microservices\\loginservice\\LoginServiceApplication.java";
    private static final String PYTHON_FILE= "D:\\java_workspace\\login-service\\src\\main\\java\\com\\learning\\microservices\\loginservice\\LoginServiceApplication.py";
    private static final String TS_FILE= "D:\\java_workspace\\login-service\\src\\main\\java\\com\\learning\\microservices\\loginservice\\LoginServiceApplication.ts";


    @BeforeEach
    public void setup(){
        factory = new CodeReaderFactory();
    }

    @Test
    void can_get_Java_Code_Reader() {
        CodeReader codeReader = factory.getCodeReader(JAVA_FILE);
        assertTrue(codeReader instanceof JavaCodeReader);
    }

    @Test
    void can_get_Python_Code_Reader() {
        CodeReader codeReader = factory.getCodeReader(PYTHON_FILE);
        assertTrue(codeReader instanceof PythonCodeReader);
    }

    @Test
    void can_get_TS_Code_Reader() {
        CodeReader codeReader = factory.getCodeReader(TS_FILE);
        assertTrue(codeReader instanceof TypeScriptCodeReader);
    }
}