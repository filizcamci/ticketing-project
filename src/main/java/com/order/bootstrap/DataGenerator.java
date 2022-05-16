package com.order.bootstrap;

//import com.order.dto.RoleDTO;
//import com.order.dto.UserDTO;
//import com.order.enums.Gender;
//import com.order.implementation.RoleServiceImpl;
//import com.order.service.RoleService;
//import com.order.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;

//@Component
//public class DataGenerator implements CommandLineRunner {
//
//    RoleService roleService;
//    UserService userService;
//
//    @Autowired
//    public DataGenerator(RoleService roleService, UserService userService) {
//        this.roleService = roleService;
//        this.userService = userService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        RoleDTO adminRole = new RoleDTO(1L,"Admin");
//        RoleDTO managerRole = new RoleDTO(2L,"Manager");
//        RoleDTO employeeRole = new RoleDTO(3L,"Employee");
//
//        roleService.save(adminRole);
//        roleService.save(managerRole);
//        roleService.save(employeeRole);
//
//        UserDTO user1 = new UserDTO("John", "Kesy",
//                "admin@order.com", "abc", true, "7459684532", adminRole, Gender.MALE);
//        UserDTO user5 = new UserDTO("John", "Kesy",
//                "admin2@order.com", "abc", true, "7459684532", adminRole, Gender.MALE);
//        UserDTO user2 = new UserDTO("Delisa",
//                "Norre", "T001@order.com", "123", true, "8567412358", managerRole, Gender.FEMALE);
//        UserDTO user3 = new UserDTO("Craig", "Jark",
//                "P001@order.com", "123", true, "7777775566", employeeRole, Gender.MALE);
//        UserDTO user4 = new UserDTO("Shaun",
//                "Hayns", "S001@order.com", "123", true, "3256987412", employeeRole, Gender.MALE);
//
//        userService.save(user1);
//        userService.save(user2);
//        userService.save(user3);
//        userService.save(user4);
//        userService.save(user5);
//
//
//
//
//    }
//}
