package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    String currentAdverb = MessageBox.askForTextInput("Please enter an adverb");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    String currentEdVerb = MessageBox.askForTextInput("Please enter an adverb ending with 'ed'");
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    String currentBodyPart = MessageBox.askForTextInput("Please enter an appropriate body part");
    //  Set the value of the currentStory to the word "Today " --#1.2
    String currentStory = "Today I woke " + currentAdverb + ". Then I " + currentEdVerb + " my " + currentBodyPart
        + ". ";
    //  Add the words "I woke " + currentAdverb + ". " to the currentStory --#3
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    //  Show the currentStory in a message box as a message --#1.1
    MessageBox.showMessage(currentStory);
  }
}