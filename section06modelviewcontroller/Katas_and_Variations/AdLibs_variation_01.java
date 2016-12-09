package org.teachingkidsprogramming.section06modelviewcontroller.Katas_and_Variations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs_variation_01
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    //MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askEdVerb();
    // MessageBox.showMessage("The -ed verb is " + edVerb);
    String bodyPart = askBodyPart();
    // MessageBox.showMessage("The body part is " + bodyPart);
    String currentStory = "Today I woke " + adverb + ". Then I " + edVerb + " my " + bodyPart + ".";
    MessageBox.showMessage(currentStory);
  }
  public static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("Plese enter a body part");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Please enter a body part");
      bodyPart = askBodyPart();
    }
    if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("No body, no story, pay attention and start over!");
      bodyPart = askBodyPart();
    }
    return bodyPart;
  }
  public static String askEdVerb()
  {
    String edverb = MessageBox.askForTextInput("What is the -ed verb");
    if (edverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an -ed verb.");
      edverb = askAdverb();
    }
    if (edverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("No -ed verb, no story, pay attention and start over!");
      edverb = askEdVerb();
    }
    return edverb;
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb.");
      adverb = askAdverb();
    }
    if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("No adverb, no story, pay attention and start over!");
      adverb = askAdverb();
    }
    return adverb;
  }
}