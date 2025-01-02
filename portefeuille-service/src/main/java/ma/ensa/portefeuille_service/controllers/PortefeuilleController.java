package ma.ensa.portefeuille_service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.portefeuille_service.entities.Portefeuille;
import ma.ensa.portefeuille_service.services.PortefeuilleService;

@RestController
@RequestMapping("/api/portefeuilles")
public class PortefeuilleController {

    @Autowired
    private PortefeuilleService portefeuilleService;

    @PostMapping
    public ResponseEntity<Portefeuille> createPortefeuille(@RequestBody Portefeuille portefeuille) {
        return ResponseEntity.ok(portefeuilleService.createPortefeuille(portefeuille));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Portefeuille> getPortefeuille(@PathVariable Long id) {
        return ResponseEntity.ok(portefeuilleService.getPortefeuille(id));
    }

    @GetMapping
    public ResponseEntity<List<Portefeuille>> getAllPortefeuilles() {
        return ResponseEntity.ok(portefeuilleService.getAllPortefeuilles());
    }
}
