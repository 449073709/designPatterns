package designpattern.state;

public class StateContext {

    private IState state;
    
    public StateContext(IState state) {
        this.state = state;
    }

    public void execute(){
        this.state.execute(this);
    }

    //get、set
    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
    



}