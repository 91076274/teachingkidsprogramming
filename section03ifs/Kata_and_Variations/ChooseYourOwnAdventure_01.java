package org.teachingkidsprogramming.section03ifs.Kata_and_Variations;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure_01
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One night, as you were playing video games, your TV begins to blindingly glow.");
    animateStartStory();
    String action = askAQuestion(
        "Do you want to 'run away' like a sane person or 'stay' and investigate the strange glow?");
    if ("run away".equalsIgnoreCase(action))
    {
      runAway();
    }
    else if ("stay".equalsIgnoreCase(action))
    {
      investigate();
    }
    else
    {
      error();
    }
  }
  private static void endStory()
  {
    MessageBox.showMessage("The End");
  }
  private static void error()
  {
    MessageBox.showMessage("You can't follow directions. The end.");
  }
  private static void investigate()
  {
    MessageBox
        .showMessage("Out of the glowing TV flies a Phionex! The Phionex caws loudly and circles about the room.");
    String phionex = MessageBox.askForTextInput(
        "Do you want to 'befriend' the Phionex or 'pour' water on it and save your now burning house.");
    if ("befriend".equalsIgnoreCase(phionex))
    {
      befriendPhionex();
    }
    else if ("pour".equalsIgnoreCase(phionex))
    {
      pourIntoBackyard();
    }
    else
    {
      error();
    }
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    String soup = MessageBox
        .askForTextInput("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
    if ("faint".equalsIgnoreCase(soup))
    {
      MessageBox.showMessage("You made a delicious soup! Yum! The end.");
    }
    else if ("scream".equalsIgnoreCase(soup))
    {
      startStory();
    }
    else
    {
      error();
    }
  }
  private static void befriendPhionex()
  {
    MessageBox.showMessage("You aproach the Phionex. It eyes you carefully.");
    String food = MessageBox.askForTextInput("Do you want to offer it 'food' or be 'eaten'");
    if ("food".equalsIgnoreCase(food))
    {
      giveFood();
    }
    else if ("eaten".equalsIgnoreCase(food))
    {
      String look = MessageBox
          .askForTextInput("The phionex stares at you, with its beady eyes. 'cower' or have a 'staring' contest.");
      if ("cower".equalsIgnoreCase(look))
      {
        MessageBox
            .showMessage("The Phionex declares you unworthy, as you have not shown any bravery. It eats you.");
        endStory();
      }
      else if ("staring".equalsIgnoreCase(look))
      {
        String brave = MessageBox.askForTextInput(
            "The Phionex wins the staring contest. It deems you brave enough to join it in its kingdom. Do you say 'yes'or 'no'?");
        if ("yes".equalsIgnoreCase(brave))
        {
          MessageBox.showMessage(
              "The Phionex loves your response! He takes you through the portal and you live happily with your new friend.");
          endStory();
        }
        else if ("no".equalsIgnoreCase(brave))
        {
          MessageBox.showMessage("The Phionex dislkes your response, and cannot let you live. He eats you");
          endStory();
        }
        else
        {
          error();
        }
      }
    }
    else
    {
      error();
    }
  }
  private static void giveFood()
  {
    MessageBox
        .showMessage("The Phionex accepts your offering and asks if you would like to join it in its kingdom.");
    String kingdom = MessageBox.askForTextInput("Do say 'yes' or 'HECK YES'?");
    if ("yes".equalsIgnoreCase(kingdom))
    {
      MessageBox.showMessage(
          "The phionex thinks you are a bit unenthusistic but takes you with him anyways. You go through the portal (your TV)and happily live out your days with your new Phionex friend.");
    }
    if ("HECK YES".equalsIgnoreCase(kingdom))
    {
      MessageBox.showMessage(
          "The Phionex loves your response! He takes you through the portal and you live happily with your new friend.");
    }
  }
  private static void runAway()
  {
    String run = MessageBox.askForTextInput("You run out the door. Run to your 'mother' or the 'police'?");
    if ("mother".equalsIgnoreCase(run))
    {
      MessageBox.showMessage("AW. Wee baby. You couldn't handle a strange glow without your mummy?");
      endStory();
    }
    else if ("police".equalsIgnoreCase(run))
    {
      MessageBox.showMessage("The police think you insane and send you home to your mummy!");
      endStory();
    }
    else
    {
      error();
    }
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
