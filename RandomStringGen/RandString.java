import java.util.*;

class RandString{
  String randString;
  //int len;
  RandString(){
  String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*(){}[]/";
  String randString = "";


  Random rand = new Random();
  int len = rand.nextInt(15)+15;
  char text[] = new char[len];
  for(int i = 0; i < len; i++){
    text[i] = chars.charAt(rand.nextInt(chars.length()));
  }
  for(int i = 0; i<text.length;i++){
    randString += text[i];
    }
  this.randString = randString;
  //this.len = len;
  }
  String getRandString(){
    return randString;
  }
  /*
  //Debug features
  int getLength(){
    return len;
  }
  */
}
