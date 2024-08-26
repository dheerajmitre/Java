package Basicj.CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClient {

    String width;
    String height;
    String shape;

    public ComparatorClient(String width, String height, String shape) {
        this.width = width;
        this.height = height;
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "ComparatorClient{" +
                "width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }

    // Static inner classes for comparators
    static class AreaComparator implements Comparator<ComparatorClient> {
        @Override
        public int compare(ComparatorClient o1, ComparatorClient o2) {
            return o1.getWidth().compareTo(o2.getWidth());
        }
    }

    static class DesignComparator implements Comparator<ComparatorClient> {
        @Override
        public int compare(ComparatorClient o1, ComparatorClient o2) {
            return o1.getHeight().compareTo(o2.getHeight());
        }
    }

    static class StockComparator implements Comparator<ComparatorClient> {
        @Override
        public int compare(ComparatorClient o1, ComparatorClient o2) {
            return o1.getShape().compareTo(o2.getShape());
        }
    }

    public static class Test {

        public static void main(String[] args) {

            ComparatorClient X1 = new ComparatorClient("Agf", "Bff", "Cee");
            ComparatorClient X2 = new ComparatorClient("X33", "Yrr", "Zrew");
            ComparatorClient X3 = new ComparatorClient("Prrt", "Qerr", "Rtg");

            List<ComparatorClient> list = new ArrayList<>();
            list.add(X1);
            list.add(X2);
            list.add(X3);

            // Sorting by width
            Collections.sort(list, new AreaComparator());
            System.out.println("Sorted by width:");
            for (ComparatorClient client : list) {
                System.out.println(client);
            }

            // Sorting by height
            Collections.sort(list, new DesignComparator());
            System.out.println("\nSorted by height:");
            for (ComparatorClient client : list) {
                System.out.println(client);
            }

            // Sorting by shape
            Collections.sort(list, new StockComparator());
            System.out.println("\nSorted by shape:");
            for (ComparatorClient client : list) {
                System.out.println(client);
            }
        }
    }
}
