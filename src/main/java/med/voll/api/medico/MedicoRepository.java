package med.voll.api.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

//repositorio
public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findByActivoTrue(Pageable paginacion);

}
