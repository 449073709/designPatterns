package designpattern.state;

/**
 * 状态模式
 *
 * 定义：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 */
public class StateClient {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext(new WalkState());
        stateContext.execute();
        stateContext.execute();
        stateContext.execute();
        stateContext.execute();
        stateContext.execute();
    }
}