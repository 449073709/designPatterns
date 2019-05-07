package designpattern.visitor;

public interface Visitable {
    void accept(Visitor visitor);
}

//
class Body implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

//
class Engine implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

//
class Wheel implements Visitable {
    private String name;

    Wheel(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

//
class Car implements Visitable {
    private Engine engine = new Engine();
    private Body body = new Body();
    private Wheel[] wheels = {new Wheel("front left"),
            new Wheel("front right"),
            new Wheel("back left"),
            new Wheel("back right")};

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        engine.accept(visitor);
        body.accept(visitor);
        for (int i = 0; i < wheels.length; ++i)
            wheels[i].accept(visitor);
    }
}

