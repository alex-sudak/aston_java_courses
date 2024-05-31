import java.beans.PropertyEditorSupport;

public class Exceptions {
    public static class MyArraySizeException extends Exception {
    }

    public static class MyArrayDataException extends Exception {
        public int i;
        public int j;

        MyArrayDataException(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static int array(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int total = 0;
        if (array.length != 4) throw new MyArraySizeException();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array.length; j++) {
                if (array[j].length != 4) {
                    throw new MyArraySizeException();
                }
                try {
                    total = total + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException n) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return total;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] check = new String[][]{{"2", "sdf", "6", "4"}, {"7", "2", "1", "4"}, {"5", "1", "2", "6"}, {"8", "1", "4", "3"}};
        try {
            try {
                int summary = array(check);
                System.out.println(summary);
                // System.out.println(check);
            } catch (MyArraySizeException s) {
                System.out.println("Размер массива, который Вы используете, отличается от допустимого системой 4х4");
                s.printStackTrace();
            }
        } catch (MyArrayDataException d) {
            System.out.println("Элемент массива под номером [" + d.i + "][" + d.j + "] имеет некорректное значение");
            d.printStackTrace();
        }
    }
}