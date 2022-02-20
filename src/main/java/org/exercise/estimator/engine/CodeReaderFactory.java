package org.exercise.estimator.engine;

import org.exercise.estimator.domain.Language;
import org.exercise.estimator.readers.CodeReader;
import org.exercise.estimator.readers.JavaCodeReader;
import org.exercise.estimator.readers.PythonCodeReader;
import org.exercise.estimator.readers.TypeScriptCodeReader;

import java.util.Optional;

public class CodeReaderFactory {
    private CodeReader codeReader;

    public CodeReader getCodeReader(String fileName) {
        var language = getLanguageFromFileName(fileName);
        switch (language) {
            case JAVA:
                codeReader = new JavaCodeReader();
                break;
            case PYTHON:
                codeReader = new PythonCodeReader();
                break;
            case TYPESCRIPT:
                codeReader = new TypeScriptCodeReader();
                break;
        }
        return codeReader;
    }

    private Language getLanguageFromFileName(String fileName) {
        return Optional.ofNullable(fileName)
                .filter(f -> f.contains("."))
                .map(f -> f.substring(fileName.lastIndexOf(".")+1))
                .map(Language::find)
                .get();
    }
}
