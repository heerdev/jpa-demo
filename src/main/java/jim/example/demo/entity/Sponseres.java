package jim.example.demo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@EntityScan
public class Sponseres {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long sponserId;


}
