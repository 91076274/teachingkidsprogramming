package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    //    Change the Tortoise to a Spider --#14
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    Double length = 10.5;
    Double zoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      //
      length = weaveOneLayer(length, zoom);
      //
      zoom = zoom * 1.3;
    }
  }
  private static Double weaveOneLayer(Double length, Double zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(length);
      Tortoise.turn(360 / 6);
      length = length + zoom;
    }
    return length;
  }
  private static void drawTriangle(Double length)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
