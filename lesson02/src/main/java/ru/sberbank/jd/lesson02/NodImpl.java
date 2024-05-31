package ru.sberbank.jd.lesson02;

public class NodImpl implements Nod {
    /**
     * Вычисляет наибольший общий делитель двух целых чисел.
     *
     * @param first  первое число
     * @param second второе число
     * @return наибольший общий делитель двух целых чисел
     */
    @Override
    public int calculate(int first, int second) {

        int min = (Math.min(first, second) / 2);

        if (first == second) return first;

        if (Math.max(first, second) % Math.min(first, second) == 0) return Math.min(first, second);

        for (int i = min; i > 0 ; i--) {
            if (first % i == 0 && second % i == 0){

                return i;
            }
        }

        return 1;
    }

}
