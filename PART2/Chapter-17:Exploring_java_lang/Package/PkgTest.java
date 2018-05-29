//Demonstrate a package
class PkgTest{
  public static void main(String[] args) {

    Package pkgs[];
    pkgs=Package.getPackages();

    for(int i=0;i<pkgs.length;i++){
      System.out.println(
      "\nName -> "+pkgs[i].getName()+ " " +
      "\nImplementation Title -> "+pkgs[i].getImplementationTitle()+ " " +
      "\nImplementation Vendor -> "+pkgs[i].getImplementationVendor()+ " " +
      "\nImplementation Version -> "+pkgs[i].getImplementationVersion()
      );

    }
  }

}
