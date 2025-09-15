package net.ciupa.enderlead;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlacklistWriter {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void saveBlacklist(List<? extends String> entities) {
        // Config folder path
        File folder = new File("config/enderlead/tags/entity_types");
        if (!folder.exists()) folder.mkdirs();

        File file = new File(folder, "blacklist.json");

        // Minecraft tag format: { "replace": false, "values": [...] }
        Map<String, Object> tagJson = new HashMap<>();
        tagJson.put("replace", false);
        tagJson.put("values", entities);

        try (FileWriter writer = new FileWriter(file)) {
            GSON.toJson(tagJson, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
