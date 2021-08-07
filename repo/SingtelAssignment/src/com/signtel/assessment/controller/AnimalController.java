package com.signtel.assessment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.reflections.Reflections;

import com.singtel.assessment.model.Animal;


@Path("/getAnimals")
public class AnimalController {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAnimals(@Context HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		List<String> animals = new ArrayList<String>();
		try {
			Reflections reflections = new Reflections("com.singtel.assessment.model");
			Set<Class<? extends Animal>> subTypes = reflections.getSubTypesOf(Animal.class);
			for (Class<? extends Animal> obj : subTypes) {
				animals.add(obj.getSimpleName());
				System.out.println(obj.getSimpleName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.ok(animals).build();
		
	}

}
