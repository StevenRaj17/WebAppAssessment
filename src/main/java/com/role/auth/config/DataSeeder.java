package com.role.auth.config;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.role.auth.model.Role;
import com.role.auth.repository.RoleRepository;

@Component
public class DataSeeder implements CommandLineRunner {

    private final RoleRepository roleRepository;

    public DataSeeder(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
     
        if (roleRepository.count() == 0) {
            
        	Role userRole = new Role();
            userRole.setId(1);
            userRole.setRole("user");
            roleRepository.save(userRole);

        	Role adminRole = new Role();
            adminRole.setId(2);
            adminRole.setRole("admin");
            roleRepository.save(adminRole);
          
        }
    }
}