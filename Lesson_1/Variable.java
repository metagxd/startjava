public class Variable {
    public static void main(String[] args) {
        byte cores = 8;
        short threads = 16;
        float freq = 4.2f;
        long mem = 32768;
        int gpu_mem = 8092;
        double gpu_freq = 1.9;
        char gpu_mem_freq = 8000; //не выводиться значение, только знак вопроса
        boolean isWarranty = true;
        System.out.println("Количество ядер: " + cores + "\n" + "Количество потоков " + threads + "\n" + 
            "Частота процессора: " + freq + " GHz \n" + "Количество оперативной памяти : " + mem + " MB\n" + 
            "Количество видеопамяти " + gpu_mem + " MB\n" + "Частота видеоядра " + gpu_freq + " GHz\n" + 
            "Частота видеопамяти " + (int) gpu_mem_freq + " MHz\n" + "На грантии: " + isWarranty);
    }
}