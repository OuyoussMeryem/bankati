package ma.ensa.portefeuille_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.portefeuille_service.entities.VirtualCard;
import ma.ensa.portefeuille_service.services.VirtualCardService;

@RestController
@RequestMapping("/api/virtualcards")
public class VirtualCardController {

    @Autowired
    private VirtualCardService virtualCardService;

    @PostMapping("/{portefeuilleId}")
    public ResponseEntity<VirtualCard> createVirtualCard(@PathVariable Long portefeuilleId, @RequestBody VirtualCard virtualCard) {
        return ResponseEntity.ok(virtualCardService.createVirtualCard(portefeuilleId, virtualCard));
    }
}
