package com.miBanco.domain;

public class OverDraftException extends Exception{
private final double deficit;
    
    public OverDraftException(String msg, double deficit) {
        super(msg);
        this.deficit = deficit;
    }
    
    public double getDeficit() {
        return deficit;
    }
}
