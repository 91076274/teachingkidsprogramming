package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DoubleLoop2
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(225);
    Tortoise.setY(150);
    Tortoise.setSpeed(10);
    //  
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Purples.DarkOrchid);
    ColorWheel.addColor(PenColors.Purples.Lavender);
    for (int i = 0; i < 6; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(i * 4);
      Tortoise.turn(360 / -6);
      // 
      for (int j = 0; j < 15; j++)
      {
        Tortoise.setPenWidth(25);
        Tortoise.move(j * 8);
        Tortoise.turn(360 / 5);
      }
      //  
      Tortoise.hide();
      Tortoise.getBackgroundWindow().setBackground(PenColors.Greens.LightGreen);
    }
    Tortoise.setX(300);
    Tortoise.setY(200);
    for (int t = 0; t < 5; t++)
    {
      Tortoise.setPenColor(PenColors.Yellows.Gold);
      Tortoise.move(25);
      Tortoise.turn(360 / 5);
    }
    //  
  }
}
