class PBDemo{
  public static void main(String[] args) {
    try{
      ProcessBuilder proc=new ProcessBuilder("gedit","textfile");
      proc.start();
    }catch(Exception e){
      System.out.println("Error executing gedit");
    }
  }
}
