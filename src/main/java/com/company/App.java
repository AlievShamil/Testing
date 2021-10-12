package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws IOException {
        String namesUrl = "https://api.npoint.io/f744aa71f0b7c142f0fd";
        String nounceUrl = "https://api.npoint.io/a742b65192a1e1e22858";

        ObjectMapper mapper = new ObjectMapper();
        String[] names = mapper.convertValue(mapper.readTree(new URL(namesUrl)).get("names"), String[].class);
        String[] lastNames = mapper.readValue(new URL(nounceUrl), String[].class);

        NamesLibrary namesLibrary = new NamesLibrary(names);
        NamesLibrary lastNamesLibrary = new NamesLibrary(lastNames);
        NameService nameService = new NameService(namesLibrary, lastNamesLibrary);

        for (int i = 0; i < 3; i++) {
            System.out.println(nameService.generateRandomPerson());
        }
    }
}
