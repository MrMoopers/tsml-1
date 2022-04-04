package AB_MLCoursework;

import java.io.FileReader;

import weka.core.Instances;

// src/main/java/AB_MLCoursework/**

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String dataLocation = "src\\main\\java\\AB_MLCoursework\\data\\Arsenal_TRAIN.arff";
        Instances train;
        try {
            FileReader reader = new FileReader(dataLocation);
            train = new Instances(reader);

            int a = 0;
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
