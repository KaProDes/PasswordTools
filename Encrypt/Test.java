class Test{
  public static void main(String args[]){
    String key = "HESOYAMAEZAKMIRIPHAZA";
    String unen = "ThisIsMyPassword";
    String encry = AES.encrypt(unen,key);
    String decry = AES.decrypt(encry,key);
    System.out.println(unen+" "+encry+" "+decry);
  }
}
