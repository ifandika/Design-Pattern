public class ComputerBuilder {
  private String RAM;
  private String CPU;
  private String OS;
  
  public ComputerBuilder setRAM(String RAM) {
    this.RAM = RAM;
    return this;
  }

  public ComputerBuilder setCPU(String CPU) {
    this.CPU = CPU;
    return this;
  }

  public ComputerBuilder setOS(String OS) {
    this.OS = OS;
    return this;
  }

  public Computer build() {
    return new Computer(RAM, CPU, OS);
  }
}
