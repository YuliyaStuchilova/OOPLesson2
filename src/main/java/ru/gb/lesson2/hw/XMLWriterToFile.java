package ru.gb.lesson2.hw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class XMLWriterToFile implements WriterToFile{
    @Override
    public void writeFile(Map<String, Double> map) {
        try (FileWriter writer = new FileWriter("StudentsXML.xml")){
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            writer.write("<students>\n");
            for(Map.Entry<String, Double> student : map.entrySet()){
                writer.write("<student>\n");
                writer.write("<name>");
                writer.write(student.getKey());
                writer.write("</name>\n");
                writer.write("<grade>");
                writer.write(String.valueOf(student.getValue()));
                writer.write("</grade>");
                writer.write("\n");
                writer.write("</student>\n");
            }
            writer.write("</students>\n");

            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
