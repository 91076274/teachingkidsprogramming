package org.teachingkidsprogramming.section04mastery.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;

public class PentagonCrazy_Variation_01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      Tortoise.move(i);
      int sides = 2;
      Tortoise.turn(360 / sides);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    int penWidth = Tortoise.getPenWidth();
    Tortoise.setPenWidth(penWidth++);
    if (penWidth > 4)
    {
      Tortoise.setPenWidth(1);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Blues.SteelBlue);
    ColorWheel.addColor(Purples.DarkOrchid);
    ColorWheel.addColor(Blues.DarkSlateBlue);
    ColorWheel.addColor(Blues.Teal);
    ColorWheel.addColor(Purples.Indigo);
  }
}
