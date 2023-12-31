package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Requisicao;
import com.example.demo.repositories.RequisicaoRepository;

@Service
public class HelloService {

    @Autowired
    private RequisicaoRepository requisicaoRepository;

    Integer quantidadeGets = 0;
    Integer quantidadePosts = 0;
    Integer quantidadePuts = 0;
    Integer quantidadeDeletes = 0;

    public Integer quantidadeGets() {
        Requisicao requisicao = requisicaoRepository.getReferenceById(1);
        Integer getsDoBando = requisicao.getGets();
        requisicao.setGets(getsDoBando + 1);
        requisicaoRepository.save(requisicao);
        return requisicao.getGets();
    }

    public Integer quantidadePosts() {
        Requisicao requisicao = requisicaoRepository.getReferenceById(1);
        Integer getsDoBando = requisicao.getPosts();
        requisicao.setPosts(getsDoBando + 1);
        requisicaoRepository.save(requisicao);
        return requisicao.getPosts();
    }

    public Integer quantidadePuts() {
        Requisicao requisicao = requisicaoRepository.getReferenceById(1);
        Integer getsDoBando = requisicao.getPuts();
        requisicao.setPuts(getsDoBando + 1);
        requisicaoRepository.save(requisicao);
        return requisicao.getPuts();
    }

    public Integer quantidadeDeletes() {
        Requisicao requisicao = requisicaoRepository.getReferenceById(1);
        Integer getsDoBando = requisicao.getDeletes();
        requisicao.setDeletes(getsDoBando + 1);
        requisicaoRepository.save(requisicao);
        return requisicao.getDeletes();
    }
}
