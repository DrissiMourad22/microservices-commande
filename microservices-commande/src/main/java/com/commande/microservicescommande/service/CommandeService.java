import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Commande.Commandeservice.model.Commande;
import com.Commande.Commandeservice.repository.CommandeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    public Optional<Commande> getCommandeById(Long id) {
        return commandeRepository.findById(id);
    }

    public Commande createCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    public Commande updateCommande(Long id, Commande updatedCommande) {
        if (commandeRepository.existsById(id)) {
            updatedCommande.setId(id);
            return commandeRepository.save(updatedCommande);
        }
        return null; // Gérer le scénario où la commande n'est pas trouvée
    }

    public void deleteCommande(Long id) {
        commandeRepository.deleteById(id);
    }
}
