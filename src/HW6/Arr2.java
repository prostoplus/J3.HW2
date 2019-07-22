package HW6;

public class Arr2 {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayMass2(array);
    }

    public static boolean arrayMass2(int[] array) {

        if (array.length == 0) return false;

        int one = 0;
        int four = 0;

        for (int i = 0; i < array.length; i++) {
            //if (array[i] != 1 && array[i] != 4) return false;
            if (array[i] == 1) one++;
            if (array[i] == 4) four++;
            if (one == 0 && four == 0) return false;
        }
        for (int v : array)
            System.out.print(v + " ");
        System.out.println("\n" + "Едениц в массиве: " + one);
        System.out.println("Четвёрок в массиве: " + four);

        return one != 0 || four != 0;
    }
}
