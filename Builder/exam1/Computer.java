public class Computer {
  private String RAM;
  private String CPU;
  private String OS;
  
  public Computer(String RAM, String CPU, String OS) {
    this.RAM = RAM;
    this.CPU = CPU;
    this.OS = OS;
  }
  
  @Override
  public String toString() {
    return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", OS=" + OS + "]";
  }
}