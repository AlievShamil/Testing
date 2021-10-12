package com.company;

import org.apache.commons.text.WordUtils;

public class NameService {
    private final NamesLibrary nameRepository;
    private final NamesLibrary lastNameService;

    public NameService(NamesLibrary nameRepository,
                       NamesLibrary lastNameService) {
        this.nameRepository = nameRepository;
        this.lastNameService = lastNameService;
    }

    public Person generateRandomPerson() {
        return new Person(nameRepository.getRandomValue(), lastNameService.getRandomValue());
    }
}
