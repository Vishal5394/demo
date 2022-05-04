public class Helloworld {
    public static void main(String [ ] argv) {
      while(true) {
      System.out.println("HEY, GOOD MORNING");
      try {
       Thread.sleep(6000);
      } catch (Exception ex) {}    
    }
  }
}
