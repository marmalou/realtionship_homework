package com.codeclan.relationship.relationships_homework;

import com.codeclan.relationship.relationships_homework.models.File;
import com.codeclan.relationship.relationships_homework.models.Folder;
import com.codeclan.relationship.relationships_homework.repositories.FileRepository;
import com.codeclan.relationship.relationships_homework.repositories.FolderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationshipsHomeworkApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFolderAndFile(){
		File file = new File("budget", "pp", 10, "Finances");
		fileRepository.save(file);

		Folder folder1 = new Folder("Finances", "budgets", "Louise");
		folderRepository.save(folder1);

	}

}