package ru.gb.lesson2.hw;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> students = new HashMap<>();
        students.put("Степан Кузьмин", 3.6);
        students.put("Мария Кузнецова", 5.0);
        students.put("Иван Иванов", 4.8);

        WordWriterToFile wordWriterToFile = new WordWriterToFile();
        wordWriterToFile.writeFile(students);

        JSONWriterToFile jsonWriterToFile = new JSONWriterToFile();
        jsonWriterToFile.writeFile(students);

        XMLWriterToFile xmlWriterToFile = new XMLWriterToFile();
        xmlWriterToFile.writeFile(students);


    }
}