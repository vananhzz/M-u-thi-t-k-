package Strategy;

import java.util.List;

public class BubbleSort implements Strategy {

    /**
     * Do Tran Van Anh 22024530.
     */
    @Override
    public void sort(List<Integer> list) {
        System.out.print("bubble bort: ");
        for (int i = 0; i < list.size() - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
