package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class DemoController {
    Employee e1 = new Employee(1, "A Employee A", "male", "10000");
    Employee e2 = new Employee(2, "C Employee c", "female", "20000");
    Employee e4 = new Employee(4, "W Employee B", "male", "30000");
    Employee e3 = new Employee(3, "X Employee D", "female", "40000");

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getData() {

        List<Employee> lists = new ArrayList<>();
        lists.add(e1);
        lists.add(e2);
        lists.add(e3);
        lists.add(e4);
//        Collections.sort(lists, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o2.getName().compareTo(o1.getName());
//            }
//        });
        return new ResponseEntity<List<Employee>>(lists, HttpStatus.OK);

//        List<String> employeeList = new ArrayList<>();
//        employeeList.add("Mahesh");
//        employeeList.add("Suresh");
//        employeeList.add("kartik");
//        employeeList.add("Abdul");
//        Collections.sort(employeeList);
//        return new ResponseEntity<List>(Collections.singletonList(employeeList),HttpStatus.OK);

    }
}
