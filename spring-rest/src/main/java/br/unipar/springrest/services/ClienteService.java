package br.unipar.springrest.services;


import br.unipar.springrest.domain.Cliente;
import br.unipar.springrest.exceptions.ApiEXception;
import br.unipar.springrest.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public Cliente insert(Cliente cliente) throws ApiEXception {
        ValidarAtributos(cliente);
        cliente =  clienteRepository.save(cliente);



    }

    private void ValidarAtributos(Cliente cliente) throws ApiEXception {

        if (cliente.getNome() == null) {
            throw new ApiEXception("O nome é Obrigatorio");

        }
        if (cliente.getNome().length() <= 60) {

            throw new ApiEXception("O tamanho do nome deve" +
                    "ser menor do que 60 caracteres");

        }
        if (cliente.getNome().length() < 10) {

            throw new ApiEXception("O tamanho do nome deve ser" +
                    "maior do que 10 caracteres");

        }
        if (cliente.getNome().isEmpty()) {

            throw new ApiEXception("O nome é Obrigatorio");

        }


//    public void emitirMensagem(){
//        System.out.println("Mensagem recebida");
//    }
//
//    public void insertMsg(){
//        System.out.println("Insert");
//    }
//
//    public void deleteMsg(){
//        System.out.println("Delete");
//    }
//
//    public void updateMsg(){
//        System.out.println("Update");
//    }
//
//    public void findAllMsg(){
//        System.out.println("findAll");
    }
}


