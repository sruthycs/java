public class Cpu1{

    int price;

     class processor{

        int cores;

        String producer;

        processor(int noC, String Sreejith){

            cores=noC;

            producer=Sreejith;

        }

        void display(){

        System.out.println("\nProcessor info");

        System.out.println("Number  of Cores = "+cores);

        System.out.println("Manufacturer = "+producer+"\n");

    }

    }

    static class ram{

        int mem;

        String manuf;

        ram(int memory,String producer ){

            mem=memory;

            manuf=producer;

        }

        void display(){

        System.out.println("\nRAM info");

        System.out.println("Memory = "+mem+" GB");

        System.out.println("Manufacturer = "+manuf+"\n");

    }}

    public static void main(String[] args) {

         Cpu.ram obj1= new Cpu.ram(8,"Intel");

         Cpu obj2 = new Cpu();

         Cpu.processor obj3 = obj2.new processor(8,"Asuss");

         obj1.display();

         obj3.display();




    }

}
