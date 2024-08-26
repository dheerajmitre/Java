package Basicj.CollectionsEx;

public class CustomArrayList<Integer> {
    private Object[] elements;
    private int size;

    // Constructor to initialize the list with a default capacity
    public CustomArrayList() {
        elements = new Object[10];  // capacity of array
    }

    // Method to add an element to the list

    public void add(int element) {
        if (size == elements.length) {
//            increaseCapacity();
        }
        elements[size++] = element;
    }
    // Method to remove an element at a specific index

    public int remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        int removedElement = (int) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null; // Clear the last element
        return removedElement;
    }
    public void printAllElements() {

        for (int i = 0; i < size; i++) {

            System.out.print(elements[i]);

            if (i < size - 1) {

                System.out.print(", ");
            }
        }
    }

// increase capacity of arraylist
//    private void increaseCapacity() {
//        Object[] newElements = new Object[elements.length * 2];
//
//        for (int i = 0; i < elements.length; i++) {
//            newElements[i] = elements[i];
//        }
//        elements = newElements;
//    }


    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
//        list.add(11);
//        list.add(12);
//        list.add(13);
//        list.add(14);

        System.out.print("Elements after adding: ");
        list.printAllElements();

        list.remove(3);
        list.remove(2);


        System.out.print("\nElements after removing index:");

        list.printAllElements();
    }
}
