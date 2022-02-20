package org.exercise.estimator.domain;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Code {
    private Language language;
    private int linesOfCode;
    private int blanks;
    private int comments;
    private int totalLines;
    public void incrementLinesOfCode(){
        this.linesOfCode++;
    }
    public void incrementBlanks(){
        this.blanks++;
    }
    public void incrementComments(){
        this.comments++;
    }
    public void incrementTotalLines(){
        this.totalLines++;
    }
}
