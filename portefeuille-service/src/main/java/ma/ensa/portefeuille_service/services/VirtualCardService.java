package ma.ensa.portefeuille_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.portefeuille_service.entities.Portefeuille;
import ma.ensa.portefeuille_service.entities.VirtualCard;
import ma.ensa.portefeuille_service.repositories.PortefeuilleRepository;
import ma.ensa.portefeuille_service.repositories.VirtualCardRepository;

@Service
public class VirtualCardService {

    @Autowired
    private VirtualCardRepository virtualCardRepository;

    @Autowired
    private PortefeuilleRepository portefeuilleRepository;

    public VirtualCard createVirtualCard(Long portefeuilleId, VirtualCard virtualCard) {
        Portefeuille portefeuille = portefeuilleRepository.findById(portefeuilleId)
                .orElseThrow(() -> new RuntimeException("Portefeuille not found"));
        virtualCard.setPortefeuille(portefeuille);
        return virtualCardRepository.save(virtualCard);
    }
}
