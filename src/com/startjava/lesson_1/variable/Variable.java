package com.startjava.lesson_1.variable;

public class Variable {
    public static void main(String[] args) {
        byte cores = 8;
        short threads = 16;
        float freq = 4.2f;
        long mem = 32768;
        int gpuMem = 8092;
        double gpuFreq = 1.9;
        char gpuMemFreq = 8000;
        boolean isWarranty = true;

        System.out.println("Number of cores: " + cores + "\n" + "Number of threads: " + threads + "\n" +
            "CPU speed: " + freq + " GHz \n" + "Memory : " + mem + " MB\n" +
            "GPU memory: " + gpuMem + " MB\n" + "GPU core speed: " + gpuFreq + " GHz\n" +
            "GPU memory speed: " + (int) gpuMemFreq + " MHz\n" + "Warranty: " + isWarranty);
    }
}
