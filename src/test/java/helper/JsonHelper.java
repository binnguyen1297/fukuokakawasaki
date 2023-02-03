package helper;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import model.InformationDetails;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonHelper {
    public static InformationDetails generateInformationFromJson() {
        String jsonPath = "src/test/resources/qa/productKawasaki.json";
        try {
            JsonReader reader = new JsonReader(new FileReader(jsonPath));
            return new Gson().fromJson(reader, InformationDetails.class);
        } catch (FileNotFoundException e) {
            System.out.println("Account json not found");
            return null;
        }
    }
}
