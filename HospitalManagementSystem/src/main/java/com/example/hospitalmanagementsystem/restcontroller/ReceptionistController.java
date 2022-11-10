package com.example.hospitalmanagementsystem.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalmanagementsystem.entity.Receptionist;
import com.example.hospitalmanagementsystem.service.ReceptionistService;

@RestController
@RequestMapping("/api/receptionist")
@CrossOrigin(origins = "http://localhost:4200")
public class ReceptionistController {
	
	

	private ReceptionistService receptionistService;

	@Autowired
	public ReceptionistController(ReceptionistService receptionistService) {
		super();
		this.receptionistService = receptionistService;
	}
	
	@GetMapping("/receptionist")
	public List<Receptionist> findAll()
	{
		return receptionistService.findAll();
	}
	@GetMapping("/receptionist/{receptionistId}")
	public Receptionist  getReceptionistById(@PathVariable int receptionistId)
	{
		Receptionist receptionist = receptionistService.findById(receptionistId);
		return receptionist;
		
	}
	@PostMapping("/receptionist")
	public String addReceptionist(@RequestBody Receptionist receptionist)
	{
		receptionist.setId(0);
		receptionistService.save(receptionist);
		
		return "Registration completed successfully";
	}
	
	@PutMapping("/receptionist")
	public Receptionist updateReceptionist(@RequestBody Receptionist receptionist)
	{
		receptionistService.save(receptionist);
		return receptionist;
	}
	@DeleteMapping("/receptionist/{receptionistID}")
	public String deleteReceptionist(@PathVariable int receptionistId )
	{
		String message=receptionistService.delete(receptionistId);
		return message;
	}
}
