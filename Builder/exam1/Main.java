public class Main {
  public static void main(String[] args) {
    Computer computer1 = new ComputerBuilder()
      .setRAM("8GB V-GEN")
      .setCPU("INTEL CORE i9")
      .setOS("Linux Kali-Linux")
      .build();

    System.out.println(computer1.toString()+"\n");

    Computer computer2 = new ComputerBuilder()
      .setRAM("8GB V-GEN")
      .setCPU("INTEL CORE i9")
      .build();
      
    System.out.println(computer2.toString());

    // Output
    // Axioo@IFANDIKA-AXIOO MINGW64 /d/Github/Design-Pattern (master)
    // $  /usr/bin/env D:\\Program\ Files\\Java\\jdk-25\\bin\\java.exe --enable-preview -XX:+ShowCodeDetailsInExceptionMessages -cp C:\\Users\\Axioo\\AppData\\Roaming\\Code\\User\\workspaceStorage\\b1e741045ff6671347bf3d39d48655e9\\redhat.java\\jdt_ws\\Design-Pattern_ca0b5934\\bin Main 
    // Computer [CPU=INTEL CORE i9, RAM=8GB V-GEN, OS=Linux Kali-Linux]
    // Computer [CPU=INTEL CORE i9, RAM=8GB V-GEN, OS=null]
  }
}
