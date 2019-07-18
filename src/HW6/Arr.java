package HW6;

public class Arr {

    public static void main(String[] args) {

        int[] array = new int[]{1, 7, 4, 9, 6, 9, 7, 5, 3};
        arrayMass(array);
    }

    static int[] arrayMass(int[] array) {

        if (array.length == 0) return null;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) break;

            if (i == array.length - 1) {
                throw new RuntimeException("Error");
            }
        }

        for (int v : array)
            System.out.print(v + " ");

        int[] newArr = new int[0];

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                newArr = new int[array.length - i - 1];
                for (int j = 0; j < newArr.length; j++) {
                    newArr[j] = array[i + j + 1];
                }
                break;
            }
        }
        System.out.println("\n" + "New Massive");
        for (int v : newArr)
            System.out.print(v + " ");

        return newArr;
    }
}
