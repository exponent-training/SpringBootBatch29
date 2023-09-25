package com.example.demo.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.FileData;
import com.example.demo.repo.FileRepository;

@Service
public class FileServiceImpl implements FileService{

	@Autowired
	private FileRepository fileRepository;

	@Override
	public void storeFileInDB(MultipartFile file) {
		// TODO Auto-generated method stub
		try {
			FileData fileData = new FileData();
			fileData.setFname(file.getOriginalFilename());
			fileData.setFsize(file.getSize());
			fileData.setType(file.getContentType());
			fileData.setFdata(file.getBytes());
			
			fileRepository.save(fileData);
		}
		catch (IOException e) {
			// TODO: handle exception
	}

	}
}
