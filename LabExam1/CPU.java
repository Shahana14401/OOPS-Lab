public class CPU {
    int price;
    static class Process
    {
        int core;
        String producer;
        Process(int cores,String manufact)
        {
            core=cores;
            producer=manufact;
        }
        void display()
        {
            System.out.println("Processor \n ______________________");
            System.out.println("No of cores:" + core);
            System.out.println("Manufacturer:"+producer);
        }
    }
    static class Ram
    {
        int memory;
        String manufact;
        Ram(int mem,String manu)
        {
            memory=mem;
            manufact=manu;
        }
        void display()
        {
            System.out.println("Ram \n ______________________");
            System.out.println("Memory:" + memory);
            System.out.println("Manufacturer:"+manufact);
        }
    }
    public static void main(String[] args) {
        CPU.Process prc=new CPU.Process(8,"intel");
        //CPU cpu=new CPU();
        CPU.Ram ram=new CPU.Ram(8, "samsung");
        prc.display();
        ram.display(); 
    }
}
