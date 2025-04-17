package io.accelerate.solutions.HLO;

import io.accelerate.runner.SolutionNotImplementedException;

public class HelloSolution {
    
    public String hello(String friendName) {
        return String.format("Hello, %s!", friendName);
    }

    public static void main(String[] args) {
        HelloSolution helloSolution = new HelloSolution();
        System.out.println(helloSolution.hello("jim"));
    }
}


