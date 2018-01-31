package com.management;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.model.Employee;
import com.service.employeeService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("employees")
public class MyResource {

	employeeService es = new employeeService();

	/**
 	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees() {
		return es.getAllEmployees();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addEmployee(Employee employee) {
		return es.addEmployee(employee);
	}
	
	@PUT
	@Path("/{employeeId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee editEmployee(@PathParam("employeeId") long id, Employee emlpoyee){
		emlpoyee.setId(id);
		return es.editEmployee(emlpoyee);
	}	
	
	@DELETE
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteEmployee(@PathParam("employeeId") long id){
		es.removeEmployee(id);
	}
	
	@GET
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("employeeId") long employeeId) {
		return es.getEmployee(employeeId);
	}
}
