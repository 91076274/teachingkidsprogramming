package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Variation_01_Batman
{
  //----------------Kata Question----------------//
  //how would you make a house with a slanted roof?
  //Write out the steps in  English
  //Then transfer the steps into code
  //Make sure to run after each line
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Shannon and Grace");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawBatman(height);
    //    drawHouseSlantedRoof(120);
    //    drawHouseSlantedRoof(90);
    //    drawHouseSlantedRoof(20);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawBatman(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.Black);
    Tortoise.move(height);
    drawSlantedRoof();
  }
  private static void drawFlatRoof()
  {
    // make flat roof
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
  private static void drawSlantedRoof()
  {
    //make a slanted roof
    //turn the tortoise 45 degrees to the right -- #1
    Tortoise.turn(45);
    //move the tortoise 30 pixels -- #2
    Tortoise.move(30);
    //turn the tortoise 135 degrees to the right -- #3
    Tortoise.turn(135);
    //move the tortoise 20 pixels -- #4
    Tortoise.move(20);
  }
  private static void drawPointyRoof()
  {
    //make a pointy roof
    //turn the tortoise 45 degrees to the right -- #1
    Tortoise.turn(45);
    //move the tortoise 30 pixels -- #2
    Tortoise.move(30);
    //turn the tortoise 90 degrees to the right -- #3
    Tortoise.turn(90);
    //move the tortoise 30 pixels -- #4
    Tortoise.move(30);
    // turn the tortoise 45 degrees to the right -- #5
    Tortoise.turn(45);
  }
}
