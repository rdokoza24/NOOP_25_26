package pckg_batch_processing;

import jakarta.json.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONFileParser implements FileParser{
    @Override
    public List<Record> parseFile(File file) {

        List<Record> records = new ArrayList<>();
        try(FileReader fileReader = new FileReader(file)) {
            JsonReader jsonReader = Json.createReader(fileReader);
            JsonObject jsonObject = jsonReader.readObject();
            for(String courseName : jsonObject.keySet()){
                JsonArray studentArray = jsonObject.getJsonArray(courseName);
                List<StudentRecord> students = new ArrayList<>();
                for(JsonValue studentValue : studentArray){
                    JsonObject studentObject = studentValue.asJsonObject();
                    String name = studentObject.getString("name");
                    int id = studentObject.getInt("student_id");
                    StudentRecord studentRecord = new StudentRecord(id, name);
                    students.add(studentRecord);
                }
                JSONRecord jsonRecord = new JSONRecord(courseName, students);
                records.add(jsonRecord);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO Exception occured!");
        }
        return records;
    }
}
