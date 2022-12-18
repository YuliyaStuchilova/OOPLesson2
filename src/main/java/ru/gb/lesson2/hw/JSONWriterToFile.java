package ru.gb.lesson2.hw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JSONWriterToFile implements WriterToFile {
    @Override
    public void writeFile(Map<String, Double> map) {
        try (FileWriter writer = new FileWriter("StudentsJSON.json")) {
            writer.write("{");
            for (Map.Entry<String, Double> student : map.entrySet()) {
                writer.write("\"");
                writer.write(student.getKey());
                writer.write("\": ");
                writer.write(String.valueOf(student.getValue()));
                if (student.getKey().equalsIgnoreCase("Иван Иванов")) {
                    writer.write("\n");
                } else {
                    writer.write(",\n");
                }
            }
            writer.write("}");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
