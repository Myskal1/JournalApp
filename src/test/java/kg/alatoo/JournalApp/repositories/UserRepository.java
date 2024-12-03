package kg.alatoo.JournalApp.repositories;


import kg.alatoo.JournalApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
