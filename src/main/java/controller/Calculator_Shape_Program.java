
package controller;

import common.Library;
import model.Circle;
import model.Rectangle;
import model.Triangle;


public class Calculator_Shape_Program  {
    public void run(){
      System.out.println("=====Calculator Shape Program=====");
        Rectangle rectangle = Library.inputRectangle();
        Circle circle = Library.inputCircle();
        Triangle trigle = Library.inputTriangle();

        Library.display(trigle, rectangle, circle);
    }
}
