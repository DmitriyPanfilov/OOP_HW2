package lesson_2.homework2.task2;

public interface Shape {

    double calculateArea(double width, double height);

//    void calculatePerimeter();

    default double calculatePerimeter(double width, double height) {
        return (2 * (width + height));
    }

}
