// Wait untill notepad is terminated
class ExecDemoFini{
  public static void main(String[] args) {
    Runtime r=Runtime.getRuntime();
    Process p=null;

    try{
      p=r.exec("gedit");
      p.waitFor();
    }catch(Exception e){
      System.out.println("Error executing gedit");
    }
    System.out.println("Notepad returned "+p.exitValue());
  }
}
