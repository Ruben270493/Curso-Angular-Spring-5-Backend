package com.rfernandez.springboot.backend.apirest.models.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IUploadFileService {

	public Resource cargar(String image) throws MalformedURLException;
	public String copy(MultipartFile archivo) throws IOException;
	public boolean delete(String image);
	public Path getPath(String image);
	
}
