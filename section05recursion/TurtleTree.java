package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    int length = 60;
    drawBranch(length);
  }
  private static void drawBranch(int length)
  {
    if (length > 0)
    {
      //        adjustColor (recipe below)--#15.1
      //        ------------- Recipe for adjustColor --#15.2
      HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
      //            A 10 pixel long branch is lime --#20
      //            A 20 pixel long branch is forest green --#19
      //            A 30 pixel long branch is dark green --#18
      //            A 40 pixel long branch is olive --#17
      //            A 50 pixel long branch is sienna --#14
      //            A 60 pixel long branch is saddle brown (TIP: Put the values into the 'colors' HashMap)--#13 
      //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
      //        ------------- End of adjustColor --#15.3
      //
      Tortoise.move(length);
      //
      drawLowerBranches(length);
    }
    //
  }
  private static void drawLowerBranches(int length)
  {
    Tortoise.turn(30);
    drawShorterBranch(length);
    Tortoise.turn(-60);
    drawShorterBranch(length);
    //            Turn the Tortoise 30 degrees to the right --#12
    Tortoise.turn(30);
    //            adjustColor --#16
    Tortoise.move(-length);
  }
  private static void drawShorterBranch(int length)
  {
    drawBranch(length - 10);
  }
}