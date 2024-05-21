package br.unipar.springrest.controllers;

import br.unipar.springrest.domain.Cliente;
import br.unipar.springrest.exceptions.ApiEXception;
import br.unipar.springrest.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {


    @Autowired
    private ClienteService clienteService;



    @GetMapping("/insert")
    public String insert(@RequestBody Cliente cliente )  throws ApiEXception {
        clienteService.insert(cliente);

        return "Insert";
    }

//    @GetMapping("/delete")
//    public String delete() {
//        clienteService.deleteMsg();
//
//        return "Delete";
//    }
//
//    @GetMapping("/update")
//    public String update() {
//        clienteService.updateMsg();
//
//        return "Update";
//    }
//
//    @GetMapping("/findAll")
//    public String findAll() {
//        clienteService.findAllMsg();
//
//        return "findAll";
//    }
}



