package Visitor;

import Visitor.parts.Computer;
import Visitor.parts.visitInterface.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
