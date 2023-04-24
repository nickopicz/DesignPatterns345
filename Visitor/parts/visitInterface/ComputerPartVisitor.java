package Visitor.parts.visitInterface;

import Visitor.parts.Computer;
import Visitor.parts.Keyboard;
import Visitor.parts.Monitor;
import Visitor.parts.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
