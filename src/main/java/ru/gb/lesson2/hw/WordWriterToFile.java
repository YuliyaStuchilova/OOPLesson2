package ru.gb.lesson2.hw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WordWriterToFile implements WriterToFile {

    @Override
    public void writeFile(Map<String, Double> map) {
        try(FileWriter writer = new FileWriter("StudentsWord.txt"))
        {
            for(Map.Entry<String, Double> student : map.entrySet()){
                writer.write(student.getKey());
                writer.write("=");
                writer.write(String.valueOf(student.getValue()));
                writer.write("\n");
            }
            writer.flush();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
