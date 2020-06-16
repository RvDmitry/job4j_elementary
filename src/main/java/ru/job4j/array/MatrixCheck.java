package ru.job4j.array;

/**
 * Class MatrixCheck
 * Класс осуществляет различную проверку над массивом, а также извлекает диагональные элементы.
 * @author Dmitry Razumov
 * @version 1
 */
public class MatrixCheck {
    /**
     * Метод проверяет все ли элементы заданной строки двухмерного массива имеют значение 'X'.
     * @param board Массив в котором проверяется заданная строка
     * @param row Строка которую нужно проверить
     * @return true, если все элементы в строке 'X', false, если нет
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод проверяет все ли элементы заданного столбца в двухмерном массиве имеют значени 'X'.
     * @param board Массив в котором проверяется заданный столбец
     * @param column Столбец который нужно проверить
     * @return true, если все элементы в стоблце 'X', false, если нет
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод извлекает из двухмерного массива диагональные значение и
     * возвращает их в виде одномерного массива
     * @param board Двухмерный массив из которого нужно извлечь диагональ
     * @return Одномерный массив с элементами из диагонали двухмерного
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Метод проверяет есть ли в заданном двухмерном массиве строка или столбец, элементы которых
     * содержат значение 'X'
     * @param board Двухмерный массив который нужно проверить
     * @return true, если есть либо строка либо столбец со всеми значеними 'X', false, если нет
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
