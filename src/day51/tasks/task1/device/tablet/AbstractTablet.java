package day51.tasks.task1.device.tablet;

import day51.tasks.task1.device.Product;

public abstract class AbstractTablet implements Product {
    private boolean pen;

    public boolean hasPen() {
        return pen;
    }

    public void setPen(boolean pen) {
        this.pen = pen;
    }
}
