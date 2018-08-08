package annotion;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by lucas on 2018/8/4.
 */
public class TestDemo {
    public static void main(String[] args) {
        JsonParser jsonParser = new JsonParser();//解析器
        try {
            JsonObject object = (JsonObject) jsonParser.parse(new FileReader("design/text.txt"));
            JsonElement cat = object.get("cat");
            System.out.println(cat.getAsString());

            JsonArray language = object.getAsJsonArray("language");
            for (int i = 0; i < language.size(); i++) {
                JsonObject asJsonObject = language.get(i).getAsJsonObject();
                System.out.print(asJsonObject.get("id").getAsInt()+" ");
                System.out.print(asJsonObject.get("ide").getAsString()+" ");
                System.out.print(asJsonObject.get("name").getAsString());
                System.out.println("");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
