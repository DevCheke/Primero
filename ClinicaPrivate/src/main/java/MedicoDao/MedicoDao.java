package MedicoDao;

import Entidad.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MedicoDao extends JpaRepository<MedicoEntity, Integer> {

}
