public class HeyJude{
    public static String HEY = "Hey Jude ";
    public static String DON = "don't ";
    public static String MAK = "make it bad.";
    public static String BEA = "be afraid.";
    public static String LET = "let me down.";
    public static String TAK = "Take a sad song and make it better.";
    public static String YOW = "You were made to go out and get her.";
    public static String YOH = "You have found her, now go and get her.";
    public static String REM = "Remember to ";
    public static String LEH = "let her into you heart.";
    public static String LES = "let her into your skin.";
    public static String THE = "Then you ";
    public static String CAN = "can start ";
    public static String BEG = "begin ";
    public static String TOM = "to make it better ";
    public static String BET = "better ";
    public static String NA  = "na ";

    public static String AND = "And anytime you feel the pain, hey Jude, refrain,\n"
	                            + "Don’t carry the world upon your shoulders.\n"
                                    + "For well you know that it’s a fool who plays it cool\n"
	                            + "By making his world a little colder.";

    public static String SOL = "So let it out and let it in, hey Jude, begin,\n"
	                            + "You’re waiting for someone to perform with.\n"
	                            + "And don’t you know that it’s just you, hey jude, you’ll do,\n"
	                            + "The movement you need is on your shoulder.";

    public static void main(String[] args){
      int q=0;

      while (q<12){
      System.out.println(HEY+DON);
      q=q+1;

      if(q==1 || q==2 || q==3 || q==4){
        System.out.println(MAK+TAK);
      }
      if(q==5 || q==6 || q==7 || q==8){
        System.out.println(BEA+YOW);
      }
      if(q==9 || q==10 || q==11 || q==12){
        System.out.println(LET+YOH);
      }
      if (q<13){
        System.out.println(REM);
      }
      if(q==1 || q==2 || q==3 || q==4 || q==5 || q==6){
        System.out.println(LEH);
      }
      if(q==7 || q==8 || q==9 || q==10 || q==11 || q==12){
        System.out.println(LES);
      }
      if (q<13){
        System.out.println(THE);
      }
      if(q==1 || q==2 || q==3 || q==4 || q==5 || q==6){
        System.out.println(CAN);
      }
      if(q==7 || q==8 || q==9 || q==10 || q==11 || q==12){
        System.out.println(BEG);
      }
      if (q<13){
        System.out.println(TOM);
      }
      for (int k=0; k<2; k++) {
        switch(k){
          case 0:
          int s=0;
          while (s<6) {
            System.out.print(BET);
            s=s+1;
          }
          System.out.println("");
          break;
          case 1:
          int e=0;
          while (e<6) {
            System.out.print(NA);
            e=e+1;
          }
          System.out.println("");
           break;
        }
      }
      System.out.println("");
    }
    System.out.println(AND);
    System.out.println(SOL);
    }

}
