package org.sid.web;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sid.dao.TaskRepository;
import org.sid.dao.UploadRepository;
import org.sid.entities.Task;
import org.sid.entities.Uploads;
import org.sid.security.SecurityConstants;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestWebTask {
	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private UploadRepository uploadRepository;
	@Autowired
	AccountService accountService;
	public static String uploadDirectory = "C:/Users/arr/Desktop";

	@GetMapping("/tasks")
	public List<Task> ListTask() {
		return taskRepository.findAll();
	}

	@PostMapping("/tasks")
	public Task add(@RequestBody Task t) {
		return taskRepository.save(t);
	}

	@PutMapping("/tasks")
	public Task update(@RequestBody Task t) {
		return taskRepository.save(t);
	}

	@DeleteMapping(value = "/tasks/{id}")
	public boolean delete(@PathVariable Long id) {
		taskRepository.deleteById(id);
		return true;
	}

	@PatchMapping(value = "/datasks")
	public boolean deletea(@RequestBody Long[] idtable, HttpServletRequest request) {

		for (int i = 0; i < idtable.length; i++) {
			taskRepository.deleteById(idtable[i]);
		}
		String jwt = request.getHeader(SecurityConstants.HEADER_STRING);
		Claims claims = Jwts.parser().setSigningKey(SecurityConstants.SECRET)
				.parseClaimsJws(jwt.replaceAll(SecurityConstants.TOKEN_PREFIX, "")).getBody();
		System.out.println("********************" + claims.get("sub"));
		return true;
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public boolean upload(@RequestParam("file") MultipartFile file, HttpServletRequest req,
			MultipartHttpServletRequest requ, HttpServletResponse res) {

		StringBuilder fileNames = new StringBuilder(file.getOriginalFilename())
				.insert(file.getOriginalFilename().lastIndexOf('.'), System.currentTimeMillis());
		System.out.println("**************+++++++++" + fileNames);
		Path fileNameAndPath = Paths.get(uploadDirectory, fileNames.toString());
		System.out.println(requ.getRequestHeaders());
		System.out.println(requ.getParameter("Host"));

		requ.getLocalPort();
		try {
			uploadRepository.save(new Uploads("http://localhost/azerty/" + fileNames.toString()));
			try {
				Files.write(fileNameAndPath, file.getBytes());
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(fileNameAndPath.toString());
		System.out.println(fileNames.substring(fileNames.toString().lastIndexOf('.')).toString());

		return true;

	}

	@GetMapping("/uploads")
	public List<Uploads> ListUploads() {
		return uploadRepository.findAll();
	}

	@DeleteMapping("/deletefile/{id}")
	public boolean DeleteFile(@PathVariable("id") Long id) {
		Uploads upload = uploadRepository.findUploadById(id);
		if (upload != null) {

			System.out.println(uploadDirectory + upload.getPath().substring(upload.getPath().lastIndexOf('/')));
			File file = new File(uploadDirectory + upload.getPath().substring(upload.getPath().lastIndexOf('/')));

			if (file.delete()) {
				uploadRepository.deleteById(id);
				System.out.println(file.getName() + " is deleted!");
			}
			else {
				System.out.println("Delete operation is failed.");
			}
			return true;
		}
		return false;

	}

	@PostMapping("/ping")
	public static boolean pingHost(HttpServletRequest req) {
		String host;
		int port;
		int timeout;
		host = req.getParameter("host");
		port = Integer.parseInt(req.getParameter("port"));
		timeout = Integer.parseInt(req.getParameter("timeout"));
		try (Socket socket = new Socket()) {
			socket.connect(new InetSocketAddress(host, port), timeout);
			return true;
		}
		catch (IOException e) {
			return false; // Either timeout or unreachable or failed DNS lookup.
		}
	}

	@GetMapping("/testing")
	public void test(HttpServletRequest req, HttpServletResponse res) {

		String token = req.getHeader("Authorization");
		req.getCookies();

		System.out.println(token);
		Claims claims = Jwts.parser().setSigningKey(SecurityConstants.SECRET)
				.parseClaimsJws(token.replaceAll(SecurityConstants.TOKEN_PREFIX, "")).getBody();
		String username = claims.getSubject();
		ArrayList<Map<String, String>> roles = (ArrayList<Map<String, String>>) claims.get("roles");
		System.out.println(username + "++++" + roles);

		/*
		 * res.setHeader("LOOOOOL", "TROLLLLLLL");
		 * 
		 * res.setStatus(30000000); try { res.getWriter().println(username+roles.toString()); } catch (IOException e1) {
		 * // TODO Auto-generated catch block e1.printStackTrace(); }
		 */

		File f1 = new File("D:/houssem");
		File f2 = new File("D:/houssem1");
		try {
			res.getWriter().print(roles);
		}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			accountService.copyFolder(f1, f2);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
