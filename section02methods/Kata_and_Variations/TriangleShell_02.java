package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

@SuppressWarnings("unused")
public class TriangleShell_02
{
  private static int length = 1;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(600);
    Tortoise.setY(300);
    Tortoise.setPenWidth(3);
    Tortoise.setSpeed(10);
    for (int i = 0; i < 100; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      length = length + 9;
      drawTriangle();
      Tortoise.turn(360 / 359);
    }
  }
  private static void drawTriangle()
  {
    for (int i = 0; i < 5; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
