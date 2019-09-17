package com.codeclan.relationship.relationships_homework.components;

import com.apple.eawt.Application;
import com.codeclan.relationship.relationships_homework.models.File;
import com.codeclan.relationship.relationships_homework.models.Folder;
import com.codeclan.relationship.relationships_homework.repositories.FileRepository;
import com.codeclan.relationship.relationships_homework.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

@Autowired
FileRepository fileRepository;

@Autowired
FolderRepository folderRepository;

public DataLoader() {

}
public void run(ApplicationArguments args) {

    Folder finances = new Folder("Finances", "blue" , "Louise" );
    folderRepository.save(finances);

    File bills = new File("Bills", "txt", 100, "Finances");
    fileRepository.save(bills);



}
}
