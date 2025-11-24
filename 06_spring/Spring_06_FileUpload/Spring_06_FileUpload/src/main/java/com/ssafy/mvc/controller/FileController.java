package com.ssafy.mvc.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	//의존성 주입을 해줘야해
	@Autowired
	private ResourceLoader resourceLoader;
	
	
	@GetMapping("/singleFileForm")
	public String singleFileForm() {
		System.out.println("너 여기 오니?");
		return "singleFileForm";
	}
	
	@PostMapping("/singleFileUpload")
	public String singleFileUpload(@RequestParam("file") MultipartFile file, Model model) throws IllegalStateException, IOException {
		
		//파일이 있다면....
		if(file != null && file.getSize() > 0) {
			String fileName = file.getOriginalFilename();
			//임시메모리 공간에 있고, 저장하지 않으면 없어짐...
			Resource resource = resourceLoader.getResource("classpath:/static/img");
			
			file.transferTo(new File(resource.getFile(), fileName));
			
			model.addAttribute("fileName", fileName);
		}
		return "result";
	}
	
	@GetMapping("/download")
	public String fileDownload(@RequestParam("fileName") String fileName, Model model) {
		model.addAttribute("fileName", fileName);
		return "fileDownloadView";
	}
	
	@GetMapping("/multiFileForm")
	public String multiFileForm() {
		return "multiFileForm";
	}
	
	@PostMapping("/multiFileUpload")
	public String multiFileUpload(@RequestParam("files") MultipartFile[] files, Model model) throws IllegalStateException, IOException {
		for(MultipartFile file: files) {
			
			//아까 파일 1개 저장했던 그 코드를 돌리면 되겠따.
			System.out.println(file.getOriginalFilename());
		}
		return "result";
	}
	
	
	
	
}
