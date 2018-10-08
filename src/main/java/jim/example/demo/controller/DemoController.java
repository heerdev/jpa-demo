package jim.example.demo.controller;


import jim.example.demo.entity.Sponseres;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @RequestMapping(value = "/sponsers/list/manager-offer-receipient/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getListofSponsersManagerOfficersReciepent(@PathVariable int id){
        List<Sponseres>  sponseres= new ArrayList<>();
        return new ResponseEntity<>(sponseres, HttpStatus.OK);

    }
}
