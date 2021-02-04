import javax.swing.*;

public class madlib{
  public static void main(String[]args){
      
     JFrame frame = new JFrame("Mad Lib for Horrible People");
    
     String name = JOptionPane.showInputDialog(frame, "Type a Name: ");
     String schoolsub =JOptionPane.showInputDialog(frame, "Type a School Subject: ");
     String number= JOptionPane.showInputDialog(frame, "Type a Number");
     String verbed = JOptionPane.showInputDialog(frame, "Type a Verb ending with -ed: ");
    
     String verb1 = JOptionPane.showInputDialog(frame, "Type a Verb: ");
     String verbing = JOptionPane.showInputDialog(frame, "Type a Verb ending with -ing: "); 
     
     String adj1 = JOptionPane.showInputDialog(frame, "Type an Adjective: ");   
     String letter = JOptionPane.showInputDialog(frame, "Type a Letter: ");
     String pluraloccu = JOptionPane.showInputDialog(frame, "Type a Plural Occuption: ");
     String animal = JOptionPane.showInputDialog(frame, "Type an Animal: ");
     String dayoweek =JOptionPane.showInputDialog(frame,"Type a Day of the Week: ");
     String noise = JOptionPane.showInputDialog(frame,"Type an Onomatopoeia: ");
     
     String noun1 = JOptionPane.showInputDialog(frame, "Type down a plural noun: ");
     String adj2 = JOptionPane.showInputDialog(frame, "Type an Adjective: ");
    
     String verbed2 = JOptionPane.showInputDialog(frame, "Type a Verb ending with -ed: ");
     String singlebody = JOptionPane.showInputDialog(frame,"Type a single body part: ");
     String verbed3 = JOptionPane.showInputDialog(frame, "Type a Verb ending with -ed: ");
     String trans= JOptionPane.showInputDialog(frame, "Type a Transportation: ");
      
     String scene = JOptionPane.showInputDialog(frame, "Type an something that's from outside: ");
     String food = JOptionPane.showInputDialog(frame,"Type a plural Food: ");
     String animal2 = JOptionPane.showInputDialog(frame, "Type an Animal: ");
     String flavor = JOptionPane.showInputDialog(frame, "Type a Flavor: ");
     String animal3 = JOptionPane.showInputDialog(frame, "Type an Animal: ");
     String liquid =  JOptionPane.showInputDialog(frame,"Type a liquid: ");
     
     String food2 = JOptionPane.showInputDialog(frame,"Type a plural Food: ");
     String liquid2 =  JOptionPane.showInputDialog(frame,"Type a liquid: ");
     
     String adj3 = JOptionPane.showInputDialog(frame, "Type an Adjective: ");
     String color = JOptionPane.showInputDialog(frame, "Type a Color: ");
     String pclothes = JOptionPane.showInputDialog(frame, "Type a plural clothing:");
     String sclothes = JOptionPane.showInputDialog(frame, "Type a single clothing:");
     String pclothes2 = JOptionPane.showInputDialog(frame, "Type a plural clothing:");
     
      
     String noun2 = JOptionPane.showInputDialog(frame, "Type a plural noun: ");
     String adj4 = JOptionPane.showInputDialog(frame, "Type an Adjective: ");     
     String adj5 = JOptionPane.showInputDialog(frame, "Type an Adjective: ");
     String noun3 = JOptionPane.showInputDialog(frame, "Type down a  noun: ");
     
     String singlebody2 = JOptionPane.showInputDialog(frame,"Type a single body part: ");
     
     String singlebody3 = JOptionPane.showInputDialog(frame,"Type a single body part: ");
     String adj6 = JOptionPane.showInputDialog(frame, "Type an Adjective: ");
     
     String verb =  JOptionPane.showInputDialog(frame, "Type a Verb: ");
     String singlebody4 = JOptionPane.showInputDialog(frame,"Type a single body part: ");
     String yn = JOptionPane.showInputDialog(frame,"Yes or No: ");
    
     String emotion = JOptionPane.showInputDialog(frame,"Type an Emotion: ");
     String greeting = JOptionPane.showInputDialog(frame,"Type a greeting: ");
     String verb2 =  JOptionPane.showInputDialog(frame,"Type a Verb: ");
     String room = JOptionPane.showInputDialog(frame,"Type a room in the house: ");
    
     
    JOptionPane.showMessageDialog(frame,"The Akward Date by MadLibs (thx)" );
    JOptionPane.showMessageDialog(frame,"Tonight I'm going on a date with " +name+ " from my " +schoolsub+ " class.");
    JOptionPane.showMessageDialog(frame,"He has asked me out over " +number+ " times and I always " +verbed+ " him away.");
    JOptionPane.showMessageDialog(frame,"This time I thought I'd "+verb1+ " for it, I mean why not, who is it " +verbing+" ?");
    JOptionPane.showMessageDialog(frame," "+name+" is one of those "+adj1+ " kind of guys who gets straight "+letter+" in every subject, he's kind of a " +pluraloccu+" " + animal+" .");
    JOptionPane.showMessageDialog(frame,"It was a "+ dayoweek+ " night when I heard a "+noise+ " at the door.");
    JOptionPane.showMessageDialog(frame,"It was "+name+" holding a bouquet of "+noun1+" ,he bowed and then handed one to me and said  'You look " +adj2+ " my dear, shall we?");
    JOptionPane.showMessageDialog(frame,"I almost "+verbed2+" from laughter but held it in the best I could. I took his "+singlebody+ " and he " +verbed3+ " me to his " +trans+" .");
    JOptionPane.showMessageDialog(frame,"We drove to a restaurant that overlooked the "+scene+" . He ordered "+food+" ,"+animal2+" fingers, "+flavor+" gravy and a huge "+animal3+ " burger with " +liquid+ " .");
    JOptionPane.showMessageDialog(frame,"I just wanted a "+food2+" with a glass of "+liquid2+ ",I guess he thought I was "+adj3+ " but his outfit had me lose my appetite, " +color+ " plaid "+pclothes+ " with a button-down " +sclothes+ " tucked in and over-sized "+ pclothes2+" on!");
    JOptionPane.showMessageDialog(frame,"After dinner he drove me home, we talked about why "+noun2+ " are so "+adj4+ " ,which was "+adj5+" and then he walked me to my " +noun3+" .");
    JOptionPane.showMessageDialog(frame,"He kissed me on the "+singlebody2+",out of all places!");
    JOptionPane.showMessageDialog(frame,"Then scratched his "+singlebody3+" and said I had a "+adj6+" time, lets want again some time!");
    JOptionPane.showMessageDialog(frame,"I "+verb+" my "+singlebody4+" "+yn+ " then quickly went inside.");
    JOptionPane.showMessageDialog(frame,"I felt"+emotion+" seeing him again in school but we usually just say "+greeting+" ! when we " +verb2+" into each other in the school "+room);
      
  System.exit(0);
  }
}