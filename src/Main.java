public class Main {

    public static void main(String[] args) {
        Mobile xiaomi = new Mobile("Xiaomi", "Redmi 10",
                new Mobile.Display("FHD", 2400,1080),
                new Mobile.RAM("LPDDR4X", 4),
                new Mobile.CPU("MediaTek Helio G88", 2));

        xiaomi.showMobile();
        xiaomi.display.showDisplay();
        xiaomi.ram.showRAM();
        xiaomi.cpu.showCPU();
    }
}

class Mobile {
    String brand;
    String model;
    Display display;
    RAM ram;
    CPU cpu;

    Mobile(String brand, String model, Display display,
           RAM ram, CPU cpu){
        this.brand = brand;
        this.model = model;
        this.display = display;
        this.ram = ram;
        this.cpu = cpu;
    }

    public void showMobile(){
        System.out.println("Телефон " + brand + " " + model + " " + ram.size + " Гб " + cpu.ghz + " ГГц");
    }

    static class Display{
        String type;
        int length;
        int width;

        Display(String type, int length, int width){
            this.type = type;
            this.length = length;
            this.width = width;
        }

        public void showDisplay(){
            System.out.print("Тип экрана: " +  type + " " + length + "x" + width);
        }
    }

    static class RAM{
        String type;
        int size;

        RAM(String type, int size){
            this.type = type;
            this.size = size;
        }

        public void showRAM(){
            System.out.println("Оперативная память: " + type + " " + size + "Гб");
        }
    }

    static class CPU{
        String module;
        double ghz;

        CPU(String module, double ghz){
            this.module = module;
            this.ghz = ghz;
        }

        public void showCPU(){
            System.out.println("Процессор: " + module + " " + ghz + "ГГц");
        }
    }
}
