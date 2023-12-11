package Strategy;

import java.util.List;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Do Tran Van Anh 22024530.
     */
    public void sortStrategy(List<Integer> list) {
        strategy.sort(list);
    }
}
