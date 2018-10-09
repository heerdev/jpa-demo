package jim.example.demo.controller;


import jim.example.demo.entity.Candidates;
import jim.example.demo.entity.CaseStatus;
import jim.example.demo.entity.SponsersRoles;
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

    @RequestMapping(value = "/list/manager-offer-receipient/sponser/{sponserId}", method = RequestMethod.GET)
    public ResponseEntity<?> getListofSponsersManagerOfficersReciepent(@PathVariable int sponserId){
        List<SponsersRoles>  sponseresRole= new ArrayList<>();
        return new ResponseEntity<>(sponseresRole, HttpStatus.OK);

    }


    @RequestMapping(value = "/candidates/sponser/{sponserId}", method = RequestMethod.GET)
    public ResponseEntity<?> getCandidatesForSponser(@PathVariable int sponserId){
        List<Candidates>  candidates= new ArrayList<>();
        return new ResponseEntity<>(candidates, HttpStatus.OK);

    }

    @RequestMapping(value = "/candidates/casestatus/{caseStatusId}", method = RequestMethod.GET)
    public ResponseEntity<?> getCandidatesForCaseStatus(@PathVariable int caseStatusId){
        List<Candidates>  candidates= new ArrayList<>();
        return new ResponseEntity<>(candidates, HttpStatus.OK);

    }

    @RequestMapping(value = "/caseStatus/candidates/{candidateId}", method = RequestMethod.GET)
    public ResponseEntity<?> getStatusWithMxTimeForCandidate(@PathVariable int candidateId){
        CaseStatus caseStatus= new CaseStatus();
        return new ResponseEntity<>(caseStatus, HttpStatus.OK);

    }
}
