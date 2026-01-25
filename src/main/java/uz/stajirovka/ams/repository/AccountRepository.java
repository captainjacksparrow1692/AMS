package uz.stajirovka.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.stajirovka.ams.entity.AccountEntity;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    Optional<AccountEntity> findByAccountNumber(long accountNumber);
}
