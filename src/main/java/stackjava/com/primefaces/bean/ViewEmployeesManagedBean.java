package stackjava.com.primefaces.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import stackjava.com.primefaces.model.Employee;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
@NoArgsConstructor
@Getter
@Setter
public class ViewEmployeesManagedBean {
	private List<Employee> employees = new ArrayList<>();

	@PostConstruct
	public void populateEmployeeList() {
		for (int i = 0; i < 10; i++) {
			Employee emp = new Employee();
			emp.setEmployeeId(String.valueOf(i));
			emp.setEmployeeName("Employee#" + i);
			employees.add(emp);
		}
	}
}
