package org.teachingkidsprogramming.section04mastery;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setColor(PenColors.Grays.Silver);
    //    Make the line the tortoise draws 3 pixels wide --#15
    Tortoise.setPenWidth(3);
    //        Do the following 15 times --#13.1
    for (int i = 0; i < 15; i++)
    {
      Tortoise.turn(360 / 15);
      //        Repeat --#14.2
    }
    createColorPalette();
    //
    drawOctogon();
  }
  private static void drawOctogon()
  {
    //    ------------- Recipe for drawOctogon --#10.2
    for (int i = 0; i < 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
    //    ------------- End of drawOctogon recipe --#10.3
  }
  private static void createColorPalette()
  {
    //    ------------- Recipe for createColorPalette --#9.2
    Color color1 = PenColors.Reds.Red;
    Color color2 = PenColors.Oranges.DarkOrange;
    Color color3 = PenColors.Yellows.Gold;
    Color color4 = PenColors.Yellows.Yellow;
    ColorWheel.addColor(color1);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color1);
    //    ------------- End of createColorPalette recipe --#9.3
  }
}
