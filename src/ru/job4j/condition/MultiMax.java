package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int maxTwo = first > second ? first : second;
        int result = maxTwo > third ? maxTwo : third;
        return result;
    }
}
