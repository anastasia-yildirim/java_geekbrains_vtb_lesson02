package com.geekbrains.vtb.javacourse.lesson04.lecture;

public class BoxDemoApp {

    public static void main(String[] args) {
        SimpleBox firstIntBox = new SimpleBox(20);
        SimpleBox secondIntBox = new SimpleBox(30);

        // instanceof - чтоб не получить ClassCastException
        if (firstIntBox.getObj() instanceof Integer && secondIntBox.getObj() instanceof Integer) {
            // getObj() возвращает не int, а Obj, поэтому нужно приведение к Integer
            int sum = (Integer) firstIntBox.getObj() + (Integer) secondIntBox.getObj();
            System.out.println("sum = " + sum);
        } else {
            System.out.println("Содержимое коробок отличается по типу");
        }

        firstIntBox.setObj("Java");

        // тут нет instanceof, но и нет ClassCastException, если 2 инта - что именно имелось в виду в уроке?
        int secondSum = (Integer) firstIntBox.getObj() + (Integer) secondIntBox.getObj();
        System.out.println("sum = " + secondSum);
    }
}
